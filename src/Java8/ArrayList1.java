package Java8;

import java.util.ArrayList;

public class ArrayList1 { //public으로 선언된 클래스명은 파일명과 일치해야 한다.
    public static void main(String[] args) {

        ArrayList<String> list1 =  new ArrayList<String>();
        System.out.println("초기 사이즈 : "+list1.size()); //사이즈는 0이다.


        list1.add("홍길동");
        list1.add("세종대왕");
        list1.add("이순신");
        list1.add("강감찬");
        list1.add("을지문덕");

        System.out.println("지금 사이즈 : "+ list1.size()); // size 사용

        for(String l : list1)
            System.out.println(l);
        list1.remove(0);
        list1.remove(1);

        System.out.println(); //엔터키 효과
        System.out.println("마지막 사이즈 :"+list1.size());

        for(String l : list1)
            System.out.println(l);




    }
}
