package edu.iesam.features.songs.domain;

import java.util.ArrayList;

public interface SongRepository {

    public ArrayList<Song> getSongs();
    public void saveSong(Song song);
    public void deleteSong(String songId);
}
