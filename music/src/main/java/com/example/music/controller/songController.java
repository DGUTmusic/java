package com.example.music.controller;

import com.example.music.bean.Detail;
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
    @Autowired
    Detail detail;

    @GetMapping("/song/{id}")
    public Detail getSongById(@PathVariable(value = "id") Integer id){
        Song song=songService.getSongById(id);
        if(song!=null){
            detail.setState(200);
            detail.setMessage("OK");
            detail.getMap().put("song",song);
        }else{
            detail.setState(400);
            detail.setMessage("不存在这首歌。");
            detail.getMap().clear();
        }
        return detail;
    }
}
