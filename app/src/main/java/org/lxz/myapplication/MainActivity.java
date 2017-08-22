package org.lxz.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    List<Data> items=new ArrayList<>();;
    RecyclerView rv;
    MAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv= (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager layout = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        SparseArray<SCommonItemDecoration.ItemDecorationProps> propMap = new SparseArray<>();
        SCommonItemDecoration.ItemDecorationProps prop2 =
                new SCommonItemDecoration.ItemDecorationProps(0, 24, true, true);
        propMap.put(1, prop2);
        rv.addItemDecoration(new SCommonItemDecoration(propMap));

        rv.setLayoutManager(layout);
        adapter=new MAdapter();
        adapter.setSpanSizeLookup(new BaseQuickAdapter.SpanSizeLookup() {
            @Override
            public int getSpanSize(GridLayoutManager gridLayoutManager, int position) {
                int type = adapter.getItem(position).getShowType();
                switch (type) {
                    case 1:
                        return 2;
                    default:
                        return 1;
                }
            }
        });
        rv.setAdapter(adapter);
        adapter.setNewData(getFirstData());
        adapter.addData(getTwoData());
        adapter.addData(getThreeData());
        }




























        public List<Data> getFirstData(){
            List<Data> list=new ArrayList<>();
            for (int i=0;i<10;i++){
                Data data=new Data();
                data.setName("小"+i);
                if (i==0){
                    data.setDataType(1);
                    data.setShowType(1);
                }else if (i==9){
                    data.setDataType(3);
                    data.setShowType(1);
                }else {
                    data.setShowType(0);
                    data.setDataType(1);
                }
                list.add(data);
            }
            return list;

        }
    public List<Data> getTwoData(){
        List<Data> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            Data data=new Data();
            data.setName("小"+i);
            if (i==0){
                data.setDataType(1);
                data.setShowType(1);
            }else if (i==9){
                data.setDataType(3);
                data.setShowType(1);
            }else {
                data.setShowType(0);
                data.setDataType(1);
            }
            list.add(data);
        }
        return list;
    }
    public List<Data> getThreeData(){
        List<Data> list=new ArrayList<>();
        for (int i=0;i<9;i++){
            Data data=new Data();
            data.setName("小"+i);
            if (i==0){
                data.setDataType(1);
                data.setShowType(1);
            }else {
                data.setShowType(0);
                data.setDataType(1);
            }
            list.add(data);
        }
        return list;
    }

}
