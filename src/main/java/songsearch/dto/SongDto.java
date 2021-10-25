package songsearch.dto;

import lombok.Getter;

@Getter
public class SongDto {

    private final Integer songId;

    private final String title;

    private final Integer artistId;

    private final Integer genreId;

    public SongDto(Integer songId,
                   String title,
                   Integer artistId,
                   Integer genreId) {
        this.songId = songId;
        this.title = title;
        this.artistId = artistId;
        this.genreId = genreId;
    }
}
