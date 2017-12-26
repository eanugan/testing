package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facbook.com");

		driver.findElement(By.name("firstname")).sendKeys("Siva");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.id("u_0_l")).sendKeys("9611922988");
		driver.findElement(By.id("u_0_s")).sendKeys("Sivakumar");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select selectd = new Select(day);
		selectd.selectByVisibleText("19");

		WebElement month = driver.findElement(By.id("month"));
		Select selectm = new Select(month);
		selectm.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		Select selecty = new Select(year);
		selecty.selectByVisibleText("1984");
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_4")).click();
		
		driver.findElement(By.id("u_0_3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_4")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_y")).click();
		
		
	}
	
}
