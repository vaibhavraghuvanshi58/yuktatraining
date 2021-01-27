import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTest {
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\git\\yuktatraining\\driver\\chromedriver.exe");
		// i need to add driver to my code
		// Chrome = webdriver.chrome.driver
		// ie = webdriver.ie.driver
		//  mozilla = webdriver.gecko.driver

	}
	
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver(); // creating object is like creating a new session
		
		// maximise my browser
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open any website
		// protocol is mandate
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaibhav");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vaibhav");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Forgotten password?']/..")));
		String txt = driver.findElement(By.xpath("//a[text()='Forgotten password?']/..")).getText();
		System.out.println(txt);
		
	}
}
