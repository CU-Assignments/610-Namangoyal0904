class Book {
    String title;
    String author;
    double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Harry Potter", "J.K. Rowling", 500.0);
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 700.0);
        fictionBook.displayDetails();
        System.out.println(); 
        nonFictionBook.displayDetails();
    }
}
