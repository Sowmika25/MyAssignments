package week3.day2;

public class TestData {
	
	public void enterCredentials() {
		System.out.println("Enter the credentials");
	}
	
	public void  navigateToHomePaage() {
		System.out.println("Navigate to the Homepage");
	}
	

	public static void main(String[] args) {
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomePaage();
	}

}
