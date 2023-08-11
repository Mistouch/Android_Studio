package com.example.my_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int trc=0;
    public void WhoWin()
    {
        Button b1 = findViewById(R.id.B1);
        Button b2 = findViewById(R.id.B2);
        Button b3 = findViewById(R.id.B3);
        Button b4 = findViewById(R.id.B4);
        Button b5 = findViewById(R.id.B5);
        Button b6 = findViewById(R.id.B6);
        Button b7 = findViewById(R.id.B7);
        Button b8 = findViewById(R.id.B8);
        Button b9 = findViewById(R.id.B9);

        String s1= (String) b1.getText();
        String s2= (String) b2.getText();
        String s3= (String) b3.getText();
        String s4= (String) b4.getText();
        String s5= (String) b5.getText();
        String s6= (String) b6.getText();
        String s7= (String) b7.getText();
        String s8= (String) b8.getText();
        String s9= (String) b9.getText();
        TextView txt = findViewById(R.id.win);

        if(s1.equals(s2) && s1.equals(s3)&& !s1.equals(""))
        {
            if(s1.equals("0") )
                txt.setText("Player 2 Wins");
            else
                txt.setText("Player 1 Wins");
        }
        if(s4.equals(s5) && s4.equals(s6)&& !s4.equals(""))
        {
            if(s4.equals("0") )
                txt.setText("Player 2 Wins");
            else
                txt.setText("Player 1 Wins");
        }
        if(s7.equals(s8) && s7.equals(s9)&& !s7.equals(""))
        {
            if(s7.equals("0") )
                txt.setText("Player 2 Wins");
            else
                txt.setText("Player 1 Wins");
        }
        if(s1.equals(s4) && s4.equals(s7)&& !s4.equals(""))
        {
            if(s1.equals("0") )
                txt.setText("Player 2 Wins");
            else
                txt.setText("Player 1 Wins");
        }
        if(s2.equals(s5) && s2.equals(s8)&& !s2.equals(""))
        {
            if(s2.equals("0") )
                txt.setText("Player 2 Wins");
            else
                txt.setText("Player 1 Wins");
        }
        if(s3.equals(s6) && s3.equals(s9)&& !s3.equals(""))
        {
            if(s3.equals("0") )
                txt.setText("Player 2 Wins");
            else
                txt.setText("Player 1 Wins");
        }
        if(s1.equals(s5) && s1.equals(s9)&& !s1.equals(""))
        {
            if(s1.equals("0") )
                txt.setText("Player 2 Wins");
            else
                txt.setText("Player 1 Wins");
        }
        if(s3.equals(s5) && s3.equals(s7)&& !s3.equals(""))
        {
            if(s3.equals("0") )
                txt.setText("Player 2 Wins");
            else
                txt.setText("Player 1 Wins");
        }


    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button b1 = findViewById(R.id.B1);
        Button b2 = findViewById(R.id.B2);
        Button b3 = findViewById(R.id.B3);
        Button b4 = findViewById(R.id.B4);
        Button b5 = findViewById(R.id.B5);
        Button b6 = findViewById(R.id.B6);
        Button b7 = findViewById(R.id.B7);
        Button b8 = findViewById(R.id.B8);
        Button b9 = findViewById(R.id.B9);
        Button res=findViewById(R.id.reset);
        TextView txt = findViewById(R.id.win);
        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              trc++;
              if(trc%2==0)
                  b1.setText("0");
              else
                  b1.setText("X");
             WhoWin();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trc++;
                if(trc%2==0)
                    b2.setText("0");
                else
                    b2.setText("X");
               WhoWin();


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trc++;
                if(trc%2==0)
                    b3.setText("0");
                else
                    b3.setText("X");
               WhoWin();


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trc++;
                if(trc%2==0)
                    b4.setText("0");
                else
                    b4.setText("X");
                WhoWin();


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trc++;
                if(trc%2==0)
                    b5.setText("0");
                else
                    b5.setText("X");
               WhoWin();


            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trc++;
                if(trc%2==0)
                    b6.setText("0");
                else
                    b6.setText("X");
                WhoWin();


            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trc++;
                if(trc%2==0)
                    b7.setText("0");
                else
                    b7.setText("X");
                WhoWin();


            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trc++;
                if(trc%2==0)
                    b8.setText("0");
                else
                    b8.setText("X");
                WhoWin();


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trc++;
                if(trc%2==0)
                    b9.setText("0");
                else
                    b9.setText("X");
              WhoWin();

            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               trc=0;
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                txt.setText("Player 1 and Playe 2 are Playing");

            }
        });
    }


}