package selenium;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	WebElement a = driver.findElement(By.xpath("//input[@type = 'text']"));
	a.sendKeys("Vivo Mobiles",Keys.ENTER);
	List<WebElement> A = driver.findElements(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']"));
	for(int i =1;i<A.size();i++) {
		WebElement b = A.get(i);	}
	System.out.println(A);
		
		

}
}