package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Excel.excel;
import junit.framework.Assert;

public class contact_search extends excel {



	@FindBy(how=How.XPATH,using="/html//form[@id='contact search']//input")
	WebElement Search_contact_name;


	@FindBy(how=How.XPATH,using="/html//form[@id='contact search']//input")
	WebElement Search_conact_Number;


	public contact_search(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void search_contact(String contact_name,String contact_Number) throws Exception
	{
		Thread.sleep(5000);

		try
		{
			Boolean dis=Search_contact_name.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("Search_contact_name is displayed");

			try
			{
				Boolean ena=Search_contact_name.isEnabled();
				Assert.assertTrue(ena);
				System.out.println("Search_con is enabled");
				String N=Search_contact_name.getAttribute("value");




				if(N.isEmpty())
				{
					Actions act=new Actions(driver);
					act.moveToElement(Search_contact_name).build().perform();
					Search_contact_name.sendKeys(contact_Number);
					Search_contact_name.submit();

				}
				else
				{
					Search_contact_name.clear();
					Actions act1=new Actions(driver);
					act1.moveToElement(Search_contact_name).build().perform();
					Search_contact_name.sendKeys(contact_Number);
					Search_contact_name.submit();

				}

			}
			catch(Exception e)
			{
				System.out.println("Search_con is not enabled");

			}
		}
		catch(Exception e)
		{
			System.out.println("Search_con is not displayed");

		}
	}

	public void search_contact_Method() throws Exception
	{

		{
			excels("Sheet3");

			String contact_Number = sheet.getRow(1).getCell(0).getStringCellValue();
			String contact_name=sheet.getRow(1).getCell(1).getStringCellValue();
			search_contact(contact_name,contact_Number);
		}
	}
}
