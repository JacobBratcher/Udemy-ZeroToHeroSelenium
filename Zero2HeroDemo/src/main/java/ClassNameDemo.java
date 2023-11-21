	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ClassNameDemo {

		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			
			// sets url
			driver.get("https://www.facebook.com");
			
			// counts the number of boxes using the same class element  
			List <WebElement> textBoxCount = driver.findElements(By.className("inputtext")); 
			
			// prints to the console the amount of text boxes using the same class
			System.out.println("Total text boxes are " + textBoxCount.size());
			
			// sends email and passwords to those text boxes 
			textBoxCount.get(0).sendKeys("test@gmail.com");
			textBoxCount.get(1).sendKeys("FakePassword");
			
		}
	}