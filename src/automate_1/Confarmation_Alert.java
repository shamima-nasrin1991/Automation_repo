package automate_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Confarmation_Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		System.out.println("Web page open successfully");
		// This step will result in an alert on screen
		//custom xpath
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Alert obj=driver.switchTo().alert();
		String alert_Text=obj.getText();
		System.out.println("The alert is :"+alert_Text);
		//to accept this alert
		obj.accept();
		//if have cancel button also
		//to cancel the alert
		//obj.dismiss();
	}

}
