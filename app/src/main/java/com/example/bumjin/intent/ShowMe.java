package com.example.bumjin.intent;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ShowMe extends AppCompatActivity {


    Button b1;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub1);

        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent intent1 = new Intent
                finish(); // 현재 실행 중인 activity를 종료한다.

            }
        });
    } //end of OnCreat
}
