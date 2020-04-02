package automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_table3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://weather.com/weather/5day/l/USNY0996:1:US");
		System.out.println("Weather page open successfully ");
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[11]/div/main/region/div[3]/div/section/div/table"));		
		System.out.println("Tabel displayed successfully");
		List<WebElement> rows=table.findElements(By.tagName("tr"));
for(int i=0;i<rows.size();i++) {
	List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<col.size();j++) {
WebElement des_col=driver.findElement(By.xpath("//tr[2]//td[3]"));
	des_col.click();
	}

}
// TODO Auto-generated method stub

	}

}
