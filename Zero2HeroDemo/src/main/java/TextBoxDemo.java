import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// opens chrome browser 
		ChromeDriver driver = new ChromeDriver();
		
		// sets url
		driver.get("http://the-internet.herokuapp.com/forgot_password");
	
		// identify the text box
		WebElement emailTextBox = driver.findElement(By.name("email"));
		
		// text box is displayed or not 
		boolean boxIsDisplayed = emailTextBox.isDisplayed();
		System.out.println("Text box is displayed: " +boxIsDisplayed);
		
		// text box is enabled or not 
		boolean boxIsEnabled = emailTextBox.isEnabled();
		System.out.println("Text box is enabled: " + boxIsEnabled);
		
		// enter the email into the text box 
		emailTextBox.sendKeys("test@gmail.com");
		
		// display the value into the text box 
		String enteredValue = emailTextBox.getAttribute("value");
		System.out.println("Text box says: " + enteredValue);
		
		// sleep to verify it was entered in the text box 
		Thread.sleep(500);
		
		// clears the value in the text box 
		emailTextBox.clear();
		
		
		
	}

}