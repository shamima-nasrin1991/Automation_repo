package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS).
		driver.get("https://jqueryui.com/droppable/");
		System.out.println("Webpage open successfully");
		driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(0);
		//to find source element
        WebElement drag_element=driver.findElement(By.xpath("//div[@id='draggable']"));
		//WebElement drag_element=driver.findElement(By.cssSelector("#draggable"));
        //to find destination/target element
		WebElement drop_element=driver.findElement(By.xpath("//div[@id='droppable']"));
		//WebElement drop_element=driver.findElement(By.cssSelector("#droppable"));
        //Actions class for drag and drop
		Actions obj=new Actions(driver);
		//perform drag and drop
		obj.dragAndDrop(drag_element,drop_element).build().perform();
		String text=drop_element.getText();
		System.out.println(text);
		//verify text changed 'drag to drop' in the drop box
		if(text.equalsIgnoreCase("Dropped!")) {
			System.out.println("source is dropped");
		}
		else {
			System.out.println("source is not dropped");
		}
		// TODO Auto-generated method stub

	}

}
