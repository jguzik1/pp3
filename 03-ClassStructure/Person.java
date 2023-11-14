public class Person {

    String name;
    double weight, height;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        return weight / (Math.pow((height/100),2));
    }

    public void displayRecord(){
        String bmiResult;
        if (calculateBMI() < 18.5) {
            bmiResult = "BMI too low";
        } else if (calculateBMI() > 24.9){
            bmiResult = "BMI too high";
        } else {
            bmiResult = "BMI optimal";
        }

        System.out.printf("Imie: %s\nWaga: %.2f\nWzrost: %.2f\nBMI: %s\n\n", name, weight, height, bmiResult);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Maciek",800,180);
        Person p2 = new Person("Maciek",80,180);
        Person p3 = new Person("Maciek",8,180);

        p1.displayRecord();
        p2.displayRecord();
        p3.displayRecord();
    }

}
