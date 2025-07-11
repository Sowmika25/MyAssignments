package week3.day2;

public class Edge extends Chrome{
	
	public void takeSnap() {
		System.out.println("Take a snapshot of this page");
	}
	
	public void clearCookies() {
		System.out.println("Clear the cookies");
	}

	public static void main(String[] args) {
		Edge ed = new Edge();
		ed.takeSnap();
		ed.clearCookies();
		ed.openincognito();
		ed.clearCache();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
	}

}
