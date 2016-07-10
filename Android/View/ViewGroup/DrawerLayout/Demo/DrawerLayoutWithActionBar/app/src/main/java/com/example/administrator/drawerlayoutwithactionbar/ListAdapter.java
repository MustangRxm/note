package com.example.administrator.drawerlayoutwithactionbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @author Jack
 * @time 2016/5/5 0005 17:00
 * @des TODO
 */
public class ListAdapter extends BaseAdapter {
    private ArrayList<ItemDomain> datasources;
    private Context mContext;
    private int id;
//    private View view;
ListAdapter (Context context, ArrayList datasources, int id){
    mContext=context;
    this.id=id;
    this.datasources = datasources;

}
    @Override
    public int getCount() {
        return datasources.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view==null){
            viewHolder = new ViewHolder();
            view = View.inflate(mContext,id,null);
            viewHolder.iv= (ImageView) view.findViewById(R.id.iv_item);
            viewHolder.tv = (TextView) view.findViewById(R.id.tv_item);
            view.setTag(viewHolder);
        }
        viewHolder= (ViewHolder) view.getTag();
        ItemDomain itemDomain = datasources.get(i);
            viewHolder.tv.setText(itemDomain.getTextView());
        viewHolder.iv.setImageResource(itemDomain.getImageView());
        return view;
    }
    class  ViewHolder{
        TextView tv;
        ImageView iv;
    }

}
