package com.example.music.bean;

public class songListCollection {
    private Integer songListID;
    private Integer collectionUserID;

    public Integer getSongListID() {
        return songListID;
    }

    public void setSongListID(Integer songListID) {
        this.songListID = songListID;
    }

    public Integer getCollectionUserID() {
        return collectionUserID;
    }

    public void setCollectionUserID(Integer collectionUserID) {
        this.collectionUserID = collectionUserID;
    }

    @Override
    public String toString() {
        return "songListCollection{" +
                "songListID=" + songListID +
                ", collectionUserID=" + collectionUserID +
                '}';
    }
}
