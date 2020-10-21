package launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
	public static void main(String[] args) {
		
		//String key="webdriver.chrome.driver";
		//String value="./drive/chromedriver.exe";
		//System.setProperty(key, value);
		
		//no need to write above 3 lines 
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		new ChromeDriver();
	}
}
