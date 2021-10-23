package songsearch.controller;


import org.springframework.web.bind.annotation.*;
import songsearch.dto.SongAddDto;
import songsearch.dto.SongDto;
import songsearch.dto.SongEditDto;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/songs")
public class SongController {

    Map<Integer, SongDto> songs = new HashMap<>();
    private Integer id = 1;

    @GetMapping
    public Map<Integer, SongDto> getAllSongs() {
       return songs;
    }

    @PostMapping
    public void addSong(@RequestBody SongAddDto songAddDto) {
        String title = songAddDto.getTitle();
        String artist = songAddDto.getArtist();
        Integer songId = id++;
        songs.put(songId, new SongDto(songId, title, artist));
    }

    @PutMapping("/v1/test/{id}/hdawho")
    public SongDto editSongMeta(@RequestBody SongEditDto songEditDto,
                            @PathVariable("id") Integer songId) {

        SongDto songDto = new SongDto(
                songId,
                songEditDto.getTitle(),
                songEditDto.getArtist());
        songs.replace(songId,  songDto);

        return songDto;
    }

    @DeleteMapping("/v1/test/{id}/hdawho")
    public boolean deleteSong(@PathVariable("id") Integer songId) {
        if (songs.containsKey(songId)) {
            songs.remove(songId);
            return true;
        }
        return false;
    }

}
