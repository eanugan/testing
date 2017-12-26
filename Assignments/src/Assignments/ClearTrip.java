package Assignments;

import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {

		LocalDate dtt = LocalDate.now().plusDays(1);
		System.out.println(dtt);
		String ldt = dtt.toString();
		String[] ldtdate = ldt.split("-");
		String tomorrow = ldtdate[2];
		System.out.println(tomorrow);
		Date dt = new Date();
		
		String str = dt.toString();
		
		System.out.println(str);
		String[] s = str.split(" ");
		String today= s[2];
		System.out.println(today);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText(today)).click();
		Thread.sleep(5000);
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText(tomorrow)).click();
	}

}
