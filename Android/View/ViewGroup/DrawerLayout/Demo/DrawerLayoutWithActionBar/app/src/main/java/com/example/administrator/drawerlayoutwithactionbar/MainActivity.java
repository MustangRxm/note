package com.example.administrator.drawerlayoutwithactionbar;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.drawerlayoutwithactionbar.itemFragment.item1;
import com.example.administrator.drawerlayoutwithactionbar.itemFragment.item2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    //    private RecyclerViewAdapter adapter;
    private DrawerLayout mDrawerLayout;
    //    private RecyclerView rv;
    private ListView mListView;
    private Toolbar mToolbar;
    private ArrayList<ItemDomain> list = null;
    private String mtittle;
    private FloatingActionButton fab_btn;
    private CoordinatorLayout coo_layout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initData();
        initView();
        initEvent();
    }

    private void initEvent() {
        mListView.setAdapter(new com.example.administrator.drawerlayoutwithactionbar.ListAdapter(this, list, R.layout.list_item));
        mListView.setOnItemClickListener(this);
        /**ActionBarDrawerToggle用来设置DrawerLayout监听事件
         * */
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
       mDrawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();//此句为关键,内置设置向上图标和动画效果
        fab_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(coo_layout, "come out!", Snackbar.LENGTH_LONG).setAction("i know", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    }
                }).show();
            }
        });


    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.tb);
        coo_layout = (CoordinatorLayout) findViewById(R.id.coo_container);
        fab_btn = (FloatingActionButton) findViewById(R.id.fab_btn);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.dl_container);
        mListView = (ListView) findViewById(R.id.lv_list);

        mToolbar.setTitle("fsfs");//对Toolbar的设置，需要在setSupportActionBar之前完成
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this,"click",Toast.LENGTH_LONG).show();
                return true;
            }
        });
        setSupportActionBar(mToolbar);//用来替换系统的actionbar
    }

    private void initData() {
        list = new ArrayList<ItemDomain>();
        list.add(new ItemDomain(R.mipmap.ic_launcher, "test For Fragment"));
        list.add(new ItemDomain(R.mipmap.ic_launcher, "Tablayout with ViewPager"));
        list.add(new ItemDomain(R.mipmap.ic_launcher, "CollapsingToolbarLayout with snackbar"));
        //        for (int i=0;i<5;i++) {
        //            list.add(new ItemDomain(R.mipmap.ic_launcher, "test" + i + i));
        //        }
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Fragment contentFragment;
        Bundle args;
        switch (i) {
            case 0://测试Fragment
                contentFragment = new contentFragment();
                args = new Bundle();
                args.putString("text", list.get(i).getTextView());
                contentFragment.setArguments(args);
                getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, contentFragment).commit();
                break;
            case 1://顶部的Tablayout with ViewPager，带换页滚动
                contentFragment = new item1();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, contentFragment).commit();
                break;
            case 2://cardView in NestedScrollView
                contentFragment = new item2();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, contentFragment).commit();
                break;
        }

        mDrawerLayout.closeDrawer(mListView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu) {
//        return super.onPrepareOptionsMenu(menu);
//    }
}


