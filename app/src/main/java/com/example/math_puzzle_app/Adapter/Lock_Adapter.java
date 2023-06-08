package com.example.math_puzzle_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.math_puzzle_app.Activity.Lock_Page_Activity;
import com.example.math_puzzle_app.Config;
import com.example.math_puzzle_app.R;

public class Lock_Adapter extends BaseAdapter {
      Lock_Page_Activity lock_page_activity;
      int lock_page;
    public Lock_Adapter(Lock_Page_Activity lock_page_activity, int lock_img) {
        this.lock_page_activity=lock_page_activity;
        this.lock_page=lock_img;
    }

    @Override
    public int getCount() {
        return 24;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view=LayoutInflater.from(lock_page_activity).inflate(R.layout.lock_page_layout,parent,false);
        ImageView imageView=view.findViewById(R.id.lock);

        imageView.setImageDrawable(R.drawable.lock[position]);
        return view;
    }
}
