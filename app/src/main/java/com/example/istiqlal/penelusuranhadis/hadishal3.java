package com.example.istiqlal.penelusuranhadis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hadishal3 extends AppCompatActivity {
    TextView tvhadis11,tvhadis12,tvhadis13,tvhadis14,tvhadis15,tvhadis16,tvhadis17,tvhadis18,tvhadis19,tvhadis110,tvhadis111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadishal3);

        tvhadis11=(TextView)findViewById(R.id.tv_hadis11);


        tvhadis11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis11.class);
                hadishal3.this.startActivity(intent);
            }
        });
        tvhadis12=(TextView)findViewById(R.id.tv_hadis12);
        tvhadis12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis13.class);
                hadishal3.this.startActivity(intent);
            }
        });
        tvhadis13=(TextView)findViewById(R.id.tv_hadis13);
        tvhadis13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis12.class);
                hadishal3.this.startActivity(intent);
            }
        });
        tvhadis14=(TextView)findViewById(R.id.tv_hadis14);
        tvhadis14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis14.class);
                hadishal3.this.startActivity(intent);
            }
        });
        tvhadis15=(TextView)findViewById(R.id.tv_hadis15);
        tvhadis15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis15.class);
                hadishal3.this.startActivity(intent);
            }
        });
        tvhadis16=(TextView)findViewById(R.id.tv_hadis16);
        tvhadis16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis16.class);
                hadishal3.this.startActivity(intent);

            }
        });
        tvhadis17=(TextView)findViewById(R.id.tv_hadis17);
        tvhadis17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis17.class);
                hadishal3.this.startActivity(intent);
            }
        });
        tvhadis18=(TextView)findViewById(R.id.tv_hadis18);
        tvhadis18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis18.class);
                hadishal3.this.startActivity(intent);
            }
        });
        tvhadis19=(TextView)findViewById(R.id.tv_hadis19);
        tvhadis19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis19.class);
                hadishal3.this.startActivity(intent);
            }
        });
        tvhadis110=(TextView)findViewById(R.id.tv_hadis110);
        tvhadis110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis110.class);
                hadishal3.this.startActivity(intent);
            }
        });
        tvhadis111=(TextView)findViewById(R.id.tv_hadis111);
        tvhadis111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal3.this,hadis111.class);
                hadishal3.this.startActivity(intent);
            }
        });
            }
}
