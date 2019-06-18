package com.example.bumjin.gamebasic2;

public class MyMissile {

    int x,y; //미사일에 위치
    int missileSpeed=35; // 미사일 속도

    MyMissile(int x, int y) {
        this.x =x;
        this.y =y;

    }

    public void move() {
        y-=missileSpeed; // 미사일 속도 값에 따라서 미사일이 움직이도록 하였다.
    }
}
