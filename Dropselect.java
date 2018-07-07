package cross;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver w=new FirefoxDriver();
		
		w.get("http://www.passpowelcomeLink");
			
		Select s=new Select(w.findElement(By.xpath(".//*[@id='dcdrLocation']")));
		
		List<WebElement> dropsize=s.getOptions();
		
		   int count1=dropsize.size();
		   
		   System.out.println("NO of Options in drop down:"+count1);
		   
		   
		   for(int i=0;i<count1;i++)
		   {
			   
			   System.out.println(dropsize.get(i).getText());
		   }
		for(int j=0;j<count1;j++)
		{
			
			s.selectByIndex(j);
		}
		
	}

}
