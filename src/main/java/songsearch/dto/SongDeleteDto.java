package songsearch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SongDeleteDto {

    private final Integer songId;

    public SongDeleteDto(@JsonProperty("song_id") Integer songId) {
        this.songId = songId;
    }
}
