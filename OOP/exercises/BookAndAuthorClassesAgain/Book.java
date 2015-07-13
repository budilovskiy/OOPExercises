package oop.excercises.authorandbookclassesagain;

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
*/

public class Book {

	private String name;
	private Author[] authors;
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
	public Book(String name, Author[] authors, double price) {
		this(name, authors, price, 0);
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
	public Book(String name, Author[] authors, double price, int qtyInStrock) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qtyInStock = qtyInStrock;
	}

	// Getters (for name, author, price, qtyInStock) and setters (for price and
	// qtyInStock)
	public String getName() {
		return name;
	}

	public Author getAuthors() {
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
		return "name " + "by " + authors.length + " authors";
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
	
	/**
	 * A new method printAuthors() to print the names of all the authors.
	 */
	public void ptintAuthors() {
		for (int i = 0; i < authors.length; i++) {
			System.out.print(authors[i]);
			if (i != authors.length - 1)
				System.out.print("; ");
		}
	}
}
