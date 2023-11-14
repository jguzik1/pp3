public class CinemaTicket {
    static String cinemaName = "FunMovies";
    String filmTitle;
    int row, seat;
    float price;


    public CinemaTicket(String filmTitle, int row, int seat){
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat =seat;
        this.price = (row <= 2) ? 10 : 25;
    }

    public String toString(){
        return String.format("Cinema: %s\nFilm Title: %s\nRow: %02d\nSeat: %02d\nPrice: %.2f", cinemaName, filmTitle, row, seat, price);
    }

    public static void main(String[] args) {
        CinemaTicket bilet1 = new CinemaTicket("Gladiator", 2, 1);
        CinemaTicket bilet2 = new CinemaTicket("Gladiator", 7, 1);

        System.out.println(bilet1);
        System.out.println();
        System.out.println(bilet2);
    }
}