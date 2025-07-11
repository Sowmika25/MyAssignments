package week3.day2;

public class Browser {
	
	String browsername;
	int broeserversion;
	
	public void openURL() {
		System.out.println("Open the url");
	}
    public void closeBrowser() {
    	System.out.println("Close the browser");
    }
    public void navigateBack() {
    	System.out.println("Naviagate to the back page");
    }
	public static void main(String[] args) {
	   Browser b = new Browser();
	   b.openURL();
	   b.closeBrowser();
	   b.navigateBack();

	}

}
