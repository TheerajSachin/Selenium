package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class basic {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\eclipse-workspace\\MayMaven\\src\\main\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String a =driver.getCurrentUrl();
	System.out.println(a);
	String b =driver.getPageSource();
	System.out.println(b);
	String c =driver.getTitle();
	System.out.println(c);
	
}
}
