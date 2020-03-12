package Thread;

public class Thread04 implements Runnable {

    private static long depositeMoney;

    private static Thread04 th;

    public Thread04(long depositeMoney) {
        this.depositeMoney = depositeMoney;
    }

    public static Thread04 getInstance() {
        if(th == null) {
            th = new Thread04(depositeMoney);
        }
        return th;
    }

    @Override
    public void run() {
        synchronized (this) {
            for(int i = 0; i< 10; i++) {
                    notify();
                try{
                    wait();
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(getDepositeMoney() <= 0)
                    break;
                withDraw(1000);
            }
        }
    }

    public void withDraw(long howMuch) {
        if(getDepositeMoney() > 0) {
            depositeMoney -= howMuch;
            System.out.print(Thread.currentThread().getName());
            System.out.printf("잔액 : %d 원 %n ", getDepositeMoney());
        } else {
            System.out.println(Thread.currentThread().getName());
            System.out.println("잔액이 부족합니다");
        }
    }

    public long getDepositeMoney() {
        return depositeMoney;
    }
}
