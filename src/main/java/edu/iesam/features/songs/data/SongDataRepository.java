package edu.iesam.features.songs.data;

import edu.iesam.features.songs.domain.Song;
import edu.iesam.features.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {

    @Override
    public ArrayList<Song> findAll() {
        Song song1 = new Song();
        song1 .setId("1");
        song1.setTitle("Macarena");
        song1.setAuthor("Los del Rio");
        song1.setDuration("4:00:00");

        Song song2 = new Song();
        song2.setId("2");
        song2.setTitle("Pollito Pepe");
        song2.setAuthor("Las Ketchup");
        song2.setDuration("3:00:00");

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);

        return songs;
    }

}
