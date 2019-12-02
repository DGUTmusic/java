package com.example.music.service;

import com.example.music.bean.Song;

import java.util.List;

public interface songService {
    public Song getSongById(Integer songID);
    public List<Song> getSongByName(String songName);
    public List<Song> getSongBySinger(String singer);
}
