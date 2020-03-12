package Thread;

public class Thread02 implements Runnable{

    private int[] temp;

    public Thread02() {

        temp = new int[10];

        for(int start=0; start<temp.length; start++){
            temp[start] = start;
        }

    }

    @Override
    public void run() {
        //TODO Auto-generated method stub
        for(int start:temp) {
            try {
                Thread.sleep(500);
            } catch(InterruptedException ie){
                ie.printStackTrace();
            }

            System.out.println("스레드이름: " + Thread.currentThread().getName());
            System.out.println("temp value :" + start);
        }

    }
}
