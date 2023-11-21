import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		// sets url
		driver.get("https://www.facebook.com");
		
		// sends email 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testemail123@gmail.com");
		
		// sends password
		driver.findElement(By.name("pass")).sendKeys("DumbPassword");
		
		// clicks log in button 
		driver.findElement(By.name("login")).click();	
		
		
	
	}
	
}
