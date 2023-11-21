import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxName {

	public static void main(String[] args) throws InterruptedException {
		
		// opens chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		// open web app 
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		// identify check box 
		WebElement checkBox = driver.findElement(By.xpath("//input[1]"));
		
		// displayed or not 
		 boolean checkBoxIsDisplayed = checkBox.isDisplayed();
		System.out.println("Check box is " + checkBoxIsDisplayed);
		
		// enabled or not 
		boolean checkBoxIsEnabled = checkBox.isEnabled();
		System.out.println("Check box is " + checkBoxIsEnabled);
		
		// select check box 
		checkBox.click();
		
		// check selected status of check box
		// can also use .isSeleceted for status of check box 
		String checkBoxStatus = checkBox.getAttribute("value");
		System.out.println("Status of checkbox " + checkBoxStatus);
		
		// sleep timer to verify status 
		Thread.sleep(500);
		
		// unselect check box 
		checkBox.click();
		
	}

}
