public  class ThreadOne implements Runnable {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("one");
        System.out.println(singleton.value);
    }
    
}
