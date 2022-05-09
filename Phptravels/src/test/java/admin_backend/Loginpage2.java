package admin_backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage2 {
	WebDriver driver;
	 	@Test
	 	 public void Logindetails() throws InterruptedException
	 	{

	 		 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://phptravels.com/demo");
			 driver.manage().window().maximize();
			 WebElement Login=driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[4]/div/div/div[1]/div/div/div/div/div/a"));
			 
		Login.click();
		
			for(String winHandle:driver.getWindowHandles())
			{
				driver.switchTo().window(winHandle);
			}
			 WebElement email=driver.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[1]/label/input"));;
        	  email.sendKeys("admin@phptravels.com");
        	  
        	  WebElement password=driver.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[2]/label/input"));
        	  password.sendKeys("demoadmin");
        	  WebElement login=driver.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]"));
        	  login.click();
        	  Thread.sleep(1000);
        	
        	 
	        	 
	        	// driver.get("https://www.phptravels.net/api/admin/booking/pending");
        	  WebElement Booking=driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[2]/a"));
	        	 Booking.click();
	        	 WebElement pendingbooking=driver.findElement(By.id("booking_status"));
				  
	        	  pendingbooking.click();
	        	  
	        	  Select s=new Select(pendingbooking);
	        	  s.selectByIndex(1);
	        	  Thread.sleep(1000);
	        	 
	        	  
	        	
	        	 WebElement payment=driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[12]/select"));
	        	payment.click();
	        	 
	        
	        		 Select t=new Select(payment);
		        	  t.selectByIndex(1);
		        	  Thread.sleep(1000);
		        	 
		        	 
		        	Thread.sleep(1000);
		        	
	        	 WebElement invoice=driver.findElement(By.xpath("//*[@id=\"data\"]/tbody/tr/td[14]/a/i"));
    			 invoice.click();
    			 Thread.sleep(1000);
    			// driver.get("https://www.phptravels.net/api/admin/bookings");
    			
    			 
    			
	        	// driver.navigate().to("https://www.phptravels.net/api/admin/bookings");
	        	// driver.navigate().back();
	        	 Thread.sleep(1000);
	        	 
	        	 driver.close();
	        	// WebElement website=driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[1]/a"));
		        	// website.click();
		        	 Thread.sleep(1000);
		        	 driver.navigate().back();
		        	 Thread.sleep(1000);
		        	
	        	
    			driver.close();
	       
	        	
	        	WebElement cancelledbooking=driver.findElement(By.className("form-select status cancelled"));
		        	cancelledbooking.click();
		        	
	        	
	        	
	        			 Thread.sleep(1000);
	    	        	 driver.navigate().back();
	    	        	 Thread.sleep(1000);
	    	        	 
          	 
				  
		        	 
	    
			
	 	}
}

	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
