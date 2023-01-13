public class Library {
    public void borrowBook(Book book) {
        if (book.getQuantity() > 0) {
            book.setQuantity(book.getQuantity() - 1);
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook(Book book) {
        book.setQuantity(book.getQuantity() + 1);
        System.out.println("Book returned successfully!");
    }
}