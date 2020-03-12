package Thread;

public class ThreadSafeSinglethon {

    public int x;

    public ThreadSafeSinglethon() {
        this.x = 10000;
    }

    private static class holder{
        public static final ThreadSafeSinglethon INSTANCE = new ThreadSafeSinglethon();
    }

    public static ThreadSafeSinglethon getInstance() {
        return holder.INSTANCE;
    }


}
