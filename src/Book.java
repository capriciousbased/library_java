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
}
