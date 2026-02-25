package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    private ArrayList<Author> authorsMemStorage = new ArrayList<>();

    public AuthorMemLocalDataSource() {
        initData();
    }

    public void initData() {
        Author author1 = new Author("1", "MemExtremoduro", "01-01-1970", "Española");
        authorsMemStorage.add(author1);

        Author author2 = new Author("2", "MemOasis", "01-01-1980", "Inglesa");
        authorsMemStorage.add(author2);
    }

    public ArrayList<Author> findAll() {
        return authorsMemStorage;
    }


}
