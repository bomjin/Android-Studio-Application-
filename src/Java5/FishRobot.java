package Java5;

public class FishRobot implements StudyInterface { // extends 대신 implements를 사용한다.
    int depth;
    int x,y;

    public void mySituation() {

        System.out.println("나의 위치는 x좌표 : "+x+"y좌표:"+y+"입니다."); //반드시 추상메소드를 구현해주어야 한다.
    }


}
