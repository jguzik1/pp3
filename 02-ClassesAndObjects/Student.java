public class Student {
    String name;
    int age;
    int idCard;
    boolean idCardValid;
    int semesterNumber;
    float averageGrade;

    void sayHello(){
        System.out.println("Hello from " + name);
    }

    void displayName(){
        System.out.println(name);
    }

    void displayAge(){
        System.out.println(age);
    }

    void studentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Is the student id valid: " + idCardValid);
        System.out.println("Average grade: " + averageGrade);
    }

    void idCardStatusChange(boolean isValid){
        idCardValid = isValid;
    }

    void idInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID card number: " + idCard);
        System.out.println("ID card is " + (idCardValid ? "Valid" : "Invalid"));
    }
}
