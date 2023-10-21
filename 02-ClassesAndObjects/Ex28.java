public class Ex28 {
    int a,b, area, perimeter;
    
    void info(){
        perimeter = 2 * a + 2 * b;
        area = a * b;
        System.out.printf("A: %d B: %d%nArea: %d%nPerimeter: %d%n", a, b, area, perimeter);
    }

    public static void main(String[] args) {
        Ex28 rectangle1 = new Ex28();
        Ex28 rectangle2 = new Ex28();

        rectangle1.a = 3;
        rectangle1.b = 4;
        rectangle2.a = 2;
        rectangle2.b = 7;
        rectangle1.info();
        rectangle2.info();
    }
}
