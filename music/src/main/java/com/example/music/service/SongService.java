package com.example.music.service;

import com.example.music.bean.Song;
import com.github.pagehelper.Page;

import java.util.List;

public interface SongService {
    public Song getSongById(Integer songID);
    public List<Song> getSongByName(String songName);
    public List<Song> getSongBySinger(String singer);
    public Page<Song> getSongByRanking(int pageNum, int pageSize);
}
