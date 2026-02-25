package edu.iesam.features.authors.domain;

import java.util.ArrayList;

public interface AuthorRepository {

    public ArrayList<Author> getAuthors();
    public void saveAuthor(Author author);

}
