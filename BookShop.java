import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    int stock;
    Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    Book(String title, String author) {
        this(title, author, 500.0, 10);
    }
    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}
public class BookShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for full book details or any other number for default values:");
        int choice = scanner.nextInt();
        scanner.nextLine();  
        Book book;
        if (choice == 1) {
            System.out.println("Enter book title:");
            String title = scanner.nextLine();
            System.out.println("Enter author name:");
            String author = scanner.nextLine();
            System.out.println("Enter book price:");
            double price = scanner.nextDouble();
            System.out.println("Enter stock quantity:");
            int stock = scanner.nextInt();
            book = new Book(title, author, price, stock);
        } else {
            System.out.println("Enter book title:");
            String title = scanner.nextLine();
            System.out.println("Enter author name:");
            String author = scanner.nextLine();
            book = new Book(title, author);
        }
        book.displayDetails();
        scanner.close();
    }
}
