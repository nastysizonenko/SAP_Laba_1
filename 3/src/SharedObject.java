public class SharedObject {
    private volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public synchronized void inc(){
        counter++;
    }
    public synchronized void dec() {
        counter--;
    }

}
