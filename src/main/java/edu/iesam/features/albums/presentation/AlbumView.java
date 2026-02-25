package edu.iesam.features.albums.presentation;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.GetAlbumsUseCase;

import java.util.ArrayList;

public class AlbumView {

    public static void printAlbums() {
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(
                        new AlbumMemLocalDataSource()));

        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }

}
