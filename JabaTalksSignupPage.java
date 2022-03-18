package Automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JabaTalksSignupPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		WebElement chooseLang = driver.findElement(By.xpath("//span[text()='English']"));
		chooseLang.click();
		WebElement langEngish = driver.findElement(By.xpath("//div[text()='English']"));
		langEngish.click();
		WebElement fullNameTextBox = driver.findElement(By.xpath("//input[@id='name']"));
		fullNameTextBox.sendKeys("Jon");
		WebElement orgNameTextBox = driver.findElement(By.xpath("//input[@id='orgName']"));
		orgNameTextBox.sendKeys("Jon");
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='singUpEmail']"));
		emailTextBox.sendKeys("jonj@gmail.com");
		WebElement termCondCheckBox = driver.findElement(By.xpath("//span[@class='black-color ng-binding']"));
		termCondCheckBox.click();
		WebElement getStartBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		getStartBtn.click();
		Thread.sleep(10000);
		WebElement messageCheck = driver.findElement(By.xpath("//section[@class='panel panel-default sign-up-box']//div[1]//span[@class='ng-binding']"));
		System.out.println("Message Text = "+messageCheck.getText());	
		if (messageCheck.isDisplayed())
		{
			System.out.println("Mail is received succesfully");
			
		}
		else 
		{
			
			System.out.println("Mail is not received");
		   	
		} 
		Thread.sleep(1000);
		driver.close();
		
	}

}
