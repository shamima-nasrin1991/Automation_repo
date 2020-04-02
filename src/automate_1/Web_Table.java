package automate_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Table {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://weather.com/weather/5day/l/USNY0996:1:US");
	System.out.println("Weather page open successfully ");
	WebElement table=driver.findElement(By.xpath("//table[@class='twc-table']"));
	System.out.println("Enter the table successfully");
	List<WebElement> rows=table.findElements(By.tagName("tr"));
	int total_r=rows.size();
	System.out.println("Total rows size is:"+total_r);
    for(int i=0;i<total_r;i++) {
		String r_text=rows.get(i).getText();
		System.out.println("The text of:"+i+" "+ " number rows is:"+r_text);
	}
	List<WebElement> col=table.findElements(By.tagName("th"));
	int total_c=col.size();
	System.out.println("Total coloumn size is:"+total_c);
	for(int j=0;j<total_c;j++) {
		String c_text=col.get(j).getText();
		System.out.println("The text of:"+j+" "+"number coloumn is:"+c_text);
	}
		// TODO Auto-generated method stub

	}

}
