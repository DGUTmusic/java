package com.example.music.mapper;

import com.example.music.bean.Song;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SongMapper {
    public Song getSongById(Integer songID);
}
