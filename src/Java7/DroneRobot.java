package Java7;

public class DroneRobot extends StudyPoly2 {

    DroneRobot(int price) {
        super(price);

    }
    int altitude;
    void fly() {
        System.out.println("저는 지금 높이"+ altitude+"입니다.");
    }
}
