package week3.day2;

public class TextField extends WebElement {
	
	public void getText() {
		System.out.println("Print the text value");
	}

	public static void main(String[] args) {
		
       TextField tf = new TextField();
       tf.click();
       tf.setText("TestLeaf TextField Subclass");
	}

}
