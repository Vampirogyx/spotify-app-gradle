package edu.iesam.features.albums.presentation;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.DeleteAlbumsUseCase;
import edu.iesam.features.albums.domain.GetAlbumsUseCase;
import edu.iesam.features.albums.domain.SaveAlbumsUseCase;

import java.util.ArrayList;

public class AlbumView {

    public static void printAlbums() {
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(AlbumMemLocalDataSource.newInstance()));

        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }

    public static void saveAlbums() {
        Album newAlbum = new Album("2", "song1", "2007");
        SaveAlbumsUseCase saveAlbumsUseCase = new SaveAlbumsUseCase(
                new AlbumDataRepository(AlbumMemLocalDataSource.newInstance()));

        saveAlbumsUseCase.execute(newAlbum);
    }

    public static void deleteAlbum(String albumId) {
        DeleteAlbumsUseCase deleteAlbumUseCase = new DeleteAlbumsUseCase(
                new AlbumDataRepository(AlbumMemLocalDataSource.newInstance()));

        deleteAlbumUseCase.execute(albumId);
    }
}
