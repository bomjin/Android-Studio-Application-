package Java3;

public class FishRobot extends StudySuper {

    int depth;
    FishRobot(int x, int y) {
        super(x,y); // 조상의 생성자를 호출한다. 생성자의 호출 순서는 부모 > 자식
    }
    void swim() {
        System.out.println("저는 지금 수심"+depth+"m에 있습니다.");
    }

}
