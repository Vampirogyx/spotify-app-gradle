package edu.iesam.features.albums.domain;


import java.util.ArrayList;

public class GetAlbumsUseCase {

    private AlbumRepository albumRepository;


    public GetAlbumsUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public ArrayList<Album> execute() {
        return albumRepository.getAlbums();
    }

}
