package com.example.music.controller;

import com.example.music.bean.Song;
import com.example.music.service.songService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class songController {
    @Autowired
    songService songService;
    @GetMapping("/song/{id}")
    public Song getSongById(@PathVariable(value = "id") Integer id){
        return songService.getSongById(id);
    }
}
