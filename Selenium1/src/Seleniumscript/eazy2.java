package Seleniumscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class eazy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.edge.driver", "C:\\Users\\M1072983\\msedgedriver.exe");

WebDriver driver=new EdgeDriver();

driver.get("https://www.eazydiner.com/");

String title= driver.getTitle();
System.out.println("the page title is: "+title);
	}

}
