package edu.iesam.features.authors.presentation;

import edu.iesam.features.authors.data.AuthorDataRepository;
import edu.iesam.features.authors.data.AuthorMemLocalDataSource;
import edu.iesam.features.authors.domain.Author;
import edu.iesam.features.authors.domain.GetAuthorsUseCase;
import edu.iesam.features.authors.domain.SaveAuthorsUseCase;


import java.util.ArrayList;

public class AuthorView {

    public static void printAuthors() {
        GetAuthorsUseCase getAuthorsUseCase = new GetAuthorsUseCase(
                new AuthorDataRepository(
                        new AuthorMemLocalDataSource()));

        ArrayList<Author> authors = getAuthorsUseCase.execute();
        System.out.println(authors);
    }

    public static void saveAuthors() {
        Author newAuthor = new Author("2", "name2", "2000", "España");
        SaveAuthorsUseCase saveAuthorsUseCase = new SaveAuthorsUseCase(
                new AuthorDataRepository(AuthorMemLocalDataSource.newInstance()));

        saveAuthorsUseCase.execute(newAuthor);
    }

}
