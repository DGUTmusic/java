package com.example.music.bean;

public class songListDetail {
    private Integer songListID;
    private Integer songID;

    public Integer getSongListID() {
        return songListID;
    }

    public void setSongListID(Integer songListID) {
        this.songListID = songListID;
    }

    public Integer getSongID() {
        return songID;
    }

    public void setSongID(Integer songID) {
        this.songID = songID;
    }

    @Override
    public String toString() {
        return "songListDetail{" +
                "songListID=" + songListID +
                ", songID=" + songID +
                '}';
    }
}
