package Java10;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

 class innerclassTest {


     int x = 100; // 미사일 좌표, 외부 맴버 변수
     InnerClass il;


     innerclassTest() {

         il = new InnerClass(); // 내부 클래스의 메소드를 접근하기 위한 // 내부 클래스 객체 생성

     }

     class InnerClass {

         int v = x;              // 외부 클래스의 맴버 변수를 참조 가능하지만 외부 클랫의 맴버 변수의 값을 수정 불가능 ex) x=200; > 오류 외부 클랫의 맴버 변수의 값을 수정하려면 내부 클래스의 메소드 안에서 만 가능하다

     }

     void sMissile() {
         System.out.println("내부 클래스 메소드를 실행했습니다. ");
         System.out.println("미사일이 발사되었습니다. ");
     }

     void missileLocation() {
         x += 10; //메소드 안에서 외부 뱐수 값 수정 가능
         System.out.println("미사일의 x좌표는" + x + "입니다.");
         System.out.println("외부 클래스 맴버 변수를 내부클래스 안에 메소드를 통해 변경했습니다. ");


     }


 }


//     void shootMissile() {
//
//         il.sMissile(); // 외부 클래스에서 내부 클래스의 맴버 메소드에 접근하기 위해서는 내부클래스의 객체명.메소드를 형식으로 접근해야한다.
//     }
//
//     void moveLeft() {
//         il.missileLocation();
//     }
// }




