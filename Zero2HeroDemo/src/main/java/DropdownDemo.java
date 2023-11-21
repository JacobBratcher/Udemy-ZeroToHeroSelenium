import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// opens chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		// open web app 
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		// identify check box 
		WebElement dropdownBox = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));

		// select value from list 
		Select selectCountry = new Select(dropdownBox);
		
		// select by index, Albania in this scenario 
		selectCountry.selectByIndex(2);
		
		// select by value
		selectCountry.selectByValue("USA");
		
		// select by visible text 
		selectCountry.selectByVisibleText("United States");
		
		// gets current selected option in dropdown
		WebElement selectedOption = selectCountry.getFirstSelectedOption();
		
		// sets the text of the dropdown option to a string variable 
		String selectedDropdownValue = selectedOption.getText();
		
		// prints string to console 
		System.out.println(selectedDropdownValue);
	}
}