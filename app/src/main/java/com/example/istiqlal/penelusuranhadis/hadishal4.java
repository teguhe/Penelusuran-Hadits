package com.example.istiqlal.penelusuranhadis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hadishal4 extends AppCompatActivity {
TextView tvhadis21,tvhadis22,tvhadis23,tvhadis24,tvhadis25,tvhadis26,tvhadis27,tvhadis28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadishal4);

        tvhadis21=(TextView)findViewById(R.id.tv_hadis21);
        tvhadis21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal4.this,hadis21.class);
                hadishal4.this.startActivity(intent);
            }
        });
        tvhadis22=(TextView)findViewById(R.id.tv_hadis22);
        tvhadis22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal4.this,hadis22.class);
                hadishal4.this.startActivity(intent);
            }
        });
        tvhadis23=(TextView)findViewById(R.id.tv_hadis23);
        tvhadis23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal4.this,hadis23.class);
                hadishal4.this.startActivity(intent);
            }
        });
        tvhadis24=(TextView)findViewById(R.id.tv_hadis24);
        tvhadis24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal4.this,hadis24.class);
                hadishal4.this.startActivity(intent);
            }
        });
        tvhadis25=(TextView)findViewById(R.id.tv_hadis25);
        tvhadis25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal4.this,hadis25.class);
                hadishal4.this.startActivity(intent);
            }
        });
        tvhadis26=(TextView)findViewById(R.id.tv_hadis26);
        tvhadis26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal4.this,hadis26.class);
                hadishal4.this.startActivity(intent);
            }
        });
        tvhadis27=(TextView)findViewById(R.id.tv_hadis27);
        tvhadis27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal4.this,hadis27.class);
                hadishal4.this.startActivity(intent);
            }
        });
        tvhadis28=(TextView)findViewById(R.id.tv_hadis28);
        tvhadis28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hadishal4.this,hadis28.class);
                hadishal4.this.startActivity(intent);
            }
        });
    }
}
