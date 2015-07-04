/**
A class called Book is designed as shown in the class diagram. It contains:
 - Four private instance variables: name (String), author (of the class Author you have just created, assume that each book has one and only one author), price (double), and qtyInStock (int);
 - Two constructors:
	public Book (String name, Author author, double price) {...}
	public Book (String name, Author author, double price, int qtyInStock) {...}
 - public methods getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock().
	toString() that returns "'book-name' by author-name (gender) at email".
	(Take note that the Author's toString() method returns "author-name (gender) at email".)

Write the class Book (which uses the Author class written earlier). Also write a test program
called TestBook to test the constructor and public methods in the class Book.
Take Note that you have to construct an instance of Author before you can construct an instance of Book. E.g.,

	Author anAuthor = new Author(......);
	Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
	// Use an anonymous instance of Author
	Book anotherBook = new Book("more Java for dummy", new Author(......), 29.95, 888);
*/

package oop.excercises.theauthorandbookclasses;

public class Book {

	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	/**
	 * Constructor to initialize the name, author and price with the given
	 * values qtyInStrock initializes with the default value (0)
	 * 
	 * @param name
	 * @param author
	 * @param price
	 * @param qtyInStrock
	 */
	public Book(String name, Author author, double price) {
		this(name, author, price, 0);
	}

	/**
	 * Constructor to initialize the name, author, price and qtyInStrock with
	 * the given values
	 * 
	 * @param name
	 * @param author
	 * @param price
	 * @param qtyInStrock
	 */
	public Book(String name, Author author, double price, int qtyInStrock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStrock;
	}

	// Getters (for name, author, price, qtyInStock) and setters (for price and
	// qtyInStock)
	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
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
		return name + " by " + author;
	}

	// Introduce new methods called getAuthorName(), getAuthorEmail(),
	// getAuthorGender() in the Book class to return the name, email and gender
	// of the author of the book. For example,
	// public String getAuthorName() { ...... }
	
	public String getAuthorName() {
		return author.getName();
	}
	
	public String getAuthorEmail() {
		return author.getEmail();
	}
	
	public char getAuthorGender() {
		return author.getGender();
	}
}
