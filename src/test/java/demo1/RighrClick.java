package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")
public class RighrClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\samia\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("http://www.google.com/");
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.id("hplogo"));
			Actions builder = new Actions(driver);
			Action rightclick = builder.contextClick(element).build();
			rightclick.perform();
			Thread.sleep(8000);

		} catch (Exception e) {

			System.out.println("Exception - > " + e.toString());

		} finally {
			driver.close();
		}
	}

}
