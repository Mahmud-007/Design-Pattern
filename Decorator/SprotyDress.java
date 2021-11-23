public class SprotyDress extends DressDecorator {
    SprotyDress(Dress dress) {
        super(dress);
    }

    public void show() {
        super.show();
        System.out.println("Adding SprotyDress");
    }
}
