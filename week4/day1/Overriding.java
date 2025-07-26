package week4.day1;

public class Overriding extends Overloading {
	
	public void reportStep(String msg , String status, boolean snap) {
		System.out.println(status);
		System.out.println(snap);
	}
	public static void main(String[] args) {
		Overriding or = new Overriding();
		or.reportStep("seleniumautomation", "automationinprogress", false);
		
		

	}

}
