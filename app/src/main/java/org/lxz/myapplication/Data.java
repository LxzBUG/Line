package org.lxz.myapplication;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by liuxiaozhong on 2017/7/18.
 */

public class Data implements MultiItemEntity{
    public static final int NORMOL = 1;
    public static final int LINE = 3;

    int DataType;
    int ShowType;
    String name;

    public int getDataType() {
        return DataType;
    }

    public void setDataType(int dataType) {
        DataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShowType() {
        return ShowType;
    }

    public void setShowType(int showType) {
        ShowType = showType;
    }

    @Override
    public int getItemType() {
        return getDataType();
    }
}
