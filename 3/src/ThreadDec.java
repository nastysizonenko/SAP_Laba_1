public class ThreadDec extends Thread{

    public SharedObject sharedObject;
    public ThreadDec(SharedObject sharedObject){
       this.sharedObject = sharedObject;
    }

    @Override
    public void run() {

        for (int i = 0; i < ReplayLockTestApplication.M; i++) {

            ReplayLockTestApplication.dec();

        }

    }
}
