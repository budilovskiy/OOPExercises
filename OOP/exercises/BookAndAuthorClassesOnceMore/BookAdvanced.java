package oop.excercises.bookandauthorclassesoncemore;

import java.util.ArrayList;
import java.util.List;

/** 
* A class called Book is designed as shown in the class diagram. It contains:
* - Four private instance variables: name (String), author (of the class Author you have just created,
* assume that each book has one and only one author), price (double), and qtyInStock (int);
*- Two constructors:
*	public Book (String name, Author author, double price) {...}
*	public Book (String name, Author author, double price, int qtyInStock) {...}
*- public methods getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock().
*	toString() that returns "'book-name' by author-name (gender) at email".
*	(Take note that the Author's toString() method returns "author-name (gender) at email".)
* Write the class Book (which uses the Author class written earlier). Also write a test program
* called TestBook to test the constructor and public methods in the class Book.
* Take Note that you have to construct an instance of Author before you can construct an instance 
* of Book. E.g.,
*	Author anAuthor = new Author(......);
*	Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
*	// Use an anonymous instance of Author
*	Book anotherBook = new Book("more Java for dummy", new Author(......), 29.95, 888);
*	
*
* Exercise: Book and Author Classes Again - An Array of Objects as an Instance Variable
* 
* In the earlier exercise, a book is written by one and only one author. In reality, a 
* book can be written by one or more author. Modify the Book class to support one or more 
* authors by changing the instance variable authors to an Author array. Reuse the Author 
* class written earlier.
* Notes:
* - The constructors take an array of Author (i.e., Author[]), instead of an Author instance.
* - The toString() method shall return "book-name by n authors", where n is the number of authors.
* - A new method printAuthors() to print the names of all the authors.
* You are required to:
* - Write the code for the Book class. You shall re-use the Author class written earlier.
* - Write a test program (called TestBook) to test the Book class.
* 
* Hints:
* 	// Declare and allocate an array of Authors
* 	Author[] authors = new Author[2];
* 	authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
* 	authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
*  
* 	// Declare and allocate a Book instance
* 	Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
* 	System.out.println(javaDummy);  // toString()
* 	System.out.print("The authors are: ");
* 	javaDummy.printAuthors();
* 
* 
* Exercise: Book and Author Classes Once More - A Fixed-length Array of Objects as 
* an Instance Variable
* 
* In the above exercise, the number of authors cannot be changed once a Book instance 
* is constructed. Suppose that we wish to allow the user to add more authors (which 
* is really unusual but presented here for academic purpose).
* We shall remove the authors from the constructors, and add a new method called 
* addAuthor() to add the given Author instance to this Book.
* We also need to pre-allocate an Author array, with a fixed length (says 5 - a book 
* is written by 1 to 5 authors), and use another instance variable numAuthors (int) 
* to keep track of the actual number of authors.
* 
* You are required to:
* 1. Modify your Book class to support this new requirement.
* 
* Hints:
* public class Book {
*   // private instance variable
*    private Author[] authors = new Author[5]; // declare and allocate the array
*                                              // BUT not the element's instance
*    private int numAuthors = 0;
* 
*    ......
*    ......
* 
*    public void addAuthor(Author author) {
*       authors[numAuthors] = author;
*       ++numAuthors;
*    }
* }
*  
* // Test program
* Book javaDummy = new Book("Java for Dummy", 19.99, 99);
* System.out.println(javaDummy);  // toString()
* System.out.print("The authors are: ");
* javaDummy.printAuthors();
*  
* javaDummy.addAuthor(new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'));
* javaDummy.addAuthor(new Author("Paul Tan", "Paul@nowhere.com", 'm'));
* System.out.println(javaDummy);  // toString()
* System.out.print("The authors are: ");
* javaDummy.printAuthors();
* 
* 2. Try writing a method called removeAuthorByName(authorName), that remove the author 
* from this Book instance if authorName is present. The method shall return true if 
* it succeeds.
* 
* boolean removeAuthorByName(String authorName)
* 
* Advanced Note: Instead of using a fixed-length array in this case, it is better to 
* be a dynamically allocated array (e.g., ArrayList), which does not have a fixed 
* length.
*/

public class Book {

	private String name;
	// Instead of using a fixed-length array in this case, it is better to 
	// be a dynamically allocated array (e.g., ArrayList), which does not have a fixed 
	// length.
	private List<Author> authors = new ArrayList<>();
	private int numAuthors = 0;
	private double price;
	private int qtyInStock;

	/**
	 * Constructor to initialize the name and price with the given
	 * values qtyInStrock initializes with the default value (0)
	 * 
	 * @param name
	 * @param author
	 * @param price
	 * @param qtyInStrock
	 */
	public Book(String name, double price) {
		this(name, price, 0);
	}

	/**
	 * Constructor to initialize the name, price and qtyInStrock with
	 * the given values
	 * 
	 * @param name
	 * @param author
	 * @param price
	 * @param qtyInStrock
	 */
	public Book(String name, double price, int qtyInStrock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStrock;
	}

	// Getters (for name, author, price, qtyInStock) and setters (for price and
	// qtyInStock)
	public String getName() {
		return name;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return name + " by " + numAuthors + " authors";
	}

	// Introduce new methods called getAuthorName(), getAuthorEmail(),
	// getAuthorGender() in the Book class to return the name, email and gender
	// of the author of the book. For example,
	// public String getAuthorName() { ...... }
	
	public String getAuthorName(Author author) {
		return author.getName();
	}
	
	public String getAuthorEmail(Author author) {
		return author.getEmail();
	}
	
	public char getAuthorGender(Author author) {
		return author.getGender();
	}
	
	/**
	 * A new method printAuthors() to print the names of all the authors.
	 */
	public void printAuthors() {
		for (int i = 0; i < authors.size(); i++) {
			System.out.print(authors.get(i));
			if (i != authors.size() - 1)
				System.out.print("; ");
		}
		System.out.println();
	}
	
	/**
	 * Method addAuthor() to add the given Author
	 * instance to this Book.
	 * 
	 * @param author
	 */
	public void addAuthor(Author author) {
		authors.add(author);
		++numAuthors;
	}
	
	/**
	 * Method removeAuthorByName(authorName), that remove the 
	 * author from this Book instance if authorName is present. 
	 * The method shall return true if it succeeds.
	 * 
	 * @param authorName
	 * @return return true if it author is removed or false if not.
	 */
	public boolean removeAuthorByName(String authorName) {
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).getName().equals(authorName)) {
				authors.remove(i);
				--numAuthors;
				return true;
			}
		}
		return false;
	}
}
