public class Ex23 {
    public static void main(String[] args){
        double buyingPrice, sellingPrice, spread;
        buyingPrice = 45940;
        sellingPrice = 46250;

        spread = (sellingPrice - buyingPrice) / 10000;
        System.out.println("Bank buys EUR: "+ buyingPrice / 10000);
        System.out.println("Bank sells EUR: "+ sellingPrice / 10000);
        System.out.println("Spread: "+ spread);

    }
}
