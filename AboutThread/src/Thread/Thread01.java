package Thread;

public class Thread01 extends Thread {

    private int[] temp;

    public Thread01(String threadname) {
        super(threadname);
        temp = new int[10];

        for(int start=0; start<temp.length; start++) {
            temp[start]=start;
        }
    }

    public void run() {
        for(int start:temp) {
            try{
                Thread.sleep(100);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println("스레드이름:" + currentThread().getName());
            System.out.println("temp value:"+ start);
        }
    }
}
