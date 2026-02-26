package edu.iesam.features.songs.domain;

import java.util.ArrayList;

public class GetSongsUseCase {

    private SongRepository songRepository;

    public GetSongsUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public ArrayList<Song> execute() {
        return songRepository.getSongs();
    }

}
