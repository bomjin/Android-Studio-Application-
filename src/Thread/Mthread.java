package Thread;

public class Mthread {
    public static void main(String[] args) {

        Thread1 t = new Thread1();

        t.start();

        for(int i = 0; i < 1000; i++)
            System.out.print("mainT"+i+" ");
    }
}

/* 실행 결과의 확인하면 mian 쓰레드와 Thread1 쓰레드가 섞어가면서 실행이 되는 것을 확인할 수 있다.



 */