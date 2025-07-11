package week3.day2;

public class Button extends WebElement {
    
	public void submit() {
		System.out.println("Submit the form");
	}
	
	public static void main(String[] args) {
		
		Button bt = new Button();
		bt.click();
		bt.setText("TestLeaf Button Subclass");
		
	}

}
