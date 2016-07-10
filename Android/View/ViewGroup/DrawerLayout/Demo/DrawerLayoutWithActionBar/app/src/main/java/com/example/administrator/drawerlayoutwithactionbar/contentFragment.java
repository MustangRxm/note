package com.example.administrator.drawerlayoutwithactionbar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class contentFragment extends Fragment {

private TextView tv;

    public contentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.contentfragment, container, false);
        tv = (TextView) view.findViewById(R.id.tv_fg_item);
       Bundle args = getArguments();
        String str = args.getString("text");
        tv.setText(str);
        return view;
    }

}
