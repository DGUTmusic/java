package com.example.music.utils;

import com.example.music.bean.Detail;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class detailUtils {

    public static Detail addList(List list) {
        Detail detail = new Detail();
        if (list.size() != 0) {
            detail.setState(200);
            detail.setMessage("OK");
            detail.getMap().put("list", list);
        } else {
            detail.setState(400);
            detail.setMessage("查询不到相关的数据！");
            //detail.getMap().clear();
        }
        return detail;
    }

    public static Detail addObject(Object object) {
        Detail detail = new Detail();
        if (object!=null) {
            detail.setState(200);
            detail.setMessage("OK");
            detail.getMap().put("object", object);
        } else {
            detail.setState(400);
            detail.setMessage("查询不到相关的数据！");
            //detail.getMap().clear();
        }
        return detail;
    }
}
