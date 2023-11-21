import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// opens chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		// open web app 
		driver.get("https://designsystem.digital.gov/components/radio-buttons/");
		
		// finds radio button elements 
		// 1
		WebElement radioButton1 = driver.findElement(By.xpath("//label[@for='historical-truth']"));
		
		// 2
		WebElement radioButton2 = driver.findElement(By.xpath("//label[@for='historical-douglass']"));
		
		// 3
		WebElement radioButton3 = driver.findElement(By.xpath("//label[@for='historical-washington']"));
		
		// gets selected option 
		// creates boolean variables for each radio button
		boolean radioButton1Selected = radioButton1.isEnabled();
		boolean radioButton2Selected = radioButton2.isEnabled();
		boolean radioButton3Selected = radioButton3.isEnabled();
		
		// if statement for radio button 1, writes it is selected to console
		if (radioButton1Selected == true) {
			
			System.out.println("Radio button 1 is selected");
			
		}
		
		// else if statement for radio button 2, writes it is selected to console
		else if (radioButton2Selected == true) {
			
			System.out.println("Radio button 2 is selected");
			
		}
		
		// else if statement for radio button 3, writes it is selected to console
		else if (radioButton3Selected == true) {
			
			System.out.println("Radio button 3 is selected");
			
		}
		
		// selects second option and updates boolean variable 
		radioButton2.click();
		Thread.sleep(5000);
		radioButton2Selected = radioButton2.isEnabled();
		
		// reads value console 
		System.out.println("Radio button 2 is now selected: " + radioButton2Selected); 
		
		// selects third option and updates boolean variable 
		radioButton3.click();
		Thread.sleep(5000);
		radioButton3Selected = radioButton3.isEnabled();
		
		// reads value to console
		System.out.println("Radio button 3 is now selected: " + radioButton3Selected);
		
	}
}