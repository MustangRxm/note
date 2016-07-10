package com.example.administrator.drawerlayoutwithactionbar.itemFragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.drawerlayoutwithactionbar.Adapter.FragmentWithViewPagerAdapter;
import com.example.administrator.drawerlayoutwithactionbar.R;
import com.example.administrator.drawerlayoutwithactionbar.pageFragment.page1;
import com.example.administrator.drawerlayoutwithactionbar.pageFragment.page2;
import com.example.administrator.drawerlayoutwithactionbar.pageFragment.page3;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class item1 extends Fragment {
    private View view;
    private ViewPager viewPager;
    private TabLayout mTabLayout;
    private ArrayList<String> list_tittle=null;
    private ArrayList<Fragment> list_fragment=null;
    FragmentManager fm;

    public item1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_item1, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.vp_fg_item1);
       mTabLayout = (TabLayout) view.findViewById(R.id.tl_fg_item1);
        list_fragment=new ArrayList<>();
        list_tittle=new ArrayList<>();
        list_fragment.add(new page1());
        list_fragment.add(new page2());
        list_fragment.add(new page3());
        for (int i=1;i<4;i++){
            list_tittle.add("tittle"+i);

        }

        fm = getFragmentManager();
//        FragmentStatePagerAdapter 是PagerAdapter的一个子类
        FragmentWithViewPagerAdapter fwp = new FragmentWithViewPagerAdapter(fm,list_fragment,list_tittle);
        viewPager.setAdapter(fwp);
        mTabLayout.setupWithViewPager(viewPager);
//        mTabLayout.setTabsFromPagerAdapter();

        return view;
    }

}
