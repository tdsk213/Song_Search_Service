package songsearch.service;

import songsearch.dto.SongAddDto;
import songsearch.dto.SongDto;
import songsearch.dto.SongEditDto;

import java.util.List;

public interface SongService {

    List<SongDto> getAllSongs();

    SongDto addSong(SongAddDto noteCreateDto);

    SongDto editSong(Integer songId, SongEditDto songEditDto);

    SongDto deleteSong(Integer songId);

}
