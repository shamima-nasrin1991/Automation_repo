package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		System.out.println("webpage is successfully displed");
		//create Actions class
		Actions acobj=new Actions(driver);
		WebElement electronics=driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[5]/a"));
		//perform the mouse hover
		acobj.moveToElement(electronics).build().perform();
		//perform the mouse hover
/*WebElement motor=driver.findElement(By.xpath("//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[3]/a[1]"));
acobj.moveToElement(motor).build().perform();*/
		// TODO Auto-generated method stub

	}

}
