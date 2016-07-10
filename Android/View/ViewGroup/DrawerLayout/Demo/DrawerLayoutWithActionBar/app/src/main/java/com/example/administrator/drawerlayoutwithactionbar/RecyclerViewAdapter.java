package com.example.administrator.drawerlayoutwithactionbar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author Jack
 * @time 2016/5/5 0005 2:39
 * @des TODO
 */
class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> implements View.OnClickListener {
    private MainActivity mMainActivity;
    private List<ItemDomain>  mList;
    private OnRecyclerViewItemClickListener mOnRecyclerViewItemClickListener=null;


    public RecyclerViewAdapter(MainActivity mainActivity, List<ItemDomain> list) {
        mMainActivity = mainActivity;
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //               View view = View.inflate(getApplicationContext(),R.layout.rv_item,parent);
        View view = LayoutInflater.from(mMainActivity).inflate(R.layout.rv_item, parent, false);
        view.setOnClickListener(this);
        ViewHolder v = new ViewHolder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ItemDomain itemDomain = mList.get(position);
        holder.getView().setTag(position);
        holder.getIv().setImageResource(itemDomain.getImageView());
        holder.getTv().setText(itemDomain.getTextView());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public void onClick(View view) {
        if (mOnRecyclerViewItemClickListener!=null){
            mOnRecyclerViewItemClickListener.onItemClick(view, (Integer) view.getTag());
        }

    }
    public static interface OnRecyclerViewItemClickListener{
        void onItemClick(View view, int position);
    }
    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener){
        mOnRecyclerViewItemClickListener=listener;
    }
}

