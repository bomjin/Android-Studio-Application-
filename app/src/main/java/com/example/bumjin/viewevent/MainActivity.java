package com.example.bumjin.viewevent;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    MyView myView = new MyView(this); //view를 상속받는 MyView 클래스 객체를 생성한다.
    setContentView(myView); // xml파일이 아닌 view 클래스를 상속해서 생성한 my View 객체를 화면 설정으로 정한다.
}
class MyView extends View { //Activity 클래스 안에 View 클래스를 상속 받는 MyView 클래스를 만들었다. View 클래스가 가지고 있는 onTouchEvent 메소드를 재정의 하여 사용할 수 있다.
    MyView(Context context) {
        super(context);
        setBackgroundColor(Color.GREEN);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(MainActivity.this, "View클래스를 상속받아 만든 이벤트 처리", Toast.LENGTH_SHORT).show();

        }
            return false;
        }
    }
}

