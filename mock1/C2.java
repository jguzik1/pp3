public class C2 {
    int counter = 0;

    public void increase(){
        counter ++;
    }

    public void decrease(){
        counter --;
    }

    public void increase(int incBy){
        counter += incBy;
    }

    public void decrease(int decBy){
        counter -= decBy;
    }

    public int value(){
        return counter;
    }

    public static void main(String[] args) {
        C2 o = new C2();
        System.out.println(o.value());
        o.increase();
        o.increase();
        o.decrease();
        o.increase(5);
        o.decrease(2);
        System.out.println(o.value());
    }
}
