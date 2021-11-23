public class SingletonMain {
    public static void main(String[] args) {
        Thread threadTwo = new Thread(new ThreadTwo());
        Thread threadOne = new Thread(new ThreadOne());

        threadOne.start();
        threadTwo.start();
    }
}
