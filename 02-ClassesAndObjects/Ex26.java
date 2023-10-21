public class Ex26 {
    String name, author;
    int numberOfPages, pageNumber;
    boolean isOpen;

    void open(){
        isOpen = true;
        System.out.println("Book has been opened");
    }

    void close(){
        isOpen = false;
        System.out.println("Book has been closed");
    }

    void nextPage(){
        if(pageNumber < numberOfPages && isOpen == true){
            pageNumber ++;
            System.out.printf("Currnet page: %d%n", pageNumber);
        }else{
            System.out.println("Next page is back cover");
        }
    }
    void prevPage(){
        if(pageNumber > 1 && isOpen == true){
            pageNumber --;
            System.out.printf("Currnet page: %d%n", pageNumber);
        }else{
            System.out.println("Previous page is front cover");
        }
    }

    public static void main(String[] args) {
        Ex26 book1 = new Ex26();

        book1.author = "Marcin";
        book1.name = "Star Trek";
        book1.numberOfPages = 3;
        book1.pageNumber = 1;
        
        book1.open();
        book1.close();
        book1.nextPage();
        book1.open();
        book1.nextPage();
        book1.nextPage();
        book1.nextPage();
        book1.pageNumber = 1;
        book1.prevPage();
    }
}