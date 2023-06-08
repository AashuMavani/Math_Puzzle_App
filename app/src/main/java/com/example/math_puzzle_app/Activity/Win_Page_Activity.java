package com.example.math_puzzle_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.math_puzzle_app.R;

public class Win_Page_Activity extends AppCompatActivity {
    TextView level_copmlete,continue2,main_menu;
    ImageView share;
    int levelno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_page);

        level_copmlete=findViewById(R.id.level_complete);
        continue2=findViewById(R.id.continue2);
        main_menu=findViewById(R.id.main_menu);
        share=findViewById(R.id.share);

        levelno=getIntent().getIntExtra("level",0);

        level_copmlete.setText("PUZZLE"+ levelno +" COMPLETED");


        continue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Win_Page_Activity.this,Level_board_Activity.class);
                intent.putExtra("level",levelno);
                startActivity(intent);
                finish();
            }
        });
    }
}