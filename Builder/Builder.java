public class Builder {
    public static void main(String[] args){
        Computer computer= new ComputerBuilder().
                                setName("Asus").
                                setCpu("intel").
                                getComputer();
        
        computer.printComputerDetails();
    }

}
