package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		System.out.println("web page successfully displayed");
		//create Actions class
		Actions obj=new Actions(driver);
		WebElement r_element=driver.findElement(By.xpath("/html/body/span"));
		//perform the right click button
		obj.contextClick(r_element).perform();
		// TODO Auto-generated method stub

	}

}
