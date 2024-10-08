package com.example.istiqlal.penelusuranhadis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView ivhadis1,ivhadis2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivhadis1=(ImageView) findViewById(R.id.iv_hadis1);
        ivhadis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,hadishal3.class);
                MainActivity.this.startActivity(intent);
            }
        });
        ivhadis2=(ImageView) findViewById(R.id.iv_hadis2);

        ivhadis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,hadishal4.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

}
