package Java7;

public class TankRobot extends StudyPoly2 {
    TankRobot(int price) {
        super(price);
    }
    int speed;

    void goForward() {
        System.out.println("저는 지금 속도가"+ speed+ "입니다.");
    }
}
