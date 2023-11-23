package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class OrangeHRM {

	@Test
	
	    public void logintext() throws Exception
	    {
	        System.setProperty("webdriver.gecko.driver","C:\\Users\\ajayd\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	            driver.get("http://localhost/orangehrm/orangehrm-5.5/web/index.php/auth/login");
	            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("ajay1999");
	            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("orangeHRM123@");
	            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	           driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	           driver.findElement(By.linkText("Add Employee")).click();
	           driver.findElement(By.name("firstName")).sendKeys("Ajay");
	           driver.findElement(By.name("middleName")).sendKeys("D");
	           driver.findElement(By.name("lastName")).sendKeys("V");
	           driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	           
	    
	           Thread.sleep(8000);
	         
	           driver.quit();
	           
	           System.out.println("end");
	}
}
