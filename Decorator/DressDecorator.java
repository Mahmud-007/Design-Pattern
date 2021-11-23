public class DressDecorator implements Dress{

    protected Dress dress;

    DressDecorator(Dress dress){
        this.dress=dress;
    }

    public void show(){
        this.dress.show();
    }
}
