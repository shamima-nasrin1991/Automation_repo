package automate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		System.out.println("web page successfully displayed");
		//create Actions class
		Actions obj=new Actions(driver);
		WebElement d_element=driver.findElement(By.xpath("/html/body/button"));
		//perform the double click to launch an alertbox
		obj.doubleClick(d_element).perform();
		//Switch to the alert box and click on OK button or accept the alert
		Alert ale=driver.switchTo().alert();
		System.out.println("The alert text is:"+ale.getText());
		ale.accept();
		//driver.close();
		
		// TODO Auto-generated method stub

	}

}
