package week4.day1;

public class LoginPage extends BasePage{
	
	public void performCommonTasks(int tasks) {
		int b=6+tasks;
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.findElement("radiobutton");
		lp.clickElement("click checkbox");
		lp.enterText("checked");
		lp.performCommonTasks(4);
	}

}
