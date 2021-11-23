public class FormalDress extends DressDecorator {
    FormalDress(Dress dress) {
        super(dress);
    }

    public void show() {
        super.show();
        System.out.println("Adding formal dress");
    }
}
