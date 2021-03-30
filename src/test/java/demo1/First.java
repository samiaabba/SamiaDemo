package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\samia\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {

			driver.get("http://register.rediff.com/register/register.php");
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			WebElement e = driver.findElement(By.xpath("//input[@name='name5af18723']"));
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			e.sendKeys("samia abba");
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			String actualValue = e.getAttribute("value");
			System.out.println(actualValue);
			Thread.sleep(2000);
		} catch (Exception ex) {
			System.out.println("Exception" + ex.getMessage());
		} finally {
			driver.close();
			driver.quit();
		}
	}

}
