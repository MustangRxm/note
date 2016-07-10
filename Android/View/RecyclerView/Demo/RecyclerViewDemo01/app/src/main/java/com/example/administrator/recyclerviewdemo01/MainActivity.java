package com.example.administrator.recyclerviewdemo01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Item> list = null;
    RecyclerViewAdapter rvAdapter;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        rv = (RecyclerView) findViewById(R.id.rv_container);
        /*添加分割线
        * addItemDecoration
        *DividerItemDecoration这个类为RecyclerView.ItemDecoration的实现类
         *  */
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
        rv.setLayoutManager(new LinearLayoutManager(this));
//        rv.setLayoutManager(new GridLayoutManager(this,5));
//        rv.setLayoutManager(new StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS));

        rv.setAdapter(rvAdapter = new RecyclerViewAdapter(this,list));
        rvAdapter.setOnItemClickListener(new RecyclerViewAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Log.i("testmain","position::"+position);
            }
        });
    }

    private void initData() {
        list = new ArrayList<>();
        for (int i=0;i<100;i++) {
            list.add(new Item(R.mipmap.ic_launcher, "test" + i + i));
        }
    }

}
