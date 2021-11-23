public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("two");
        System.out.println(singleton.value);
    }
    
}
