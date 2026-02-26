package edu.iesam.features.albums.domain;

public class SaveAlbumsUseCase {

    AlbumRepository albumRepository;

    public SaveAlbumsUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void execute(Album album) {
        albumRepository.saveAlbum(album);
    }

}
