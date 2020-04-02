package automate_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://myaccount.google.com/?utm_source=OGB&tab=wk&utm_medium=act&pli=1");
        driver.findElement(By.xpath("//li[8]//a[1]//div[1]//figure[1]//span[1]")).click();
        Set<String> handle=driver.getWindowHandles();
        Iterator<String> it=handle.iterator();
        String main=it.next();
        String child=it.next();
        System.out.println(main+"  "+child);
        //if i want to switch child window
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        //driver.close();
        //if i want to switch main/parent  window
        driver.switchTo().window(main);
      System.out.println(driver.getTitle());
      //driver.quit();

		// TODO Auto-generated method stub

	}

}
