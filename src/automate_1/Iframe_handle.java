package automate_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println("Webpage open successfully");
		//WebElement iframe_element=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//find total number of iFrames in a web page
		List<WebElement>iframe_element=driver.findElements(By.tagName("iframe"));
		int count=iframe_element.size();
		System.out.println("The total iframe is:"+count);
		//use switch command to switching main to iframe
		driver.switchTo().frame(0);
        //Switch back to the main window
		driver.switchTo().defaultContent();
		//driver.quit();
		// TODO Auto-generated method stub

	}

}
