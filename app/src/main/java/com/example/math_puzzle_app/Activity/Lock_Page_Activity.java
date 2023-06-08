package com.example.math_puzzle_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.math_puzzle_app.Adapter.Lock_Adapter;
import com.example.math_puzzle_app.Config;
import com.example.math_puzzle_app.R;

public class Lock_Page_Activity extends AppCompatActivity {
    GridView gridView;
    ImageView lock;
   Lock_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_page);
        gridView=findViewById(R.id.gridview);



      adapter=new Lock_Adapter(Lock_Page_Activity.this,R.drawable.lock);
      gridView.setAdapter(adapter);


    }

}