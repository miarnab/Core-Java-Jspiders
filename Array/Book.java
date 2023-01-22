public class Book implements Comparable{
    String title;
    int bookId;
    double price;

    public Book(String title, int bookId, double price) {
        this.title = title;
        this.bookId = bookId;
        this.price = price;
    }

    @Override
    public int compareTo()

}
