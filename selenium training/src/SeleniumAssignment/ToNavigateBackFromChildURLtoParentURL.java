package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateBackFromChildURLtoParentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.navigate().refresh();
		
		driver.navigate().forward();
		driver.get("https://demowebshop.tricentis.com/");
		driver.navigate().back();
		
	}

}
