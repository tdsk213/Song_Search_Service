package songsearch.service.factory;

import org.springframework.stereotype.Component;
import songsearch.entity.Song;

@Component
public class SongFactory {

    public Song build(String title, Integer artistId, Integer genreId) {
        return new Song(title, artistId, genreId);
    }
}
