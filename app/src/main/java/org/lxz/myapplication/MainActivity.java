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
    List<Data> items;
    RecyclerView rv;
    MAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv= (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager layout = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        int verticalSpace = 24;
        SparseArray<SCommonItemDecoration.ItemDecorationProps> propMap = new SparseArray<>();
        SCommonItemDecoration.ItemDecorationProps prop1 =
                new SCommonItemDecoration.ItemDecorationProps(0,24, true, true);
        propMap.put(0, prop1);
        SCommonItemDecoration.ItemDecorationProps prop2 =
                new SCommonItemDecoration.ItemDecorationProps(0, 24, true, true);
        propMap.put(1, prop2);
        rv.addItemDecoration(new SCommonItemDecoration(propMap));

        rv.setLayoutManager(layout);
        adapter=new MAdapter();
        rv.addItemDecoration(new ColorLine(this,adapter));
        adapter.setSpanSizeLookup(new BaseQuickAdapter.SpanSizeLookup() {
            @Override
            public int getSpanSize(GridLayoutManager gridLayoutManager, int position) {
                int type = adapter.getItem(position).getType();
                switch (type) {
                    case 1:
                        return 2;
                    default:
                        return 1;
                }
            }
        });

        rv.setAdapter(adapter);
        items=new ArrayList<>();
        List<Data> firstList=new ArrayList<>();
        Data first=new Data();
        first.setName("小");
        first.setList(null);
        first.setType(1);
        firstList.add(first);
        for (int i=0;i<20;i++){
            Data data=new Data();
            data.setName("小"+i);
            data.setType(0);
            data.setList(null);
            items.add(data);
        }
        adapter.setNewData(firstList);
        adapter.addData(items);
        adapter.addData(getTwo());
        adapter.addData(getMoreData());
        adapter.addData(getTwo());
        adapter.addData(getMoreData());
        }



    public List<Data> getTwo(){
        List<Data> list=new ArrayList<>();
            Data data = new Data();
            data.setName("aa");
            list.add(data);
        data.setType(1);
        return list;
    }
    public List<Data> getMoreData(){
        List<Data> list=new ArrayList<>();
        for (int i=0;i<10;i++) {
            Data data = new Data();
            data.setName("aa"+i);
            data.setType(0);
            list.add(data);
        }
        return list;
    }
}
