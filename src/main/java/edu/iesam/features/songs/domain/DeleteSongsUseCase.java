package edu.iesam.features.songs.domain;

public class DeleteSongsUseCase {

    private SongRepository songRepository;

    public DeleteSongsUseCase(SongRepository authorRepository) {
        this.songRepository = songRepository;
    }

    public void execute(String songId) {
        songRepository.deleteSong(songId);
    }
}
