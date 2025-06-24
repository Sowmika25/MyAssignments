package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library l = new Library();
		String bookName = l.addBook("The Giant");
		System.out.println(bookName);
		l.issueBook();
	}

}
