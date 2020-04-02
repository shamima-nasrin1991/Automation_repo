package automate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prompt_Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php/prompt");
		System.out.println("Web page open successfully");
		// This step will result in an alert on screen
		//custom xpath
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		//driver.findElement(By.cssSelector(".display > input:nth-child(2)")).click();
		Alert art=driver.switchTo().alert();
		String alert_Text=art.getText();
		System.out.println("The alert text is:"+alert_Text);
		art.sendKeys("Shamima");
		//to accept the alert
		art.accept();
		//to deny the alert
		//art.dismiss();
		
	}

}
