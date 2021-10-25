package songsearch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SongEditDto {

    private final String title;
    private final Integer artistId;
    private final Integer genreId;


    public SongEditDto(@JsonProperty("title") String title, @JsonProperty("artist_id") Integer artistId, @JsonProperty("genre_id") Integer genreId) {
        this.title = title;
        this.artistId = artistId;
        this.genreId = genreId;
    }
}
