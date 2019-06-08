package com.example.bumjin.listenerobject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListener mL = new MyListener(); // 이벤트  리스너 객체 생성하기

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(mL); // 위젯에 이벤트 리스너 객체 등록하기
    }
    class MyListener implements View.OnClickListener { // OnClickListener 인터페이스를 구현한 클래스를 만든다.


        @Override
        public void onClick(View v) {

            Toast.makeText(MainActivity.this,"리스너 인터페이스 구현하여 이벤트 처리 ",Toast.LENGTH_SHORT).show();
        }
    }
}
