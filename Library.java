import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<Integer, Student> students = new HashMap<>();
    private HashMap<Integer, Integer> issuedBooks = new HashMap<>();

    // DSA
    private Queue<Book> reservedBooks = new LinkedList<>();
    private Stack<Book> recentlyViewed = new Stack<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Display Books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search by ID
    public void searchBookById(int id) {

        for (Book book : books) {

            if (book.getBookId() == id) {

                recentlyViewed.push(book);

                book.displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Search by Title
    public void searchBookByTitle(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                recentlyViewed.push(book);

                book.displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Add Student
    public void addStudent(Student student) {

        students.put(student.userId, student);
        System.out.println("Student added successfully.");
    }

    // Display Students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students.values()) {

            student.displayUser();
            System.out.println("------------------------");
        }
    }

    // Issue Book
    public void issueBook(int bookId, int studentId) {

        if (!students.containsKey(studentId)) {
            System.out.println("Student not found.");
            return;
        }

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                if (!book.isAvailable()) {
                    System.out.println("Book already issued.");
                    return;
                }

                book.issueBook();
                issuedBooks.put(bookId, studentId);

                System.out.println("Book issued successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Return Book
    public void returnBook(int bookId) {

        if (!issuedBooks.containsKey(bookId)) {

            System.out.println("Book was not issued.");
            return;
        }

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                book.returnBook();
                issuedBooks.remove(bookId);

                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Delete Book
    public void deleteBook(int id) {

        for (Book book : books) {

            if (book.getBookId() == id) {

                books.remove(book);

                System.out.println("Book deleted successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Sort Books
    public void sortBooksByTitle() {

        Collections.sort(books, new Comparator<Book>() {

            @Override
            public int compare(Book b1, Book b2) {

                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });

        System.out.println("Books sorted successfully.");
    }

    // Reserve Book
    public void reserveBook(int id) {

        for (Book book : books) {

            if (book.getBookId() == id) {

                reservedBooks.offer(book);

                System.out.println("Book reserved.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // View Reserved Queue
    public void viewReservedBooks() {

        if (reservedBooks.isEmpty()) {

            System.out.println("No reserved books.");
            return;
        }

        for (Book book : reservedBooks) {

            System.out.println(book.getBookId() + " - " + book.getTitle());
        }
    }

    // Recently Viewed Stack
    public void viewRecentlyViewed() {

        if (recentlyViewed.isEmpty()) {

            System.out.println("No recently viewed books.");
            return;
        }

        for (int i = recentlyViewed.size() - 1; i >= 0; i--) {

            Book book = recentlyViewed.get(i);

            System.out.println(book.getBookId() + " - " + book.getTitle());
        }
    }

    // Statistics
    public void libraryStatistics() {

        int available = 0;

        for (Book book : books) {

            if (book.isAvailable()) {
                available++;
            }
        }

        System.out.println("\n===== Statistics =====");
        System.out.println("Total Books : " + books.size());
        System.out.println("Available Books : " + available);
        System.out.println("Issued Books : " + issuedBooks.size());
        System.out.println("Reserved Books : " + reservedBooks.size());
        System.out.println("Students : " + students.size());
    }
}