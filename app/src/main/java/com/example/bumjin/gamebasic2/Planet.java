package com.example.bumjin.gamebasic2;

public class Planet {
    int x,y; //행성의 위치
    int planetSpeed=15; //행성의 속도
    int dir; // 0이면 행성이 오른쪽에서 왼쪽으로 이동 //1이면 행성이 왼쪽에서 오른쪽으로 이동

    Planet(int x,int y,int dir) {
        this.x=x;
        this.y=y;
        this.dir=dir;
    }
    public void move() {
        if(dir==0)
            x-=planetSpeed;
        else x +=planetSpeed;
    }
}
