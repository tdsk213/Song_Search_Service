package songsearch.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class SongDto {

    private final Integer id;

    private final String title;

    private final String artist;

    public SongDto(Integer id,
                   String title,
                   String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }
}
