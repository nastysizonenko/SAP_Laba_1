public class SyncTestApp {
    private static int counter;

    public static final int N = 1000;
    public static final int M = 1000;

    public static void main(String[] args) {
        long beforeDoing = System.nanoTime();

        Thread threadInc = new Thread(new ThreadInc());
        Thread threadDec = new Thread(new ThreadDec());

        threadInc.start();
        threadDec.start();

        try {
            threadInc.join();
            threadDec.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(counter);
        long afterDoing = System.nanoTime();
        long resultTime = afterDoing - beforeDoing;
        double seconds = (double)resultTime / 1000000000.0;

        System.out.println("Result time: " + seconds + " seconds.");
    }

    public static synchronized void inc(){
        counter++;
    }
    public static synchronized void dec() {
        counter--;
    }
}
