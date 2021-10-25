package songsearch.service.mapper;

import org.springframework.stereotype.Component;
import songsearch.dto.SongDto;
import songsearch.entity.Song;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SongMapper {

    public SongDto mapSongToSongDto(Song model) {
        return new SongDto(
                model.getSongId(),
                model.getTitle(),
                model.getArtistId(),
                model.getGenreId()
        );
    }

    public List<SongDto> mapSongToSongDto(Collection<Song> model) {
        return model.stream()
                .map(this::mapSongToSongDto)
                .collect(Collectors.toList());
    }
}
