package seleniumpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

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
      
       
	}

}
