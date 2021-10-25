package songsearch.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Song {

    //todo fix strange sequence name generated in Postgres
    //todo fix camel notation in json files
    @Id
    @SequenceGenerator(name = "song_id_seq_generator",
            sequenceName = "song_song_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "song_id_seq_generator")
    private Integer songId;

    private String title;

    private Integer artistId;

    private Integer genreId;

    public Song() {
    }

    public Song(String title, Integer aritstId, Integer genreId) {
        this.title = title;
        this.artistId = aritstId;
        this.genreId = genreId;
    }
}

