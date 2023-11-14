import java.util.Scanner;

public class Temperatures {

    public Temperatures(){
        Scanner in = new Scanner(System.in);

        System.out.println("W jakich jednostkach podajesz temperature? (1 - celsiusz, 2 - fahrenheit, 3 - kelvin)");
        int select = in.nextInt();
        System.out.println("Podaj temperaturę: ");
        double temp = in.nextDouble();
        
        switch (select) {
            case 1:
                System.out.println(temp);
                System.out.println(celToKal(temp));
                System.out.println(celToFah(temp));
                break;
            case 2:
                System.out.println(temp);
                System.out.println(fahToKal(temp));
                System.out.println(fahToCel(temp));
                break;
            case 3:
                System.out.println(temp);
                System.out.println(kalToCel(temp));
                System.out.println(kalToFah(temp));
            break;
        }
    }

    public static double celToKal(double temp){
        return temp + 273.15;
    }

    public static double celToFah(double temp){
        return (temp * 9/5) + 32;
    }

    public static double fahToCel(double temp){
        return (temp - 32) * 5/9;
    }

    public static double fahToKal(double temp){
        return (temp - 32) * 5/9 + 273.15;
    }

    public static double kalToCel(double temp){
        return temp - 273.15;
    }

    public static double kalToFah(double temp){
        return (temp- 273.15) * 9/5 + 32;
    }


    public static void main(String[] args) {
        Temperatures test = new Temperatures();

    }
}
