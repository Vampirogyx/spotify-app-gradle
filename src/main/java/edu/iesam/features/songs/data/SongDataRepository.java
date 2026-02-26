package edu.iesam.features.songs.data;

import edu.iesam.features.songs.domain.Song;
import edu.iesam.features.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {

    private SongMemLocalDataSource songMemLocalDataSource;

    public SongDataRepository(SongMemLocalDataSource songMemLocalDataSource) {
        this.songMemLocalDataSource = songMemLocalDataSource;
    }

    @Override
    public ArrayList<Song> getSongs() {
        return songMemLocalDataSource.findAll();
    }

    @Override
    public void saveSong(Song song) {
        songMemLocalDataSource.save(song);
    }

    @Override
    public void deleteSong(String songId) {
        songMemLocalDataSource.delete(songId);
    }
}
