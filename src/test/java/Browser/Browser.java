package Browser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public WebDriver driver;

	@BeforeSuite
	public void report()

	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String Url ="https://app.redtie.co/SignIn";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.getTitle();

	}

	@BeforeMethod
	public void open_Browser()  {

		DateFormat date = new SimpleDateFormat("HH:MM a");
		Date SystemDate = new Date();
		String dateformat = date.format(SystemDate);

		System.out.println(dateformat);

		// Plus some hours, minutes, and seconds to the original DateTime.

	}

	@AfterMethod
	public void Close_Browser() {

	}

	@AfterSuite
	public void Flush_Report() {

	}

}
