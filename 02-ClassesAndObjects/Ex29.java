public class Ex29 {
    int count = 0;

    void reset(){
        count = 0;
        System.out.println("Current count: " + count);
    }

    void plusOne(int x){
        count += x;
        System.out.println("Current count: " + count);
    }

    void minusOne(int x){
        count -= x;
        System.out.println("Current count: " + count);
    }
    
    void plusTen(){
        count += 10;
        System.out.println("Current count: " + count);
    }
    //strasznie to głupie, że trzeba robić dodatkowe funkcje, żeby ustawić wartość domyślną
    void plusTen(int x){
        count += 10 * x;
        System.out.println("Current count: " + count);
    }

    void minusTen(int x){
        count -= 10 * x;
        System.out.println("Current count: " + count);
    }

    public static void main(String[] args) {
        Ex29 counter1 = new Ex29();
        Ex29 counter2 = new Ex29();

        counter1.plusOne(3);
        counter1.plusTen(2);
        counter2.minusOne(7);
        counter2.minusTen(4);
    }

}
