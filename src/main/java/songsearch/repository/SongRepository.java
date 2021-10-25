package songsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import songsearch.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

}
