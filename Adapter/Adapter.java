public class Adapter {
    public static void main(String[] args){
        PenAdapter ap = new PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setPen(ap);
        assignment.doAssignment("Design pattern assignment");
    }
}
