import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdn {
	public static void main(String[] args) throws InterruptedException  {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\ARI\\Desktop\\chromee\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://output.jsbin.com/osebed/2");
	       WebElement dd=driver.findElement(By.id("fruits"));
	       Select s =new Select(dd);
	       s.selectByIndex(3);
	       s.selectByValue("apple");
	       s.selectByVisibleText("Banana");
	       boolean b=s.isMultiple();
	       System.out.println(b);
	       List<WebElement> all = s.getAllSelectedOptions();
	       
	       for(int i=0;i<all.size();i++) {
	    	   WebElement x = all.get(i);
	    	   String text=x.getText();
	    	   System.out.println(text);
	       }
	
	       System.out.println("first selected option");
	       WebElement first= s.getFirstSelectedOption();
	       String text1 = first.getText();
	       System.out.println(text1);
	       
	
	
	}
	
	
}
