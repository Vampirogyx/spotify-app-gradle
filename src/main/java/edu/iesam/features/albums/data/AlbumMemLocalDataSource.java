package edu.iesam.features.albums.data;

import edu.iesam.features.albums.domain.Album;

import java.util.ArrayList;

public class AlbumMemLocalDataSource {

    private ArrayList<Album> albumsMemStorage = new ArrayList<>();

    public AlbumMemLocalDataSource() {
        initData();
    }

    public void initData() {
        Album album1 = new Album("1", "Yo, minoria absoluta", "2002");
        albumsMemStorage.add(album1);

        Album album2 = new Album("2", "The masterplan", "1998");
        albumsMemStorage.add(album2);
    }

    public ArrayList<Album> findAll() {
        return albumsMemStorage;
    }

}
