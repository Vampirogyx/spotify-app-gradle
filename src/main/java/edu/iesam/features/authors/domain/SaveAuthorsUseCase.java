package edu.iesam.features.authors.domain;

public class SaveAuthorsUseCase {

    AuthorRepository authorRepository;

    public SaveAuthorsUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void execute(Author author) {
        authorRepository.saveAuthor(author);
    }

}
