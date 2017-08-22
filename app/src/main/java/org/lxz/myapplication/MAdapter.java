package org.lxz.myapplication;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by liuxiaozhong on 2017/7/18.
 */

public class MAdapter extends BaseMultiItemQuickAdapter<Data, BaseViewHolder> {
    public MAdapter() {
        super(null);
        addItemType(Data.NORMOL, R.layout.lable);
        addItemType(Data.LINE, R.layout.lable_item);

    }

    @Override
    protected void convert(final BaseViewHolder helper, Data item) {
        if (item.getDataType()==3){
            helper.setText(R.id.tv_lable, "");
        }else {
            helper.setBackgroundRes(R.id.tv, R.drawable.e);
        }
    }

}
