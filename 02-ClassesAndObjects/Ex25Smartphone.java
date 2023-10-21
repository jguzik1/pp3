public class Ex25Smartphone {
    int battery, serialNumber;
    String brand, model;
    boolean isOn = false;

    void turnOn(){
        isOn = true;
    }

    void systemInfo(){
        if(isOn == true){
            System.out.printf("Brand: %s%nModel: %s%nSerial number: %d%n", brand, model, serialNumber);
        }else{
            System.out.println("Phone is off");
        }
    }

    void checkBattery(){
        System.out.println("Battery level is " + battery + "%");
    }

}
