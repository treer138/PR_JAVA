package Thread;

public class Thread03 implements  Runnable {

    int TestNum = 0;

    @Override
    public void run() {
            for(int i = 0; i<10; i++) {
                if(Thread.currentThread().getName().equals("A")){
                    System.out.println("=================");
                    TestNum++;
                }

                System.out.println("ThreadName = " + Thread.currentThread().getName()+"TestNum ="+TestNum);

                try {
                    Thread.sleep(700);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
