package Java2;

public class FishRobot extends studyOverriding {
    int depth;

    void mySituatiom() {

        System.out.println("자손클래스: 나의 위치는"+x+","+y+"입니다.");
        System.out.println("나의 수심은"+depth+"입니다."); //메소드 오버라이딩 : 조상 메소드 내용을 재정의해서 사용합니다.
    }

}
