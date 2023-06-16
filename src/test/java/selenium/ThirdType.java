package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdType {
	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		WebElement a =driver.findElement(By.xpath("//button[@value = '1']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(a).perform();
		act.contextClick(a).perform();
		Robot chitti = new Robot();
		for(int i=0;i<5;i++) {
		chitti.keyPress(KeyEvent.VK_DOWN);
		chitti.keyRelease(KeyEvent.VK_DOWN);
		
		}	
}
}