package seleniumpack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShortlistProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mindtreedec23\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='nb__19hcF'][1]")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("signUp-phoneNumber")).click();
		driver.findElement(By.id("signUp-phoneNumber")).sendKeys("8380953539");
		
		driver.findElement(By.xpath("//input[@id='login-signup-form-login-radio-password']")).click();
		driver.findElement(By.xpath("//input[@id='login-signup-form__password-input']")).sendKeys("Hello171@");
		driver.findElement(By.id("signUpSubmit")).click();
      
driver.findElement(By.xpath("//div[@class='nb__17yFj nb__1Z-uW']")).click();
		
		driver.findElement(By.id("searchCity")).click();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']")).click();
		
		Actions actions=new Actions(driver);
		for(int i=0;i<3;i++)
		{
			actions.sendKeys(Keys.DOWN).perform();
		}
		actions.sendKeys(Keys.ENTER).perform();
		
		//driver.findElement(By.xpath("//div[@class='nb-google-autocomplete nb-google-autocomplete-lg']")).click();
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).click();
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("Dighi Hills");
		
		driver.findElement(By.cssSelector("div[class='autocomplete-dropdown-container']")).click();
		

		//Actions action1=new Actions(driver);
		for(int i=0;i<2;i++)
		{
			actions.sendKeys(Keys.DOWN).perform();
		}
		//actions.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.id("PG")).click();
		
		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi']")).click();
    
		for(int i=0;i<1;i++)
		{
			actions.sendKeys(Keys.DOWN).perform();
		}
		actions.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		
		driver.switchTo().window(childid);
		
		driver.findElement(By.xpath("//button[@id='shortlistProperty'][1]")).click();


	}

}
