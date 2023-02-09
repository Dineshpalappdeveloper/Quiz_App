package com.example.task2;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private LinearLayout q1, q2, q3, Pri1, Pri2, Pri3, ans1, ans2, ans3;
    private ProgressBar p1, p2, p3;
    private boolean a1 = false;
    private boolean a2 = false;
    private boolean a3 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setTitle(" Dinu Quiz ");
        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        p1 = findViewById(R.id.progressBar);
        p2 = findViewById(R.id.progressBar2);
        p3 = findViewById(R.id.progressBar3);
        Pri1 = findViewById(R.id.nextPriview);
        Pri2 = findViewById(R.id.nextPriview2);
        Pri3 = findViewById(R.id.nextPriview3);
        ans1 = findViewById(R.id.answer);
        ans2 = findViewById(R.id.answer2);
        ans3 = findViewById(R.id.answer3);


     // Question1
        ans1.getChildAt(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans1.getChildAt(0).setBackgroundColor(getColor(R.color.g3));
                    ans1.getChildAt(1).setBackgroundColor(getColor(R.color.white));
                    ans1.getChildAt(2).setBackgroundColor(getColor(R.color.white));
                    ans1.getChildAt(3).setBackgroundColor(getColor(R.color.white));
                    a1 = true;
                }
            }
        });
        ans1.getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans1.getChildAt(1).setBackgroundColor(getColor(R.color.g3));
                    ans1.getChildAt(2).setBackgroundColor(getColor(R.color.white));
                    ans1.getChildAt(3).setBackgroundColor(getColor(R.color.white));
                    ans1.getChildAt(0).setBackgroundColor(getColor(R.color.white));
                    a1 = true;
                }
            }
        });
        ans1.getChildAt(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans1.getChildAt(2).setBackgroundColor(getColor(R.color.g3));
                    ans1.getChildAt(0).setBackgroundColor(getColor(R.color.white));
                    ans1.getChildAt(1).setBackgroundColor(getColor(R.color.white));
                    ans1.getChildAt(3).setBackgroundColor(getColor(R.color.white));
                    a1 = true;
                }
            }
        });
        ans1.getChildAt(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans1.getChildAt(3).setBackgroundColor(getColor(R.color.g3));
                    ans1.getChildAt(0).setBackgroundColor(getColor(R.color.white));
                    ans1.getChildAt(1).setBackgroundColor(getColor(R.color.white));
                    ans1.getChildAt(2).setBackgroundColor(getColor(R.color.white));
                    a1 = true;
                }
            }
        });
        Pri1.getChildAt(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pri1.getChildAt(0).animate().translationX(1000);
                Toast.makeText(MainActivity.this, "First Question", Toast.LENGTH_SHORT).show();
            }
        });
        Pri1.getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a1){
                    q1.setVisibility(View.GONE);

                    q2.setVisibility(View.VISIBLE);
                    q3.setVisibility(View.GONE);
                }else {
                    Toast.makeText(MainActivity.this, "Answer Please", Toast.LENGTH_SHORT).show();
                }

            }
        });




        // Question1


        // Question2
        ans2.getChildAt(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans2.getChildAt(0).setBackgroundColor(getColor(R.color.g3));
                    ans2.getChildAt(1).setBackgroundColor(getColor(R.color.white));
                    ans2.getChildAt(2).setBackgroundColor(getColor(R.color.white));
                    ans2.getChildAt(3).setBackgroundColor(getColor(R.color.white));
                    a2 = true;
                }
            }
        });
        ans2.getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans2.getChildAt(1).setBackgroundColor(getColor(R.color.g3));
                    ans2.getChildAt(2).setBackgroundColor(getColor(R.color.white));
                    ans2.getChildAt(3).setBackgroundColor(getColor(R.color.white));
                    ans2.getChildAt(0).setBackgroundColor(getColor(R.color.white));
                    a2 = true;
                }
            }
        });
        ans2.getChildAt(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans2.getChildAt(2).setBackgroundColor(getColor(R.color.g3));
                    ans2.getChildAt(0).setBackgroundColor(getColor(R.color.white));
                    ans2.getChildAt(1).setBackgroundColor(getColor(R.color.white));
                    ans2.getChildAt(3).setBackgroundColor(getColor(R.color.white));
                    a2 = true;
                }
            }
        });
        ans2.getChildAt(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans2.getChildAt(3).setBackgroundColor(getColor(R.color.g3));
                    ans2.getChildAt(0).setBackgroundColor(getColor(R.color.white));
                    ans2.getChildAt(1).setBackgroundColor(getColor(R.color.white));
                    ans2.getChildAt(2).setBackgroundColor(getColor(R.color.white));
                    a2 = true;
                }
            }
        });
        Pri2.getChildAt(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
            }
        });
        Pri2.getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a2){
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.VISIBLE);
                }else {
                    Toast.makeText(MainActivity.this, "Answer Please", Toast.LENGTH_SHORT).show();
                }

            }
        });


        // Question2
        // Question3
        ans3.getChildAt(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans3.getChildAt(0).setBackgroundColor(getColor(R.color.g3));
                    ans3.getChildAt(1).setBackgroundColor(getColor(R.color.white));
                    ans3.getChildAt(2).setBackgroundColor(getColor(R.color.white));
                    ans3.getChildAt(3).setBackgroundColor(getColor(R.color.white));
                    a3 = true;
                }
            }
        });

        ans3.getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans3.getChildAt(1).setBackgroundColor(getColor(R.color.g3));
                    ans3.getChildAt(2).setBackgroundColor(getColor(R.color.white));
                    ans3.getChildAt(3).setBackgroundColor(getColor(R.color.white));
                    ans3.getChildAt(0).setBackgroundColor(getColor(R.color.white));
                    a3 = true;
                }
            }
        });
        ans3.getChildAt(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans3.getChildAt(2).setBackgroundColor(getColor(R.color.g3));
                    ans3.getChildAt(0).setBackgroundColor(getColor(R.color.white));
                    ans3.getChildAt(1).setBackgroundColor(getColor(R.color.white));
                    ans3.getChildAt(3).setBackgroundColor(getColor(R.color.white));
                    a3 = true;
                }
            }
        });
        ans3.getChildAt(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    ans3.getChildAt(3).setBackgroundColor(getColor(R.color.g3));
                    ans3.getChildAt(0).setBackgroundColor(getColor(R.color.white));
                    ans3.getChildAt(1).setBackgroundColor(getColor(R.color.white));
                    ans3.getChildAt(2).setBackgroundColor(getColor(R.color.white));
                    a3 = true;
                }
            }
        });
        Pri3.getChildAt(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1.setVisibility(View.GONE);

                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.GONE);
            }
        });
        Pri3.getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a3){
                    Toast.makeText(MainActivity.this, "Congratulation", Toast.LENGTH_SHORT).show();
                    Pri3.getChildAt(1).animate().translationX(1000);

                }else {
                    Toast.makeText(MainActivity.this, "Answer Please", Toast.LENGTH_SHORT).show();
                }

            }
        });


        // Question3


    }
}