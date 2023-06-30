import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbhiBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver(options);
		
		//Load the url
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("chennai");
		
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//input[@id='datepicker1']"));
		
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.linkText("search")).click();
		
		
	    
		
		
	}

}
