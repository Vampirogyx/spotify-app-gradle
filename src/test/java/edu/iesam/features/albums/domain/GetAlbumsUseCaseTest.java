package edu.iesam.features.albums.domain;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.mocks.AlbumMockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetAlbumsUseCaseTest {

    public GetAlbumsUseCase getAlbumsUseCase;
    public AlbumMockRepository albumMockRepository;


    @BeforeEach
    void setUp() {
        albumMockRepository = new AlbumMockRepository();
        getAlbumsUseCase = new GetAlbumsUseCase(albumMockRepository);

    }

    @Test
    public void shouldReturnAlbumListWhenExecuteUseCase(){
        //Given: Inicializamos variables

        //When: Ejecuamos el caso de uso
        ArrayList<Album> albums = getAlbumsUseCase.execute();

        //Then: Asserts
        assertEquals(3, albums.size());
        assertEquals("1", albums.get(0).getId());
    }
}