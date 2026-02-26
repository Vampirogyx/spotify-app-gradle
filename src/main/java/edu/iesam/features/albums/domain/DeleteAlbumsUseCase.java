package edu.iesam.features.albums.domain;

public class DeleteAlbumsUseCase {
    private AlbumRepository albumsRepository;

    public DeleteAlbumsUseCase(AlbumRepository albumsRepository) {
        this.albumsRepository = albumsRepository;
    }

    public void execute(String albumsId) {
        albumsRepository.deleteAlbum(albumsId);
    }
}
