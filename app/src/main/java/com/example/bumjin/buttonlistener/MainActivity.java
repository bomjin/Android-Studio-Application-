package com.example.bumjin.buttonlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1= (Button)findViewById(R.id.b1); //메소드를 통해 버튼 변수에 위젯을 연결한다.
        b2= (Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Seoul",Toast.LENGTH_SHORT).show();
                //무명 클래스를 이용해서 버튼을 클릭 할 때 동작하도록 처리한다.
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"London",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
