package edu.iesam.features.songs.presentation;


import edu.iesam.features.songs.data.SongDataRepository;
import edu.iesam.features.songs.data.SongMemLocalDataSource;
import edu.iesam.features.songs.domain.*;

import java.util.ArrayList;

public class SongView {

    public static void printSongs() {
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository(SongMemLocalDataSource.newInstance()));

        ArrayList<Song> songs= getSongsUseCase.execute();

        System.out.println(songs);
    }

    public static void saveSongs() {
        Song newSong = new Song("2", "song1", "Extremoduro", "4:00");
        SaveSongsUseCase saveSongsUseCase = new SaveSongsUseCase(
                new SongDataRepository(SongMemLocalDataSource.newInstance()));

        saveSongsUseCase.execute(newSong);
    }

    public static void deleteAuthor(String authorId) {
        DeleteSongsUseCase deleteSongsUseCase = new DeleteSongsUseCase(
                new SongDataRepository(SongMemLocalDataSource.newInstance()));
        deleteSongsUseCase.execute(authorId);
    }
}
