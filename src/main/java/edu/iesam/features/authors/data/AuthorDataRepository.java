package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.Author;
import edu.iesam.features.authors.domain.AuthorRepository;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {

    private AuthorMemLocalDataSource authorMemLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource) {
        this.authorMemLocalDataSource = authorMemLocalDataSource;
    }

    @Override
    public ArrayList<Author> getAuthors() {
        return authorMemLocalDataSource.findAll();
    }

    @Override
    public void saveAuthor(Author author) {
        authorMemLocalDataSource.save(author);
    }

}
