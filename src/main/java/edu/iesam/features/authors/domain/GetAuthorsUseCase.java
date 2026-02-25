package edu.iesam.features.authors.domain;

import java.util.ArrayList;

public class GetAuthorsUseCase {

    private AuthorRepository authorRepository;


    public GetAuthorsUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public ArrayList<Author> execute() {
        return authorRepository.getAuthors();
    }

}
