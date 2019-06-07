package Java14;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class Robot2 {

    private  int x = 0;
    int explainOK =1;
    int price;
    String name;
    InnerClass il;

    Robot2() {

        il = new InnerClass();



    }

    class InnerClass() {

        void moveAll() {
            System.out.println(explainOK);
            System.out.println(x);
        }
    }
    void moveRight() {
        x += 10;
        System.out.println(x);
        il.moveAll();

    }


}
