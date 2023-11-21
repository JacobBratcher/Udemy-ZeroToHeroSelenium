import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		// sets url
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		
	}
}
