public class Book {

  private String title;
  private String author;
  private String ISBN;
  private int quantity;

  public Book(String title, String author, String ISBN, int quantity) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.quantity = quantity;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getISBN() {
    return ISBN;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void borrowBook() {
    if (quantity > 0) {
      quantity--;
      System.out.println("Book borrowed successfully!");
    } else {
      System.out.println("Sorry, the book is not available.");
    }
  }

  public void returnBook() {
    quantity++;
    System.out.println("Book returned successfully!");
  }

  public static void main(String[] args) throws Exception {
    Book book1 = new Book(
      "Harry Potter and the Sorcerer's Stone",
      "J.K. Rowling",
      "9788700631625",
      10
    );
    Book book2 = new Book(
      "The Lord of the Rings",
      "J.R.R. Tolkien",
      "9780544003415",
      5
    );
    Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", "9780544003416", 3);

    System.out.println("Title: " + book2.getTitle());
    System.out.println("Author: " + book2.getAuthor());
    System.out.println("ISBN: " + book1.getISBN());
    System.out.println("Quantity: " + book1.getQuantity());
    book1.borrowBook();
    System.out.println("Quantity: " + book1.getQuantity());
    book1.returnBook();
    System.out.println("Quantity: " + book1.getQuantity());
  }
}
