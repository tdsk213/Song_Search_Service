package songsearch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SongAddDto {

    private final String title;

    private final String artist;

    public SongAddDto(@JsonProperty("title") String title, @JsonProperty("artist") String artist) {
        this.title = title;
        this.artist = artist;
    }
}
