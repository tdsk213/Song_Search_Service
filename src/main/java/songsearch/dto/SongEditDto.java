package songsearch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SongEditDto {

    private final String title;
    private final Integer artist_id;
    private final Integer genre_id;


    public SongEditDto(@JsonProperty("title") String title, @JsonProperty("artist_id") Integer artist_id, @JsonProperty("genre_id") Integer genre_id) {
        this.title = title;
        this.artist_id = artist_id;
        this.genre_id = genre_id;
    }
}
