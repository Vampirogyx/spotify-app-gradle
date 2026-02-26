package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    private static AuthorMemLocalDataSource instance = null;

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

    public void save(Author author) {
        authorsMemStorage.add(author);
    }

    public static AuthorMemLocalDataSource newInstance(){
        if (instance == null){
            instance = new AuthorMemLocalDataSource();
        }

        return instance;
    }

    public void delete(String authorId) {
        authorsMemStorage.removeIf(author -> author.getId().equals(authorId));
    }
}
