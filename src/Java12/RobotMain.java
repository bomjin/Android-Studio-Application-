package Java12;

public class RobotMain {
    public static void main(String[] args) {

        Robot r = new Robot(); // 객체생성시 맴버 면수 값들은 숫자일 경우 0으로, 참조형일 경우 null로 초기화된다.
        System.out.println(r.price); // 0 출력
        r.price=10000;
        changeName(r);
        System.out.println(r.price);  // 메소드 수행하고 돌아와서 생성 객체의 price 값을 출력하면 10000이 출려됨

    }

    static void changeName(Robot r) {
        r.price=20000;
        System.out.println(r.price); // changeName() 메소드에 매개변수로 price 값 0을 넘겨 주었다. 그리고 changeName() 안에서 price 값에 20000을 넣고 출력을 하면 출력값은 20000이 나온다.
    }
}
