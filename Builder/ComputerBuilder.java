public class ComputerBuilder {
    private String name;
    private String ram;
    private String batteryLevel;
    private String cpu;
    private String os;

    public ComputerBuilder setName(String name) {
        this.name= name;
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        this.ram= ram;
        return this;
    }

    public ComputerBuilder setbatteryLevel(String batteryLevel){
        this.batteryLevel= batteryLevel;
        return this;
    }

    public ComputerBuilder setCpu(String cpu){
        this.cpu= cpu;
        return this;
    }

    public ComputerBuilder setOs(String os){
        this.os= os;
        return this;
    }
    public Computer getComputer() {
        return new Computer(name, ram, batteryLevel, cpu, os);
    }
}
