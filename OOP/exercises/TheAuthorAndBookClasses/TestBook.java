package oop.excercises.theauthorandbookclasses;

public class TestBook {

	public static void main(String[] args) {
		Author johnatan = new Author("Johnatan S. Foer", "foer@nowhere.com",
				'm');
		System.out.println(johnatan);
		johnatan.setEmail("s_foer@nowhere.com");
		System.out.println(johnatan);
		System.out.println("\nBooks:");

		Book illuminated = new Book("Everything is Illuminated", johnatan,
				9.99, 58);

		// Use an anonymous instance of Author
		Book slaughterhouse = new Book("Slaughterhouse-Five", new Author(
				"Kurt Vonnegut", "vonnegut@nowhere.com", 'm'), 10.99);

		System.out.println(illuminated);
		System.out.println(slaughterhouse);

		// Printing the name and email of the author from a Book instance.
		// (Hint: aBook.getAuthor().getName(), aBook.getAuthor().getEmail()).
		System.out.println(slaughterhouse.getName() + " by "
				+ slaughterhouse.getAuthor().getName() + " at "
				+ slaughterhouse.getAuthor().getEmail());

	}
}
