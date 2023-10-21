public class Ex24 {
    public static void main(String[] args) {
        int hours = 14, minutes = 27 , seconds;

        System.out.printf("%d:%d%n", hours, minutes);

        minutes = hours * 60 + minutes;
        seconds = minutes * 60;

        System.out.printf("minutes from midnight: %d%nseconds from midnight: %d", minutes, seconds);

    }
}