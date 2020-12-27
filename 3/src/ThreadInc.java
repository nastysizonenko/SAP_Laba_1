public class ThreadInc extends Thread{

    private SharedObject sharedObject;
    public ThreadInc(SharedObject sharedObject){
        this.sharedObject = sharedObject;
    }


    @Override
    public void run() {

        for (int i = 0; i < ReplayLockTestApplication.N; i++) {

            ReplayLockTestApplication.inc();

        }

    }
}