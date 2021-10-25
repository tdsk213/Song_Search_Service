package songsearch.service.impl;

import org.springframework.stereotype.Service;
import songsearch.dto.SongAddDto;
import songsearch.dto.SongDto;
import songsearch.dto.SongEditDto;
import songsearch.entity.Song;
import songsearch.repository.SongRepository;
import songsearch.service.SongService;
import songsearch.service.factory.SongFactory;
import songsearch.service.mapper.SongMapper;

import java.util.List;

@Service
public class JpaSongService implements SongService {

    private final SongRepository songRepository;
    private final SongMapper songMapper;
    private final SongFactory songFactory;

    public JpaSongService(SongRepository songRepository,
                          SongMapper songMapper,
                          SongFactory songFactory) {
        this.songRepository = songRepository;
        this.songMapper = songMapper;
        this.songFactory = songFactory;
    }

    @Override
    public List<SongDto> getAllSongs() {
        List<Song> songs = songRepository.findAll();
        return songMapper.mapSongToSongDto(songs);
    }

    @Override
    public SongDto addSong(SongAddDto songCreateDto) {
        Song song = songFactory.build(
                songCreateDto.getTitle(),
                songCreateDto.getArtistId(),
                songCreateDto.getGenreId()
                // todo когда-нибудь нужно прописать реального инициатора создания заметки.
        );

        song = songRepository.saveAndFlush(song);

        return songMapper.mapSongToSongDto(song);
    }

    @Override
    public SongDto editSong(Integer songId, SongEditDto songEditDto) {
        Song song = songRepository.findById(songId).orElseThrow();

        song.setTitle(songEditDto.getTitle());
        //todo other setters

        songRepository.saveAndFlush(song);

        return songMapper.mapSongToSongDto(song);
    }

    @Override
    public SongDto deleteSong(Integer songId) {
        Song song = songRepository.findById(songId).orElseThrow();
        songRepository.delete(song);
        return songMapper.mapSongToSongDto(song);
    }
}
