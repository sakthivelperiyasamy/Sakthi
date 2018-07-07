package cross;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver w=new FirefoxDriver();
w.get("http://www.passportject/welcomeLink");
		
List<WebElement> drop=w.findElements(By.tagName("select"));		
     
               int count=drop.size();
               
         System.out.println("No of Drop down:"+count);
               
              for(int i=0;i<count;i++)
               {
            	  
           System.out.println(drop.get(i).getText());
               
               }
               
               

	}

}
