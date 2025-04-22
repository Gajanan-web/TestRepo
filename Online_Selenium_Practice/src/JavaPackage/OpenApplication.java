package JavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jar files\\chromedriver-win64\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chatgpt.com");
		

	}

}
