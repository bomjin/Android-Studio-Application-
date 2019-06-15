package com.example.bumjin.gamebasic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.icu.lang.UCharacter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    Bitmap spaceShip; // 우저선 이미지
    int spaceship_x, spaceship_y; // 우주선의 위치
    Bitmap leftkey, rightKey; //왼쪽 키 버튼, 오른쪽 키 버튼
    int leftKey_x, leftKey_y; //왼쪽 키 버튼
    int rightKey_x, rightKey_y; // 오른쪽 키 위치
    int Width, Height; //사용자 기기 해상도
    int button_width; // 왼쪽 키 버튼의 크기
    Bitmap screen; // 배경이미지

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this)); // this = 현재 activity를 의미한다

        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        Width = display.getWidth(); //사용 중인 기기의 가로 크기를 구하여 Width 필드에 대입
        Height = display.getHeight(); //사용 중인 기기의 세로 크기를 구하여 Height 필드에 대입
        spaceShip = BitmapFactory.decodeResource(getResources(),R.drawable.spaceship); //비트맵으로 변경
        int x = Width/8;
        int y =Height/11;
        spaceShip =Bitmap.createScaledBitmap(spaceShip,x,y,true); //크기를 재정의

        spaceship_x = Width*1/9;
        spaceship_y = Height*6/9;

        leftkey =BitmapFactory.decodeResource(getResources(),R.drawable.leftkey);
        leftKey_x=Width*5/9;
        leftKey_y=Width*7/9;
        button_width = Width/6;

        leftkey = Bitmap.createScaledBitmap(leftkey,button_width,button_width,true);

        rightKey =BitmapFactory.decodeResource(getResources(),R.drawable.rightkey);
        rightKey_x=Width*7/9;
        rightKey_y=Width*7/9;


        rightKey = Bitmap.createScaledBitmap(rightKey,button_width,button_width,true);

    screen =BitmapFactory.decodeResource(getResources(),R.drawable.screen);
    screen =Bitmap.createScaledBitmap(screen,Width,Height, true);
    }

    class MyView extends View {
        MyView(Context context) {
            super(context); //상위 클래스에 생성자를 호출 해야된다.
             setBackgroundColor(Color.BLUE);
        }
        public void onDraw(Canvas canvas) {
            Paint p1 = new Paint();
            p1.setColor(Color.RED);
            p1.setTextSize(50);
            canvas.drawBitmap(screen, 0,0,p1); // 게임 배경

            canvas.drawBitmap(spaceShip,spaceship_x,spaceship_y,p1);
            canvas.drawBitmap(leftkey,leftKey_x,leftKey_y,p1);
            canvas.drawBitmap(rightKey,rightKey_x,rightKey_y,p1);

        }
        public boolean onTouchEvent(MotionEvent event) {
            int x=0; int y=0;

            if(event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE) {
                x = (int) event.getX();
                y = (int) event.getY();

            }
//왼쪽 키버튼 터치할 경우
            if((x>leftKey_x)&&(x<leftKey_x+button_width)&&(y>leftKey_y)&&(x<leftKey_y+button_width))spaceship_x-=20;
            // 오른쪽 키버튼 터치할 경우
            if((x>rightKey_x)&&(x<rightKey_x+button_width)&&(y>rightKey_y)&&(x<rightKey_y+button_width))spaceship_x+=20;

      invalidate();
      return true; //true값을 반환하면 재대로 처리되었다는 의미이다.
        }




    }




}
