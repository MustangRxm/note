package com.example.administrator.drawerlayoutwithactionbar.itemFragment;


import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.drawerlayoutwithactionbar.Adapter.myListAdapter;
import com.example.administrator.drawerlayoutwithactionbar.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class item2 extends Fragment {
    private Toolbar mToolbar;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private List<String> mList;
    ListView mListView;
    View view;
    private FloatingActionButton fab_btn;
    private NestedScrollView mNestedScrollView;
    CoordinatorLayout root ;
    public item2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_item2, container, false);
        root = (CoordinatorLayout) view.findViewById(R.id.root_item2);
        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.srf_item2);
        mListView = (ListView) view.findViewById(R.id.lv_item2);
        mList = new ArrayList();
        for(int i =0;i<20;i++){
            mList.add("list"+i);

        }
        myListAdapter listadapter = new myListAdapter(getContext(),mList);
        mListView.setAdapter(listadapter);

        return  view;
    }

}
