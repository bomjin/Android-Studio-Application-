package com.company;


public class StaticTest {
    int x;
    int y;
    int price;
    String name;
    int id;
    static int number = 0; //클래스 변수, 공유해서 사용할 수 있는 변수



    StaticTest(int power, int price, String name) {
        this.x =x;
        this.y =y;
        this.price = price;
        this.name = name;

        number +=1;  //StaticTest을 생성할 때마다 number 값이 1이 증가한다.
        id = number;



    }




}
