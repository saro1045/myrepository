package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Excel.excel;

public class Select_contact extends excel {

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div[5]/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/span/div[2]/div[4]/table/tbody/tr[1]/td/div/div[1]/span[1]/span[1]")
	WebElement Select_contact;

	@FindBy(how=How.XPATH,using="//*[@id=\"body\"]/div/div[5]/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/span/div[2]")
	WebElement Select_contact_by_name;

	public Select_contact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	public void select_contact() throws Exception
	{
		Thread.sleep(5000);
		try
		{
			Boolean dis=Select_contact.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("Select_contact is displayed");

			try
			{
				Boolean ena=Select_contact.isEnabled();
				Assert.assertTrue(ena);
				System.out.println("Select_contact is enabled");
				Actions act=new Actions(driver);
				act.moveToElement(Select_contact).build().perform();
				Select_contact.click();
			}
			catch(Exception e)
			{
				System.out.println("Select_contact is not enabled");

			}

		}
		catch(Exception e)
		{
			System.out.println("Select_contact is not displayed");

		}
		
		
	}

}
