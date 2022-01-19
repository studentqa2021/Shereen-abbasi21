package shereen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testjava {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Driver/chromedriver.exe"); //driver path
		
		WebDriver driver = new ChromeDriver();// Yes == up casting 
		driver.get("https://www.amazon.com/");
	}
	
	
	
}
