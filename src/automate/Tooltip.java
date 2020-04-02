package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/tooltip/");
		System.out.println("Tooltip web page successfully displed");
	WebElement frame=	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
	driver.switchTo().frame(0);
		WebElement agebox=driver.findElement(By.xpath("//input[@id='age']"));
		String boxText=agebox.getAttribute("title");
		System.out.println("The age box text is:"+boxText);
		if(boxText.equalsIgnoreCase("We ask for your age only for statistical purposes.")) {
			System.out.println("Tooltip macth with expected value");
		}
		// TODO Auto-generated method stub

	}

}
