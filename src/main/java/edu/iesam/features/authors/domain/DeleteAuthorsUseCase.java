package edu.iesam.features.authors.domain;

public class DeleteAuthorsUseCase {
    private AuthorRepository authorRepository;

    public DeleteAuthorsUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void execute(String authorId) {
        authorRepository.deleteAuthor(authorId);
    }
}
