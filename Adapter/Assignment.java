public class Assignment {
    private Pen p;

    public void setPen(Pen p){
        this.p=p;
    }

    public Pen getPen(){
        return this.p;
    }

    public void doAssignment(String string){
        p.write(string);
    }
}
