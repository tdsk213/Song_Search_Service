package songsearch.controller;


import org.springframework.web.bind.annotation.*;
import songsearch.dto.SongAddDto;
import songsearch.dto.SongDto;
import songsearch.dto.SongEditDto;
import songsearch.service.SongService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<SongDto> getAllSongs() {
       return songService.getAllSongs();
    }

    @PostMapping
    public SongDto addSong(@RequestBody SongAddDto songAddDto) {
        return songService.addSong(songAddDto);

    }

    @PutMapping("/v1/test/{id}/hdawho")
    public SongDto editSongMeta(@RequestBody SongEditDto songEditDto,
                            @PathVariable("id") Integer songId) {

        return songService.editSong(songId, songEditDto);
    }

    @DeleteMapping("/v1/test/{id}/hdawho")
    public SongDto deleteSong(@PathVariable("id") Integer songId) {

        return songService.deleteSong(songId);
    }

}
