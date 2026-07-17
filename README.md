# Library Management System

## Overview

The **Library Management System** is a console-based Java application developed to demonstrate the practical implementation of **Data Structures and Algorithms (DSA)** along with **Object-Oriented Programming (OOP)** concepts.

The system allows users to manage books and students, issue and return books, reserve books, sort records, and perform efficient searching using various data structures from the Java Collections Framework.

---

## Features

* Add a new book
* Display all books
* Search book by ID
* Search book by title
* Add a new student
* Display all students
* Issue a book to a student
* Return an issued book
* Delete a book
* Sort books by title
* Reserve books
* View reserved books
* View recently searched/viewed books
* Display library statistics

---

## Data Structures Used

| Data Structure | Purpose                             |
| -------------- | ----------------------------------- |
| ArrayList      | Stores all books                    |
| HashMap        | Fast lookup of books and students   |
| Stack          | Stores recently viewed books        |
| Queue          | Manages reserved books using FIFO   |
| Comparator     | Sorts books alphabetically by title |

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework
* VS Code 

---

## Project Structure

```text
LibraryManagementSystem/
│
├── src/
│   ├── Main.java
│   ├── Library.java
│   ├── Book.java
│   ├── User.java
│   └── Student.java
│
└── README.md
```

---

## How to Run

1. Clone or download the project.
2. Open it in VS Code or IntelliJ IDEA.
3. Compile all Java files.
4. Run `Main.java`.
5. Select options from the menu to use the system.

---

## Menu

```text
1. Add Book
2. Display Books
3. Search Book by ID
4. Search Book by Title
5. Add Student
6. Display Students
7. Issue Book
8. Return Book
9. Delete Book
10. Sort Books by Title
11. Reserve Book
12. View Reserved Books
13. View Recently Viewed Books
14. Library Statistics
15. Exit
```

---

## DSA Concepts Demonstrated

* Dynamic data storage using `ArrayList`
* Constant-time average lookup using `HashMap`
* LIFO operations using `Stack`
* FIFO operations using `Queue`
* Linear searching
* Sorting using `Collections.sort()` and `Comparator`
* CRUD operations on collections

---

## Learning Outcomes

Through this project, the following concepts were applied:

* Java Object-Oriented Programming
* Java Collections Framework
* Searching and Sorting
* Stack and Queue implementation
* HashMap usage for efficient data retrieval
* Console-based application development
* Menu-driven programming

---

## Future Enhancements

* File handling for persistent storage
* Binary Search for sorted book lists
* Login system for admin and students
* Fine calculation for late returns
* GUI using Java Swing or JavaFX
* Database integration using MySQL

---

## Author

**Neha Jadhav**

Java | Data Structures & Algorithms | Object-Oriented Programming
