package com.company;

public class StaticMain {

    public static void main(String[] args) {



        StaticTest ST1= new StaticTest(60000,100,"마징가"); //생성자에게 매개변수 전달
        StaticTest ST2 = new StaticTest(1000,100,"태권브");
        StaticTest ST3 = new StaticTest(1000,100,"짱가");

        int num = StaticTest.number; //정적변수=클래스변수
        System.out.println("지금까지 생성된 로붓 수 = " + num);
    }

}
