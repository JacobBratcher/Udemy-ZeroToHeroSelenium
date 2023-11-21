	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class TagNameDemo {

		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			
			// sets url
			driver.get("https://www.facebook.com");
			
			List <WebElement> linksCount = driver.findElements(By.tagName("a"));
		
			System.out.println("Total number of links are: " + linksCount.size());
			
			for (int i = 0 ; i<linksCount.size() ; i++) {
			
			System.out.println(linksCount.get(i).getText());
			
			}		
		}
	}