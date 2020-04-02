package automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Date_picker {

public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://jqueryui.com/datepicker/");
System.out.println("successfully open jqueryui webpage");
driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(0);
System.out.println("Enter the frame successfully");
driver.findElement(By.xpath("//input[@id='datepicker']")).click();
System.out.println("click the date text box successfully");
WebElement datebox=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
/*WebElement pickdate=driver.findElement(By.xpath("//a[contains(text(),'30')]"));
String date=pickdate.getText();
System.out.println(date);*/
System.out.println("Find the calender");

List<WebElement> rows=datebox.findElements(By.tagName("tr"));
/*int size =rows.size();
System.out.println(size);
List<WebElement> col=driver.findElements(By.tagName("th"));//th and td both are represent column
int c_size=col.size();
System.out.println(c_size);*/
for(int i=0;i<rows.size();i++) {
	List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<col.size();j++) {
		String date=col.get(j).getText();
		System.out.println(date);
		if(date.equalsIgnoreCase("30")) {
			driver.findElement(By.xpath("/html/body/div/table/tbody/tr[5]/td[4]/a")).click();
			//driver.findElement(By.cssSelector(".ui-datepicker-calendar > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(4) > a:nth-child(1)")).click();
		}
	}
	
}
		// TODO Auto-generated method stub

	}

}
