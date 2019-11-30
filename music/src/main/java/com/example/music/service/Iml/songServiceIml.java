package com.example.music.service.Iml;

import com.example.music.bean.Song;
import com.example.music.mapper.SongMapper;
import com.example.music.service.songService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class songServiceIml implements songService {

    @Autowired
    SongMapper songMapper;
    @Override
    //使用redis缓存
    @Cacheable(cacheNames = "song", unless = "#result == null ")
    public Song getSongById(Integer songID) {
        return songMapper.getSongById(songID);
    }
}
