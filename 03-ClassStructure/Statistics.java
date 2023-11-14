public class Statistics {
    public static int countInRange(int x, int y){
        int count = 0;
        for(int i = x; i < y; i++) {
            count ++;

        }
        return count;
    }

    public static int sumInRange(int x, int y){
        int sum = 0;
        for(int i = x; i <= y; i++){
            sum += i;
        }
        return sum;
    }

    public static double arithmeticMean(int x, int y){
        double count = countInRange(x, y);
        double sum = sumInRange(x, y);
        return sum / count;

    }

    public static void main(String[] args) {
        System.out.println(countInRange(5, 10));
        System.out.println(sumInRange(5, 10));
        System.out.println(arithmeticMean(5, 10));
    }
}
