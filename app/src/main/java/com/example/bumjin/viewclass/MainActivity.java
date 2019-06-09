package com.example.bumjin.viewclass;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Paint p1 = new Paint(); // Paint 클래스는 색상을 설정하는 setColor, 텍스트 크기를 설정하는 setTextSize(), 알파값을 설정하는 setAlpha 등 다양한 메소드를 가지고 있다.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView myView = new MyView(this);
        setContentView(myView);
    }
    public class MyView extends View {

        public  MyView(Context context) {
            super(context);
            p1.setColor(Color.RED);
            p1.setTextSize(40);

        }
        public void onDraw(Canvas canvas) {
            canvas.drawCircle(100,100,100,p1);
            canvas.drawRect(0,300,300,400,p1);
            canvas.drawText("View 클래스 상속받고 OnDraw 활용하기",0,500,p1);
        }
    }
}
