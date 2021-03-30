package demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HomePage {
	WebDriver driver;

	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\samia\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankofamerica.com/");
		driver.findElement(By.xpath("//a[@id='NAV_PERSONAL']")).click();

		driver.navigate().forward();
		driver.findElement(By.xpath("//a[@id='NAV_BUSINESS_ADVANTAGE']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='NAV_WEALTH_MANAGEMENT']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath(" //a[@id='NAV_BUSINESS_INSTITUTIONS']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='NAV_SECURITY']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='NAV_ABOUT_US']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='NAV_EN_ES']")).click();

		driver.navigate().forward();
		driver.findElement(By.xpath("//a[@id='NAV_CONTACT_US']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='NAV_HELP']")).click();

		driver.navigate().back();
		driver.findElement(By.id("navChecking")).click();
		driver.findElement(By.id("exploreCheckingSolutions")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='navSavings']//span[contains(text(),'Savings')]")).click();
		driver.findElement(By.xpath("//a[@id='rewardsSavingsAccount']")).click();

		driver.navigate().back();
		driver.findElement(By.id("navCreditCards")).click();
		driver.findElement(By.id("cashRewardsCards")).click();

		driver.navigate().back();
		driver.findElement(By.id("navHomeLoans")).click();
		driver.findElement(By.id("mortgages")).click();

		driver.navigate().back();
		driver.findElement(By.id("navAutoLoans")).click();
		driver.findElement(By.id("autoApplyNow")).click();

		driver.navigate().back();
		driver.findElement(By.id("navInvesting")).click();
		driver.findElement(By.id("buildYourPortfolio")).click();

//	driver.navigate().back();
//	driver.findElement(By.id("navBetterMoneyHabits")).click();
//	driver.findElement(By.xpath("//section[@id='navBetterMoneyHabitsContent']//div//div//div//ul")).click();
		// driver.findElement(By.id("bmhRetirementb;;;;obibuo;nuio;ipoiiiiiiiiiiiiiiiiiiiuppppppppppppiy")).click();
		// driver.navigate().back();
		// driver.findElement(By.xpath("//input[@id='onlineId1']")).sendKeys("samia1984");*/
	}

	@BeforeClass
	public void beforeClass() {
		driver.quit();

	}

	@AfterClass
	public void afterClass() {
	}

}
