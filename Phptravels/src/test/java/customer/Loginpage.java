package customer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.model.NavigatedWithinDocument;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	WebDriver driver;
	 	@Test
	 	 public void Logindetails()  throws InterruptedException
	 	{

	 		 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://phptravels.com/demo");
			 driver.manage().window().maximize();
			 WebElement Login=driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[1]/div/div/div/div/div/a"));
			 
		Login.click();
		
			for(String winHandle:driver.getWindowHandles())
			{
				driver.switchTo().window(winHandle);
			}
			 WebElement email=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"));;
        	  email.sendKeys("user@phptravels.com");
        	  
        	  WebElement password=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
        	  password.sendKeys("demouser");
        	  WebElement login=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
        	  login.click();
        	  Thread.sleep(1000);
        	  WebElement add_funds=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[3]/a"));
        	  add_funds.click();
        	  WebElement paypal=driver.findElement(By.xpath("//*[@id=\"gateway_paypal\"]"));
        	  paypal.click();
        	  
        	  WebElement paynow=driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button"));
        	  paynow.click();
        	  Thread.sleep(1000);
        	driver.navigate().back();
        	Thread.sleep(1000);
        	 WebElement Bookings=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a"));
       	  Bookings.click();
       	  Thread.sleep(2000);
       	  driver.navigate().back();
       	  Thread.sleep(1000);
       	 WebElement profile=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));
   	  profile.click();
   	 WebElement address=driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[12]/td[3]/div/input"));
   			  address.sendKeys("Eastfort thrissur");
   		//	  WebElement update=driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
   		//	JavascriptExecutor jse=(JavascriptExecutor)driver;
			//jse.executeScript("argument[0].click()",update);
   			  // update.click();
   			 Thread.sleep(1000);
   			 driver.navigate().back();
   			 Thread.sleep(1000);
   			 WebElement logout=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a"));
       	  logout.click();
   Thread.sleep(1000);
   driver.navigate().back();
   Thread.sleep(1000);
   driver.close();
  	 	
		
		}
}

	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
