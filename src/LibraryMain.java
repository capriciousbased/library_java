public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "9788700631625", 10);
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780544003415", 5);
        Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", "9780544003416", 3);

        Library library = new Library();

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("ISBN: " + book1.getISBN());
        System.out.println("Quantity: " + book1.getQuantity());

        library.borrowBook(book1);
        System.out.println("Quantity: " + book1.getQuantity());
        library.returnBook(book1);
        System.out.println("Quantity: " + book1.getQuantity());
    }
}
