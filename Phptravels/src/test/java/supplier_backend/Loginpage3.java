package supplier_backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage3 {
	WebDriver driver;
	 	@Test
	 	 public void Logindetails() throws InterruptedException
	 	{

	 		 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://phptravels.com/demo");
			 driver.manage().window().maximize();
			 WebElement Login=driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[5]/div/div/div[1]/div/div/div/div/div/a"));
			 
		Login.click();
		
			for(String winHandle:driver.getWindowHandles())
			{
				driver.switchTo().window(winHandle);
			}
			 WebElement email=driver.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[1]/label/input"));;
        	  email.sendKeys("supplier@phptravels.com");
        	  
        	  WebElement password=driver.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[2]/label/input"));
        	  password.sendKeys("demosupplier");
        	  WebElement login=driver.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]"));
        	  login.click();
        	  Thread.sleep(1000);
        	  WebElement dashboard=driver.findElement(By.xpath("//*[@id=\"drawerAccordion\"]/div/div/a[3]"));
        	  dashboard.click();
        	  Thread.sleep(1000);
        	  WebElement hotels=driver.findElement(By.xpath("//*[@id=\"drawerAccordion\"]/div/div/a[4]/div[2]/i"));
         	  hotels.click();
         	 
        	  Thread.sleep(1000);
        	  WebElement tours=driver.findElement(By.xpath("//*[@id=\"drawerAccordion\"]/div/div/a[5]/div[2]/i"));
        		 tours.click();
        		 Thread.sleep(1000);
        		 WebElement bookings=driver.findElement(By.xpath("//*[@id=\"drawerAccordion\"]/div/div/a[6]/div[2]/i"));
        		 bookings.click();
        	
        		 Thread.sleep(1000);
        		 driver.navigate().back();
        		 Thread.sleep(1000);
        		
        	
			
	 	}
}

	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
