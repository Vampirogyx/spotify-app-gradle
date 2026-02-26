package edu.iesam.features.songs.domain;

public class SaveSongsUseCase {

    SongRepository songRepository;

    public SaveSongsUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void execute(Song song) {
        songRepository.saveSong(song);
    }

}
