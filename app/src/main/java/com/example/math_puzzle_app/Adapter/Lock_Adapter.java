package com.example.math_puzzle_app.Adapter;

import static com.example.math_puzzle_app.Activity.MainActivity.*;
import static com.example.math_puzzle_app.R.drawable.*;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.math_puzzle_app.Activity.Lock_Page_Activity;
import com.example.math_puzzle_app.Activity.MainActivity;
import com.example.math_puzzle_app.Config;
import com.example.math_puzzle_app.R;

import java.util.prefs.Preferences;

public class Lock_Adapter extends BaseAdapter {
      Lock_Page_Activity lock_page_activity;
      int lock_page_layout;
      int lastlevel;
    public Lock_Adapter(Lock_Page_Activity lock_page_activity, int lock_page_layout) {
        this.lock_page_activity=lock_page_activity;
        this.lock_page_layout=lock_page_layout;
    }



    @Override
    public int getCount() {
        return 48;
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
        ImageView lock=view.findViewById(R.id.lock);
        ImageView tick=view.findViewById(R.id.tick);
        TextView leveltext=view.findViewById(R.id.levelText);

        lastlevel= preferences.getInt("lastlevel",-1);
        String LevelStatus= preferences.getString("LevelStatus"+(position+1),"pending");


        if (LevelStatus.equals("win"))
        {
            tick.setImageResource(R.drawable.tick);
            tick.setVisibility(View.VISIBLE);

            leveltext.setText(""+(position+1));
            leveltext.setVisibility(View.VISIBLE);
            lock.setVisibility(View.GONE);
        }
        if (LevelStatus.equals("skip")||position==lastlevel+1)
        {
            tick.setImageResource(0);
            leveltext.setText(""+(position+1));
            leveltext.setVisibility(View.VISIBLE);
            lock.setVisibility(View.GONE);
        }

        return view;
    }
}
