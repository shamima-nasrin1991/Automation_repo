package automate_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_handle//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://weather.com/weather/5day/l/USNY0996:1:US");
		System.out.println("Weather page open successfully ");
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[11]/div/main/region/div[3]/div/section/div/table"));		
		System.out.println("Tabel displayed successfully");
		/*if want to see text_name whole table
		System.out.println(table.getText());*/
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		//List<WebElement> col=driver.findElements(By.tagName("th"));
		//Loop will execute till the last row of table.
		for(int i=0;i<rows.size();i++) {
			List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
			//Loop will execute till the last cell of that specific row.
			for(int j=0;j<col.size();j++) {
				 //To retrieve text from that specific cell.
				String text=col.get(j).getText();
				System.out.println(text);
				
				if(text.equalsIgnoreCase("TONIGHT\r\n" + 
						"OCT 30\r\n" + 
						"Rain\r\n" + 
						"--61°\r\n" + 
						"90%\r\n" + 
						"S 9 mph\r\n" + 
						"90%")) {
					//System.out.println("click on");
//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[11]/div/main/region/div[3]/div/section/div/table/tbody/tr[3]/td[2]")).click();
driver.findElement(By.xpath("/html/body/div[1]/div/div/div[11]/div/main/region/div[3]/div/section/div/table/tbody/tr[1]/td[2]")).click();		
//driver.findElement(By.cssSelector("tr.clickable:nth-child(1) > td:nth-child(2)")).click();			}
		}
			
		}
			System.out.println("................................");
		}
		// TODO Auto-generated method stub

	}

}
