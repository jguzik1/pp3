public class MyCalendar {
    static int year = 2023, month = 4, day = 9;

    public static String myDate(){
        return year+"-"+month+"-"+day;
    }

    public static int days(){
        return month * 30 + day;
    }

    public static String monthName(){
        switch (month) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Date: " + myDate());
        System.out.println("Days from beginning of year: " + days());
        System.out.println("Month name: " + monthName());
    }
}
