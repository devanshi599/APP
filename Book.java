public class Book {

    String title = "Java Programming";
    String author = "James Gosling";
    double price = 499.99;

    public static void main(String[] args) {

        Book book = new Book();

        System.out.println("Book Details");
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: ₹" + book.price);
    }
}
