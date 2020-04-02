package automate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simple_Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		System.out.println("Web page open successfully");
		// This step will result in an alert on screen
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/p[1]/a")).click();
	Alert ale =driver.switchTo().alert();
	String alertText=ale.getText();
	System.out.println("The alert text is:"+alertText);
	//to accept this alert
	ale.accept();
	//driver.close();
	
	
	
	}

}
