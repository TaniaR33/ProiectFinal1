package ProiectFinal;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class pageSetup {
	static WebDriver driver;

	@Before
	public void init() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tattt\\OneDrive\\Desktop\\Testare software curs\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://dalimag.ro/");
		

	}

	@After
	public void exit() throws InterruptedException {
		driver.quit();
		Thread.sleep(3000);

	}
}
