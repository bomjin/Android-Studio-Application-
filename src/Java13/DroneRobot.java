package Java13;

public class DroneRobot extends Robot {

    int price= 100;

    DroneRobot(int x, int y ) {
        super(x,y); //조상 클래스의 생성자를 호출한다.
    }

    void showMe() {

        System.out.println("나는 자손입니다.");
    }
    void showPrice() {

        System.out.println("price"+price);
        System.out.println("super.price"+super.price);
        super.showMe();
        showMe();
    }

}
