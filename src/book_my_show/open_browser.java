package book_my_show;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class open_browser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\rohit\\OneDrive\\Desktop\\Rohit\\driver\\chromedriver-win64\\chromedriver.exe");
				
		ChromeOptions chrome=new ChromeOptions();
		       
	         	chrome.addArguments("start-maximize");
	         	chrome.setBinary("C:\\Users\\rohit\\OneDrive\\Desktop\\Rohit\\chrome-win64\\chrome.exe");
		
				WebDriver driver=new ChromeDriver();
				
				//open URL
				
				driver.get("https://in.bookmyshow.com/explore/home/");
				Thread.sleep(5000);
				
				//click on City select with bangaluru
				driver.findElement(By.xpath("(//span[@class='bwc__sc-ttnkwg-16 dizuyr'])[3]")).click();
				Thread.sleep(5000);
				
				//click on Sign In
				driver.findElement(By.xpath("//div[text()='Sign in']")).click();
				Thread.sleep(5000);
				
				//click on Continue with Email
				driver.findElement(By.xpath("(//div[@class='bwc__sc-dh558f-14 fPrBPf'])[2]")).click();
				Thread.sleep(5000);
				
				//enter selauto@yopmail.com
				driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("selauto@yopmail.com");
			
				Thread.sleep(5000);
				
				//click on continue button
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				
				Thread.sleep(5000);
				
				driver.navigate().to("https://yopmail.com/");
				
				Thread.sleep(5000);
				
				//("https://yopmail.com/");
				
				driver.findElement(By.xpath("//input[@class='ycptinput']")).sendKeys("selauto@yopmail.com");
				
				driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
				
				
			
				
				
				
				
	}

	}


