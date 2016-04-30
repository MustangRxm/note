package com.example.mai.viewpager01;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * 此版本实现了无限循环的VIEWPAGER
 *
 *
 *
 */
public class MainActivity extends AppCompatActivity {
    private List<ImageView> list = null;
    private ImageView image;
    private ViewPager vp;
    private LinearLayout point_container;
    private TextView tittle;
    int[] iv_id = {R.mipmap.a01, R.mipmap.a02, R.mipmap.a03, R.mipmap.a04, R.mipmap.a05, R.mipmap.a06};
    String[] name = {"001", "002", "003", "004", "005", "006"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager) findViewById(R.id.viewpager);
        point_container = (LinearLayout) findViewById(R.id.point_container);
        tittle = (TextView) findViewById(R.id.tittle);
        initData();
        initEvent();

        vp.setAdapter(new MyAdapter());
        View v = point_container.getChildAt(1);
        v.setBackgroundResource(R.drawable.choose);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                position = position%list.size();
                tittle.setText(name[position]);
                int count = point_container.getChildCount();

                for (int i = 0; i < count; i++) {
                    View view = point_container.getChildAt(i);
                    if (i == position) {
                        view.setBackgroundResource(R.drawable.choose);
                    } else {
                        view.setBackgroundResource(R.drawable.normal);
                    }
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initData() {
        //        image = (ImageView) findViewById(R.id.image);
        tittle.setText(name[0]);

        list = new ArrayList<ImageView>();
        for (int i = 0; i < iv_id.length; i++) {
            ImageView iv = new ImageView(this);
            iv.setImageResource(iv_id[i]);
            //            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            list.add(iv);
            View view = new View(this);
            view.setBackgroundResource(R.drawable.normal);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(20, 20);
            if (i != 0) {
                lp.leftMargin = 10;
            }
            //            lp.
            point_container.addView(view, lp);

        }
        int middle = Integer.MAX_VALUE / 2;
        int extra = middle % list.size();
        int item = middle - extra;
        vp.setCurrentItem(item);

    }

    private void initEvent() {
    }

    class MyAdapter extends PagerAdapter {

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            position = position%list.size();
            vp.removeView(list.get(position));
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            position = position%list.size();
            image = list.get(position);
            vp.addView(image);
            return image;
        }

        @Override
        public int getCount() {
            if (iv_id != null) {
//                return iv_id.length;
                return Integer.MAX_VALUE;//返回整型数的最大值
            }
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }

}
