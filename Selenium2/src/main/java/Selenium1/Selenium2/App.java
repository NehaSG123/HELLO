package Selenium1.Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

System.setProperty("webdriver.edge.driver", "C:\\Users\\M1072983\\msedgedriver.exe");

WebDriver driver=new EdgeDriver();

driver.get("https://www.eazydiner.com/");

String title= driver.getTitle();
System.out.println("the page title is: "+title);
    }
}
