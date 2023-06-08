package com.example.math_puzzle_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.math_puzzle_app.Config;
import com.example.math_puzzle_app.R;

public class Level_board_Activity extends AppCompatActivity {
    ImageView skip,hint,game_board,delete;
    TextView level_display,submit,n1,n2,n3,n4,n5,n6,n7,n8,n9,n0;
    EditText ans_text;
    int levelno;
    String ans="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_board);
        skip=findViewById(R.id.skip);
        hint=findViewById(R.id.hint);
        game_board=findViewById(R.id.game_board);
        delete=findViewById(R.id.delete);
        level_display=findViewById(R.id.level_display);
        submit=findViewById(R.id.submit);
        ans_text=findViewById(R.id.ans_text);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        n3=findViewById(R.id.n3);
        n4=findViewById(R.id.n4);
        n5=findViewById(R.id.n5);
        n6=findViewById(R.id.n6);
        n7=findViewById(R.id.n7);
        n8=findViewById(R.id.n8);
        n9=findViewById(R.id.n9);
        n0=findViewById(R.id.n0);


          levelno=getIntent().getIntExtra("level",0);
         level_display.setText("LEVEL"+(levelno+1));
         game_board.setImageResource(Config.imgArr[levelno]);


         skip.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 levelno++;
                 level_display.setText("level="+(levelno+1));
                 game_board.setImageResource(Config.imgArr[levelno]);
             }
         });
         n1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ans_text.setText("1");
                 ans=ans+1;
                 ans_text.setText(ans);
             }
         });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_text.setText("2");
                ans=ans+2;
                ans_text.setText(ans);
            }
        });
         n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_text.setText("3");
                ans=ans+3;
                ans_text.setText(ans);
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_text.setText("4");
                ans=ans+4;
                ans_text.setText(ans);
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_text.setText("5");
                ans=ans+5;
                ans_text.setText(ans);
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_text.setText("6");
                ans=ans+6;
                ans_text.setText(ans);
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_text.setText("7");
                ans=ans+7;
                ans_text.setText(ans);
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_text.setText("8");
                ans=ans+8;
                ans_text.setText(ans);
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_text.setText("9");
                ans=ans+9;
                ans_text.setText(ans);
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans_text.setText("0");
                ans=ans+0;
                ans_text.setText(ans);
            }
        });

     delete.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             ans=ans.substring(0,ans.length()-1);
             ans_text.setText(ans);
         }
     });


        levelno=getIntent().getIntExtra("level",0);
        level_display.setText("LEVEL"+(levelno+1));
        game_board.setImageResource(Config.imgArr[levelno+1]);


        submit.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             if (Config.AnsArr[levelno].equals(ans_text.getText().toString()))
             {
                 Intent intent=new Intent(Level_board_Activity.this,Win_Page_Activity.class);
                 levelno++;
                 intent.putExtra("level",levelno);
                 startActivity(intent);
                 finish();
             }
             else
             {
                 Toast.makeText(Level_board_Activity.this, "wrong!", Toast.LENGTH_SHORT).show();
             }
         }
     });

    }
}