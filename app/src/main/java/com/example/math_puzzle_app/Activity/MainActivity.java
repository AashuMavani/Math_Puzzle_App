package com.example.math_puzzle_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.math_puzzle_app.Config;
import com.example.math_puzzle_app.R;

public class MainActivity extends AppCompatActivity {
    TextView continue1,puzzle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continue1=findViewById(R.id.continue1);
        puzzle=findViewById(R.id.puzzle);


        continue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Level_board_Activity.class);
                intent.putExtra("level", Config.imgArr);
                startActivity(intent);

            }
        });
        puzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Lock_Page_Activity.class);

                startActivity(intent);
            }
        });

    }
}