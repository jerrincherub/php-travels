package agentfrontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invalid2 {
	WebDriver driver;
	 	@Test
	 	 public void Logindetails() throws InterruptedException
	 	{

	 		 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://phptravels.com/demo");
			 driver.manage().window().maximize();
			 WebElement Login=driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[3]/div/div/div[1]/div/div/div/div/div/a"));
			
		Login.click();
		
			for(String winHandle:driver.getWindowHandles())
			{
				driver.switchTo().window(winHandle);
			}
			 WebElement email=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"));;
        	  email.sendKeys("jer#@gmail.com");
        	  
        	  WebElement password=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
        	  password.sendKeys("jerrin");
        	  WebElement login=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
        	  login.click();
			Thread.sleep(1000);
	 	}
}

	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
