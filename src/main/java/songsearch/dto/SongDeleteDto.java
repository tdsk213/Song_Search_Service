package songsearch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SongDeleteDto {

    private final Integer id;

    public SongDeleteDto(@JsonProperty("id") Integer id) {
        this.id = id;
    }
}
