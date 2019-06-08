package com.example.bumjin.buttonlistener2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button.OnClickListener myClick = new Button.OnClickListener() {


            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b1:
                        Toast.makeText(getApplicationContext(),"서울",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b2:
                        Toast.makeText(getApplicationContext(),"미국",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };
        findViewById(R.id.b1).setOnClickListener(myClick);
        findViewById(R.id.b2).setOnClickListener(myClick);
    }
}
