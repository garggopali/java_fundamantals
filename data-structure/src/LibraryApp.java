/**
 * LibraryApp - Main application class for the Library Management System
 * Demonstrates the functionality of the Book and Library classes
 */
public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("=== Welcome to the Library Management System ===\n");
        
        // Step 1: Create a Library instance
        Library library = new Library();
        
        // Step 2: Create several Book objects
        System.out.println("Creating books...\n");
        
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        Book book2 = new Book("1984", "George Orwell", "978-0-452-28423-4");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "978-0-14-143951-8");
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5");
        Book book5 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0-439-70818-8");
        
        // Step 3: Add books to the library
        System.out.println("Adding books to the library...\n");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        
        // Test adding a null book
        library.addBook(null);
        
        System.out.println();
        
        // Step 4: Display all books
        System.out.println("Displaying all books in the library:");
        library.displayAllBooks();
        System.out.println();
        
        // Step 5: Search for a book by title
        System.out.println("=== Searching for Books ===");
        String searchTitle = "1984";
        System.out.println("Searching for book with title: '" + searchTitle + "'");
        Book foundBook = library.findBookByTitle(searchTitle);
        
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
        
        // Test search with different case
        System.out.println("\nSearching for 'pride and prejudice' (case-insensitive):");
        Book foundBook2 = library.findBookByTitle("pride and prejudice");
        if (foundBook2 != null) {
            System.out.println("Book found: " + foundBook2);
        } else {
            System.out.println("Book not found.");
        }
        
        // Test search with invalid input
        System.out.println("\nSearching with empty title:");
        library.findBookByTitle("");
        
        System.out.println();
        
        // Step 6: Remove a book using ISBN
        System.out.println("=== Removing Books ===");
        String isbnToRemove = "978-0-452-28423-4"; // 1984
        System.out.println("Attempting to remove book with ISBN: " + isbnToRemove);
        boolean removed = library.removeBookByIsbn(isbnToRemove);
        
        if (removed) {
            System.out.println("Book removal confirmed.");
        } else {
            System.out.println("Book removal failed.");
        }
        
        System.out.println();
        
        // Step 7: Attempt to remove a book with invalid/nonexistent ISBN
        System.out.println("Attempting to remove book with nonexistent ISBN:");
        String invalidIsbn = "999-9-999-99999-9";
        library.removeBookByIsbn(invalidIsbn);
        
        // Test removal with null ISBN
        System.out.println("\nAttempting to remove book with null ISBN:");
        library.removeBookByIsbn(null);
        
        // Test removal with empty ISBN
        System.out.println("\nAttempting to remove book with empty ISBN:");
        library.removeBookByIsbn("");
        
        System.out.println();
        
        // Step 8: Display all books again to confirm changes
        System.out.println("=== Final Library Status ===");
        System.out.println("Displaying all books after removal:");
        library.displayAllBooks();
        
        System.out.println("\n=== Library Management System Demo Complete ===");
        
        // Additional demonstration: Test duplicate ISBN handling
        System.out.println("\n=== Testing Duplicate Book (Same ISBN) ===");
        Book duplicateBook = new Book("Different Title", "Different Author", "978-0-06-112008-4");
        System.out.println("Creating book with same ISBN as existing book...");
        System.out.println("Original book: " + book1);
        System.out.println("New book: " + duplicateBook);
        System.out.println("Are they equal? " + book1.equals(duplicateBook));
        
        library.addBook(duplicateBook);
        library.displayAllBooks();
    }
}