package org.lxz.myapplication;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by liuxiaozhong on 2017/7/18.
 */

public class MAdapter extends BaseQuickAdapter<Data, BaseViewHolder> {
    public static final int TYPE_1 = 0;
    public static final int TYPE_2 = 1;
    public MAdapter() {
        super(R.layout.lable);

    }

    @Override
    protected void convert(final BaseViewHolder helper, Data item) {
        helper.setBackgroundRes(R.id.tv, R.drawable.e);
    }

    @Override
    public int getItemViewType(int position) {
        if (getItem(position).getType()==1){
            return TYPE_2;
        }else {
            return TYPE_1;
        }
    }
}
