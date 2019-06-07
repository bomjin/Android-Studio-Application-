package Java7;

public class FishRobot extends StudyPoly2 {
    FishRobot(int price) {
        super(price);
    }
    int depth;
    void swim() {
        System.out.println("나의 수심은"+depth+"입니다.");
    }
}
