public class Computer {
    private String name;
    private String ram;
    private String batteryLevel;
    private String cpu;
    private String os;

    public Computer(String name, String ram, String batteryLevel, String cpu){
        super();
        this.name = name;
        this.ram = ram;
        this.batteryLevel = batteryLevel;
        this.cpu = cpu;
    }
    public Computer getComputer() {
        return new Computer(name, ram, batteryLevel, cpu, os);
    }

    public Computer(String name, String ram, String batteryLevel, String cpu, String os) {
        this.name = name;
        this.ram = ram;
        this.batteryLevel = batteryLevel;
        this.cpu = cpu;
        this.os = os;
    }
    

    public void printComputerDetails(){
        System.out.println(name+" "+ram+" "+batteryLevel+" "+cpu+" "+os);
    }
}
