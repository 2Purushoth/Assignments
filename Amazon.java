import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		
		WebElement Bags = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		String result = Bags.getText();
		System.out.println(result);
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		
		WebElement Arrivals = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		String arrivalsResult = Arrivals.getText();
		System.out.println(arrivalsResult);
		
		
		
		
		
		
		
	}

}
