package week1.day2;

public class Library {
   
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
   public void issueBook() {
	   System.out.println("Book issued successfully");
   }
   
	public static void main(String[] args) {
		Library lib = new Library();
		String name= lib.addBook("Julius Caesar");
		System.out.println(name);
		lib.issueBook();
	}

}
