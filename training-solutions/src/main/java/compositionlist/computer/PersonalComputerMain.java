package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu1 = new Cpu("i7", 50.0);
        Software software1 = new Software("JAVA", 17.0);
        Hardware hardware1 = new Hardware("SSD", "SSD512");
        PersonalComputer computer1 = new PersonalComputer(cpu1);

        computer1.addHardware(hardware1);
        System.out.println(computer1.getHardwares());

        computer1.addSoftware(software1);
        System.out.println(computer1.getSoftwares());
    }
}
