package com.example.music.bean;

import java.util.HashMap;
import java.util.Map;

public class Detail {
    private int state;
    private String message;

    private Map<Object, Object> map;

    public Detail(){
        state = 200;
        message = "成功";
        map = new HashMap<>();
    }

    private void setMap(String song, Song song1) {
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<Object, Object> getMap() {
        return map;
    }

    public void setMap(Map<Object, Object> map) {
        this.map = map;
    }
}
