package week4.day1;

public class Overloading {
	
	public void reportStep(String msg , String status) {
		System.out.println(msg);
	}
	
	public void reportStep(String msg , String status, boolean snap) {
		System.out.println(status);
		System.out.println(snap);
	}

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.reportStep("testleaf", "training");
		ol.reportStep("testautomation", "traininginprogress", true);
		

	}

}
