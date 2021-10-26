package songsearch.dto;

import lombok.Getter;

@Getter
public class SongDto {

    private final Integer id;

    private final String title;

    private final Integer artist_id;

    private final Integer genre_id;

    public SongDto(Integer id,
                   String title,
                   Integer artist_id,
                   Integer genre_id) {
        this.id = id;
        this.title = title;
        this.artist_id = artist_id;
        this.genre_id = genre_id;
    }
}
