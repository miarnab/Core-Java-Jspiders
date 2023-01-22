public class Book {
    String bookName;
    Book(String bookName){
        this.bookName = bookName;
    }
    public static void main(String args[]){
        Book book1 = new Book("Java");
        Book book2 = new Book("Java");
        System.out.println(book1);
        System.out.println(book2);
    }
}
