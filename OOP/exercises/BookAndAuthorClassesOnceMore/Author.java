package oop.excercises.bookbadbuthorclassesoncemore;

/**
 * A class called Author is designed as shown in the class diagram. It contains:
 - Three private instance variables: name (String), email (String), and gender (char of either 'm' or 'f');
 - One constructor to initialize the name, email and gender with the given values;
	public Author (String name, String email, char gender) {......}
	(There is no default constructor for Author, as there are no defaults for name, email and gender.)
	
 - public getters/setters: getName(), getEmail(), setEmail(), and getGender();
	(There are no setters for name and gender, as these attributes cannot be changed.)
 - A toString() method that returns "author-name (gender) at email", e.g., "Tan Ah Teck (m) at ahTeck@somewhere.com".
Write the Author class. Also write a test program called TestAuthor
to test the constructor and public methods. Try changing the email of an author, e.g.,
	
	Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
	System.out.println(anAuthor);   // call toString()
	anAuthor.setEmail("paul@nowhere.com")
	System.out.println(anAuthor);
	
Take note that both Book and Author classes have a variable called name. 
However, it can be differentiated via the referencing instance. For a Book instance says aBook, 
aBook.name refers to the name of the book; whereas for an Author's instance say auAuthor, anAuthor.name 
refers to the name of the author. There is no need (and not recommended) to call the variables bookName 
and authorName.
	
TRY:
1. Printing the name and email of the author from a Book instance. (Hint: aBook.getAuthor().getName(),
	aBook.getAuthor().getEmail()).
2. Introduce new methods called getAuthorName(), getAuthorEmail(), getAuthorGender() in the Book class 
	to return the name, email and gender of the author of the book. For example,
	public String getAuthorName() { ...... }
 */

public class Author {

	private String name;
	private String email;
	private char gender;
	
	
	/**
	 * Constructor to initialize the name, email and gender with the given values
	 * @param name
	 * @param email
	 * @param gender
	 */
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	/**
	 * Getter for instance variable name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter for instance variable email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Getter for instance variable gender
	 * @return gender
	 */
	public char getGender() {
		return gender;
	}
	
	/**
	 * Setter for instance variable email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return name + " (" + gender + ") at " + email;
	}
}
