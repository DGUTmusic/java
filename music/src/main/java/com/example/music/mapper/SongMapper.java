package com.example.music.mapper;

import com.example.music.bean.Song;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SongMapper {
    public Song getSongById(Integer songID);
    public List<Song> getSongByName(String songName);
    public List<Song> getSongBySinger(String singer);
}
