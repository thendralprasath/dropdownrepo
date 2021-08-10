import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	public static void main(String[] args) throws InterruptedException  {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\ARI\\Desktop\\chromee\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("http://adactin.com/HotelApp/");
	       WebElement user=driver.findElement(By.id("username"));
	       user.sendKeys("thendralprasath");
	       WebElement pass=driver.findElement(By.id("password"));
	       pass.sendKeys("thendu12");
	       WebElement login=driver.findElement(By.id("login"));
	       login.click();
	       Thread.sleep(3000);
	       
	       WebElement dd=driver.findElement(By.id("location"));
	       Select s =new Select(dd);
	       s.selectByIndex(3);
	       
	       WebElement dd1=driver.findElement(By.id("hotels"));
	       Select s1 =new Select(dd1);
	       s1.selectByValue("Hotel Creek");
	      
	       WebElement dd2=driver.findElement(By.id("room_type"));
	       Select s2 =new Select(dd2);
	       s2.selectByVisibleText("Super Deluxe");
	       
	       WebElement dd3=driver.findElement(By.id("room_nos"));
	       Select s3 =new Select(dd3);
	       s3.selectByValue("9");
	       
	       
	       WebElement dd4=driver.findElement(By.id("datepick_in"));
	       dd4.sendKeys("20/06/2021");
	       
	       WebElement dd5=driver.findElement(By.id("datepick_out"));
	       dd5.sendKeys("25/06/2021");
	       
	       WebElement dd6=driver.findElement(By.id("adult_room"));
	       Select s6 =new Select(dd6);
	       s6.selectByValue("1");
	       
	       WebElement dd7=driver.findElement(By.id("child_room"));
	       Select s7 =new Select(dd7);
	       s7.selectByValue("2");
	       
	       WebElement submit=driver.findElement(By.id("Submit"));
	       submit.click(); 
	       
	       
	       
	       
	       
	       
	       
	       
	}
}
