interface RemoteControl {
    void turnOn();
    void turnOff();
}
abstract class Appliance {
    abstract void displayAppliance();
}
class SmartTV extends Appliance implements RemoteControl {
    public void turnOn() {
        System.out.println("Smart TV is ON");
    }
    public void turnOff() {
        System.out.println("Smart TV is OFF");
    }
    void displayAppliance() {
        System.out.println("Appliance: Smart TV");
        System.out.println("Type: Smart Home Appliance");
    }
}
public class Exp_6 {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        Appliance appliance = tv;
        appliance.displayAppliance();
        RemoteControl remote = tv;
        remote.turnOn();
        System.out.println("Status: TV is working");
        remote.turnOff();
    }
}
