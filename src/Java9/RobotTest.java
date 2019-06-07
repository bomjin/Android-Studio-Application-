package Java9;

public class RobotTest {
    public static void main(String[] args) {

       Robot r1 = new Robot() {


           public  void mySituation() {                                 //인터페이스 Robot을 구현하는 클래스를 별도로 만들지 않고 바로 인터페이스를 구현

               System.out.println("인터페이스를 통해서 메소드 사용 ");
           }
       }; //;사용

       r1.mySituation();



    }
}
