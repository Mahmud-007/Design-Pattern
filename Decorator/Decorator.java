public class Decorator {
    public static void main(String[] args){
        Dress one = new SprotyDress(new FormalDress(new BasicDress()));
        one.show();
    }
}
