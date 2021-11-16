package Appsumo_signup_and_signin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Excel.excel2;
import junit.framework.Assert;

public class app_sumo extends excel2{

	public WebDriver driver;

	@FindBy(how=How.XPATH,using="/html//input[@id='appsumo_new_name']")
	WebElement Name_textbox_notreq;

	@FindBy(how=How.XPATH,using="/html//input[@id='appsumo_new_email']")
	WebElement Email_textbox;

	@FindBy(how=How.XPATH,using="/html//input[@id='appsumo_new_password']")
	WebElement password_textbox;

	@FindBy(how=How.XPATH,using="/html//input[@id='appsumo_new_code']")
	WebElement Appsumocode_textbox;

	@FindBy(how=How.XPATH,using="/html//input[@id='appsumo_new_signup']")
	WebElement Signup_button;

// Tester commit 11111111111

	public app_sumo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void Appsumo(String Name_textbox_String,String Email_textbox_string, String password_textbox_string,String Appsumocode_textbox_string)

	{
		try
		{
			Boolean dis = Name_textbox_notreq.isDisplayed();
			Assert.assertTrue(dis);
			System.out.print("The Name_textbox_notreq is displayed");


			try
			{
				Boolean ena = Name_textbox_notreq.isEnabled();
				Assert.assertTrue(ena);
				System.out.print("The Name_textbox_notreq is Enabled");

				String N=Name_textbox_notreq.getAttribute("value");
				if(N.isEmpty())
				{
					Name_textbox_notreq.sendKeys(Name_textbox_String);
				}
				else
				{
					Name_textbox_notreq.clear();
					Name_textbox_notreq.sendKeys(Name_textbox_String);

				}
			}
			catch(Exception e)
			{
				System.out.print("The Name_textbox_notreq is Not Enabled");

			}
		}

		catch(Exception e)
		{
			System.out.print("The Name_textbox_notreq is not displayed");

		}



		try
		{
			Boolean dis = Email_textbox.isDisplayed();
			Assert.assertTrue(dis);
			System.out.print("The Email_textbox is displayed");


			try
			{
				Boolean ena = Email_textbox.isEnabled();
				Assert.assertTrue(ena);
				System.out.print("The Email_textbox is Enabled");

				String N=Email_textbox.getAttribute("value");
				if(N.isEmpty())
				{
					Email_textbox.sendKeys(Email_textbox_string);
				}
				else
				{
					Email_textbox.clear();
					Email_textbox.sendKeys(Email_textbox_string);

				}
			}
			catch(Exception e)
			{
				System.out.print("The Email_textbox is Not Enabled");

			}
		}

		catch(Exception e)
		{
			System.out.print("The Email_textbox is not displayed");

		}


		//password_textbox

		try
		{
			Boolean dis = password_textbox.isDisplayed();
			Assert.assertTrue(dis);
			System.out.print("The password_textbox is displayed");


			try
			{
				Boolean ena = password_textbox.isEnabled();
				Assert.assertTrue(ena);
				System.out.print("The password_textbox is Enabled");

				String N=password_textbox.getAttribute("value");
				if(N.isEmpty())
				{
					password_textbox.sendKeys(password_textbox_string);
				}
				else
				{
					password_textbox.clear();
					password_textbox.sendKeys(password_textbox_string);

				}
			}
			catch(Exception e)
			{
				System.out.print("The password_textbox is Not Enabled");

			}
		}

		catch(Exception e)
		{
			System.out.print("The password_textbox is not displayed");

		}

		// Appsumocode_textbox

		try
		{
			Boolean dis = Appsumocode_textbox.isDisplayed();
			Assert.assertTrue(dis);
			System.out.print("The Appsumocode_textbox is displayed");


			try
			{
				Boolean ena = Appsumocode_textbox.isEnabled();
				Assert.assertTrue(ena);
				System.out.print("The Appsumocode_textbox is Enabled");

				String N=Appsumocode_textbox.getAttribute("value");
				if(N.isEmpty())
				{
					Appsumocode_textbox.sendKeys(Appsumocode_textbox_string);
				}
				else
				{
					Appsumocode_textbox.clear();
					Appsumocode_textbox.sendKeys(Appsumocode_textbox_string);

				}
			}
			catch(Exception e)
			{
				System.out.print("The Appsumocode_textbox is Not Enabled");

			}
		}

		catch(Exception e)
		{
			System.out.print("The Appsumocode_textbox is not displayed");

		}


		//Signup_button

		try
		{
			Boolean dis = Signup_button.isDisplayed();
			Assert.assertTrue(dis);
			System.out.print("The Signup_button is displayed");


			try
			{
				Boolean ena= Signup_button.isEnabled();
				Assert.assertTrue(ena);
				System.out.print("The Signup_button is Enabled");
				
//				if(Signup_button.isEnabled())
//				{
//				Signup_button.click();
//				System.out.println("The page title"+driver.getTitle().compareTo("Redtie - Create Workspace" ));
//				
//				
//				
//				}
//				
//				else
//				{
//					Thread.sleep(2000);
//					Appsumo_Method(); 
//				}
			}
			catch(Exception e)
			{
				System.out.print("The Signup_button is Not Enabled");

			}
		}

		catch(Exception e)
		{
			System.out.print("The Signup_button is not displayed");

		}


	}
	public void Appsumo_Method() throws Exception
	
	// Signup using using new user.
	// signup using existing user.

	{
		for(int i=3;i<=3 ;i++)
		{
			
				excels2("Sheet4");

				String Name_textbox_String=sheet.getRow(1).getCell(0).getStringCellValue();
				String Email_textbox_string=sheet.getRow(1).getCell(1).getStringCellValue();
				String password_textbox_string=sheet.getRow(1).getCell(2).getStringCellValue();
				String Appsumocode_textbox_string=sheet.getRow(1).getCell(i).getStringCellValue();
				Appsumo(Name_textbox_String,Email_textbox_string,password_textbox_string,Appsumocode_textbox_string) ;

		}
	
	}
	
	
}



