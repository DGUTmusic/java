package com.example.music.mapper;

import com.example.music.bean.Song;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SongMapper {
    public Song getSongById(Integer songID);
    public List<Song> getSongByName(String songName);
    public List<Song> getSongBySinger(String singer);
    public List<Song> getSongByRanking();
}
