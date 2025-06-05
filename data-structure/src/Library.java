import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class Library {

    private ArrayList<Book> books;

    // initilaze in constructor
    public Library() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {

        if (book == null) {
            System.out.println("can not add");
            return;
        }
        books.add(book);
    }

    // remove book
    public boolean removeBookByIsbn(String isbn) {

        // Returns the first book with a matching title (case-insensitive search)
        // Iterator<Book> bookIterator= books.iterator();

        // while (bookIterator.hasNext()) {
        // Book book=bookIterator.next();
        // if(book.getIsbn().equalsIgnoreCase(isbn)){
        // }
        // }

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book == null)
                continue;
            else if (book.getIsbn().equalsIgnoreCase(isbn)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    // display all books
    // Prints all books in the library in a numbered list format
    // If the library is empty, display: "The library is empty."
    // Include a count of total books

    public void displayAllBooks() {
        // Iterator<Book> bookIterator=books.iterator();
        // while (bookIterator.hasNext()) {
        // System.out.println(bookIterator.next().toString());
        // }

        books.stream().forEach(System.out::println);

    }

    public Book findBookByTitle(String title) {
        // return
        // books.stream().findFirst(book->book.getTitle().equalsIgnoreCase(title));
        Optional<Book> opt = books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).findFirst();
        if (opt.isPresent())
            return opt.get();
        return null;
    }

}