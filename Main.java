import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n========== Library Management System ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Add Student");
            System.out.println("6. Display Students");
            System.out.println("7. Issue Book");
            System.out.println("8. Return Book");
            System.out.println("9. Delete Book");
            System.out.println("10. Sort Books by Title");
            System.out.println("11. Reserve Book");
            System.out.println("12. View Reserved Books");
            System.out.println("13. View Recently Viewed Books");
            System.out.println("14. Library Statistics");
            System.out.println("15. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:

                    library.displayBooks();
                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();

                    library.searchBookById(searchId);
                    break;

                case 4:

                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String searchTitle = sc.nextLine();

                    library.searchBookByTitle(searchTitle);
                    break;

                case 5:

                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine();

                    library.addStudent(new Student(studentId, studentName));
                    break;

                case 6:

                    library.displayStudents();
                    break;

                case 7:

                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();

                    System.out.print("Enter Student ID: ");
                    int issueStudentId = sc.nextInt();

                    library.issueBook(issueBookId, issueStudentId);
                    break;

                case 8:

                    System.out.print("Enter Book ID: ");
                    int returnBookId = sc.nextInt();

                    library.returnBook(returnBookId);
                    break;

                case 9:

                    System.out.print("Enter Book ID to Delete: ");
                    int deleteId = sc.nextInt();

                    library.deleteBook(deleteId);
                    break;

                case 10:

                    library.sortBooksByTitle();
                    System.out.println("Books Sorted Successfully.");
                    break;

                case 11:

                    System.out.print("Enter Book ID to Reserve: ");
                    int reserveId = sc.nextInt();

                    library.reserveBook(reserveId);
                    break;

                case 12:

                    library.viewReservedBooks();
                    break;

                case 13:

                    library.viewRecentlyViewed();
                    break;

                case 14:

                    library.libraryStatistics();
                    break;

                case 15:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}