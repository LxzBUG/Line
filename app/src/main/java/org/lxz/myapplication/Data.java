package org.lxz.myapplication;

import java.util.List;

/**
 * Created by liuxiaozhong on 2017/7/18.
 */

public class Data {
    int type=0;
    String name;
    public List<String> list;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
