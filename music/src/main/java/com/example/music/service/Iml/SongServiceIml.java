package com.example.music.service.Iml;

import com.example.music.bean.Song;
import com.example.music.mapper.SongMapper;
import com.example.music.service.SongService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceIml implements SongService {

    @Autowired
    SongMapper songMapper;
    @Override
    //使用redis缓存
    @Cacheable(cacheNames = "song", unless = "#result == null ")
    public Song getSongById(Integer songID) {
        return songMapper.getSongById(songID);
    }

    @Cacheable(cacheNames = "song", unless = "#result == null ")
    public List<Song> getSongByName(String songName) {
        return songMapper.getSongByName(songName);
    }

    @Cacheable(cacheNames = "song", unless = "#result == null ")
    public List<Song> getSongBySinger(String singer) {
        return songMapper.getSongBySinger(singer);
    }

    @Override
    @Cacheable(cacheNames = "song", unless = "#result == null ")
    public Page<Song> getSongByRanking(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Song> list=songMapper.getSongByRanking();
        Page<Song> page=(Page<Song>) list;
        System.out.println(page);
        return page;
    }
}
