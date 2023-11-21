	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class LinkDemo {

		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			
			// sets url
			driver.get("https://www.facebook.com");
			
			// clicks link by finding Forgot password text 
			//driver.findElement(By.linkText("Forgot password?")).click(); 
			
			// clicks link by finding partial link text, in this case Forgot passwo
			//driver.findElement(By.partialLinkText("Forgot passwo")).click();
			
			// sets the link as a web element 
			WebElement link = driver.findElement(By.linkText("Forgot password?"));
			
			// boolean variable for display status of link
			boolean isDisplayStatus = link.isDisplayed();
			
			// displays the status of link being displayed
			System.out.println("The forgot password link is being displayed: " + isDisplayStatus);
	
			// gets the link name 
			String linkText = link.getText();
		
			// prints the link text to console 
			System.out.println("The text of the link is: " + linkText);
			
			// gets the url from the link text
			String linkURL = link.getAttribute("href");
			
			// prints the url to the console 
			System.out.println("The url for the forgot password link is: " + linkURL);
			
			// clicks the link 
			link.click();
		}
		
	}