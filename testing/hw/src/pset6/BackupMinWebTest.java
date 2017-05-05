package pset6;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackupMinWebTest {
	
	private static WebDriver driver;
	
	/** runs once at startup.
	 * sets up the test suite at the beginning. <br>
	 */
	@BeforeClass
	public static void setUpClass() {
		driver = new FirefoxDriver(); // launch the browser
		//System.setProperty("webdriver.gecko.driver" , "geckodriver.exe");
	}
	
	/** runs once at completion.
	 * cleans up the test suite at the end. <br>
	 * @throws InterruptedException 
	 */
	@AfterClass
	public static void tearDownClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test // execute the test <x = 0, y = 0, z = 0, submitButton = click> and check the output message is correct
	public void t0() {
		
		// edit the next line to enter the location of "min.html" on your file system
		driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/minandmax.html");
		driver.findElement(By.id("x")).sendKeys("0"); // enter value for x
		driver.findElement(By.id("y")).sendKeys("0"); // enter value for z
		driver.findElement(By.id("z")).sendKeys("0"); // enter value for y
		
		
		driver.findElement(By.id("computeButton")).click(); // computeButton click
		
		WebElement result = driver.findElement(By.id("result"));
		String output = result.getText(); // read the output text
		assertEquals("min(0, 0, 0) = 0", output);
	}
}
