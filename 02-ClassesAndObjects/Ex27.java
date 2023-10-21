public class Ex27 {
    boolean isOn;

    void switchOn(){
        isOn = true;
    }

    void switchOff(){
        isOn = false;
    }

    void info(){
        System.out.println(isOn ? "Lamp is on" : "Lamp is off");
    }

    public static void main(String[] args) {
        Ex27 lamp1 = new Ex27();
        Ex27 lamp2 = new Ex27();

        lamp1.switchOn();
        lamp2.switchOff();
        lamp1.info();
        lamp2.info();
    }
}
