package com.example.music.controller;

import com.example.music.bean.Detail;
import com.example.music.bean.Song;
import com.example.music.service.SongService;
import com.example.music.utils.DetailUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {
    @Autowired
    SongService songService;
    //@Autowired
    //Detail detail;

//    @GetMapping("/song/{id}")
//    public Detail getSongById(@PathVariable(value = "id") Integer id){
//        Song song=SongService.getSongById(id);
//        if(song!=null){
//            detail.setState(200);
//            detail.setMessage("OK");
//            detail.getMap().put("song",song);
//        }else{
//            detail.setState(400);
//            detail.setMessage("不存在这首歌。");
//            detail.getMap().clear();
//        }
//        return detail;
//    }

    @GetMapping("/song/songName")
    public Detail getSongByName(String songName){
        List<Song> songs=songService.getSongByName(songName);
        return DetailUtils.addList(songs);
    }
    @GetMapping("/song/singer")
    public Detail getSongBySinger(String singer){
        List<Song> songs=songService.getSongBySinger(singer);
        return DetailUtils.addList(songs);
    }
    @GetMapping("/song/ranking")
    public Detail getSongByRanking(int pageNum, int pageSize){
        Page<Song> songs=songService.getSongByRanking(pageNum,pageSize);
        Detail detail1= DetailUtils.addPage(songs);
        System.out.println(detail1);
        return detail1;
    }
}
