import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementVSelements {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		// sets url
		driver.get("https://www.google.com");
		
		// identify text box using WebElement 
		WebElement searchTextBox = driver.findElement(By.name("q"));
		
		searchTextBox.sendKeys("Hello World!");
	}

}
