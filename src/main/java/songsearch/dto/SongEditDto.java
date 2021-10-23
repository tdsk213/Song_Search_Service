package songsearch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SongEditDto {

    private final String title;
    private final String artist;


    public SongEditDto(@JsonProperty("title") String title, @JsonProperty("artist") String artist) {
        this.title = title;
        this.artist = artist;
    }
}
