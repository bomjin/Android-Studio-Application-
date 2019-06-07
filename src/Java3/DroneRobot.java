package Java3;

public class DroneRobot extends StudySuper {

    int altitude; //고도

    DroneRobot(int x, int y) {
        super(x,y);
    }
    void fly() {

        System.out.println("저는 지금 높이"+ altitude+"m에 있습니다.");
    }
}
