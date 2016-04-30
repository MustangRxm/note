package com.example.mai.spinner01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private String[] str;
    private ArrayList<Domain> mList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDate();
    }

    class ViewHolder {
        ImageView leftview = null;
        ImageView rightview = null;
        TextView mTextView = null;
    }

    private void initDate() {
        mList = new ArrayList<Domain>();
        str = getResources().getStringArray(R.array.ArrSpinner);
        int count = str.length;
        for (int i = 0; i < count; i++) {
            mList.add(new Domain(R.mipmap.ic_launcher, R.mipmap.ic_launcher));
        }
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(new MyAdapter());//SpinnerAdapter的直接子类是BaseAdapter和ArrayAdapter等
    }

    class MyAdapter extends BaseAdapter {
        ViewHolder mViewHolder = null;

        @Override
        public int getCount() {

            return mList.size() != 0 ? mList.size() : 0;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                mViewHolder = new ViewHolder();
                convertView = View.inflate(MainActivity.this, R.layout.spinner_item, null);
                mViewHolder.leftview = (ImageView) convertView.findViewById(R.id.iv_spinner_left_pic);
                mViewHolder.rightview = (ImageView) convertView.findViewById(R.id.iv_spinner_right_pic);
                mViewHolder.mTextView = (TextView) convertView.findViewById(R.id.tv_tittle);
            }
            Domain domain = mList.get(position);
            mViewHolder.leftview.setImageResource(domain.getLeftpic());
            mViewHolder.rightview.setImageResource(domain.getRightpic());
            mViewHolder.mTextView.setText(str[position]);
            convertView.setTag(mViewHolder);
            return convertView;
        }
    }
}