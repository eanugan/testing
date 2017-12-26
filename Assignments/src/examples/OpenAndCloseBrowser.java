package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndCloseBrowser {

	public static void main(String[] args) throws Exception {

		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("lst-ib")).sendKeys("Test");
		Thread.sleep(5000);
		driver.close();
	}

}
