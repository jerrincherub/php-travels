package agentfrontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage1 {
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
        	  email.sendKeys("agent@phptravels.com");
        	  
        	  WebElement password=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
        	  password.sendKeys("demoagent");
        	  WebElement login=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
        	  login.click();
        	  WebElement home=driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[1]/a"));
        	 	 home.click();
        	 	 Thread.sleep(1000);
        	 	 driver.navigate().back();
        	 	 Thread.sleep(1000);
        		 WebElement flight=driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a"));
        		 flight.click();
        		 Thread.sleep(1000);
        		 driver.navigate().back();
        		 Thread.sleep(1000);
        		 WebElement blogs=driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[6]/a"));
        		 blogs.click();
        		 Thread.sleep(1000);
        		 driver.navigate().back();
        		 Thread.sleep(1000);
        		 WebElement offers=driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[7]/a"));
        		 offers.click();
        		 Thread.sleep(1000);
        		 driver.navigate().back();
        		 Thread.sleep(1000);
        		
        		 WebElement tours=driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[5]/a"));
        		 tours.click();
        		
        		 Thread.sleep(1000);
        		 driver.navigate().back();
        		 Thread.sleep(1000);
        		 WebElement hotel=driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a"));
    			 hotel.click();
    			
    		
    		 WebElement usd=driver.findElement(By.xpath("//*[@id=\"currency\"]"));
    		 usd.click();
    		 WebElement inr=driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/div[2]/div/ul/li[7]/a"));
    		 inr.click();
    		Thread.sleep(1000);

    		 driver.navigate().back();
    		 Thread.sleep(1000);
    		 driver.navigate().back();
    		 Thread.sleep(1000);

        		 WebElement add_funds=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[3]/a"));
	        	  add_funds.click();
	        	  Thread.sleep(1000);
	        	  WebElement profile=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));
	        	  profile.click();
	        	  Thread.sleep(1000);
	        		 driver.navigate().back();
	        		 Thread.sleep(1000);
	        		 WebElement Bookings=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a"));
		        	  Bookings.click();
		        	  Thread.sleep(1000);
		        		 driver.navigate().back();
		        		 Thread.sleep(1000);
		        	
		        	 
	        		     		
	        		 WebElement logout=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a"));
		        	  logout.click();
		        	  Thread.sleep(1000);
		      	    
		        		 driver.navigate().back();
		        		 Thread.sleep(1000);
		        		 
		    
	        	 
        		
        		
        		
        	 
        		
			
	 	}
}

	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
