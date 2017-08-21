package org.lxz.myapplication;

import android.content.Context;

import com.yanyusong.y_divideritemdecoration.Y_Divider;
import com.yanyusong.y_divideritemdecoration.Y_DividerBuilder;
import com.yanyusong.y_divideritemdecoration.Y_DividerItemDecoration;

/**
 * Created by liuxiaozhong on 2017/8/21.
 */

public class ColorLine extends Y_DividerItemDecoration {
    MAdapter adapter;
    public ColorLine(Context context,MAdapter adapter) {
        super(context);
        this.adapter=adapter;
    }

    @Override
    public Y_Divider getDivider(int itemPosition) {
        Y_Divider divider = null;
        if (adapter.getItem(itemPosition).getType()==1&&itemPosition!=0) {
            //每一行第一个显示rignt和bottom
            divider = new Y_DividerBuilder()
                    .setRightSideLine(true, 0xff999999, 0, 0, 0)
                    .setBottomSideLine(true, 0xff999999, 12, 0, 0)

                    .create();
        }else {
            divider = new Y_DividerBuilder()
                    .create();
        }
        return divider;
    }
}
