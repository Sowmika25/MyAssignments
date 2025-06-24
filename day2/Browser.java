package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser br = new Browser();
		String name= br.launchBrowser("chrome");
		System.out.println(name);
		br.loadUrl();

	}

}
