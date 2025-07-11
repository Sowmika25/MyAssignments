package week3.day2;

public class Chrome extends Browser {
	
	public void openincognito() {
		System.out.println("Open the incognoito");
	}
	
	public void clearCache() {
		System.out.println("Clear the cache");
	}

	public static void main(String[] args) {
		
		Chrome ch = new Chrome();
		ch.openincognito();
		ch.clearCache();
		ch.openURL();
		ch.navigateBack();
		ch.closeBrowser();
	}

}
