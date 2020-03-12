package Thread;

public class main {
    public static long depositeMoney = 10000;

    public static void main(String args[]) {
/*

        Thread Thread01 = new Thread01("asd");

        Thread01.start();

        Thread02 thread02 = new Thread02();
        Thread t2 = new Thread(thread02, "첫번재");
        t2.start();
*/

/*      Thread th01 = new Thread(new Thread03(), "A");
        Thread th02 = new Thread(new Thread03(),"B");

        th01.start();
        th02.start();

        Thread.currentThread().getName();*/

/*        Thread04 th = new Thread04(depositeMoney).getInstance();

        Thread th1 = new Thread(th, "Mom");
        Thread th2 = new Thread(th, "Son");

        th1.start();
        th2.start();*/

        Thread05 th = new Thread05();

        Thread th1 = new Thread(th, "MOM");
        Thread th2 = new Thread(th, "SON");

        th1.start();
        th2.start();
    }
}
