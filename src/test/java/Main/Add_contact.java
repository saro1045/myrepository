package Main;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Browser.Browser;
import Excel.excel;

public class Add_contact extends excel {
	
	@FindBy(how = How.XPATH, using = "/html//div[@id='body']/div[@class='wrapper']/div[@class='content-wrapper']/div[@class='content']/div[@class='container-fluid']/div[2]/div[2]//div[@class='allcontacts_conversediv']/div[1]/span/div[1]/div/div[5]/span/i")
	WebElement AddContact_button;

	@FindBy(how = How.XPATH, using = "/html//aside[@id='cnt-icnclk']/div[@class='all_innersmallcontent_div']/form//div[@class='card-body px-0']/div[1]/div[2]/input")
	WebElement Firstname_textbox;

	@FindBy(how = How.XPATH, using = "/html//aside[@id='cnt-icnclk']/div[@class='all_innersmallcontent_div']/form//div[@class='card-body px-0']/div[2]/div[2]/input")
	WebElement Lastname_textbox;

	@FindBy(how = How.XPATH, using = "/html//aside[@id='cnt-icnclk']/div[@class='all_innersmallcontent_div']/form/div[@class='form-horizontal formbiglbl']//div[@class='input-group']/div/input")
	WebElement phonenum_textbox;

	@FindBy(how = How.XPATH, using = "/html//aside[@id='cnt-icnclk']//form//button[.='Add']")
	WebElement Add_Button;

	public Add_contact(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Addcontact(String Firstnametextbox, String Lastnametextbox, String phonenumtextbox) throws Exception {

		Thread.sleep(2000);

		try {
			Boolean dis = AddContact_button.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("The AddContact_button is displayed ");

			try {
				Boolean ena = AddContact_button.isEnabled();
				Assert.assertTrue(ena);
				System.out.println("The AddContact_button is Enabled");
				Thread.sleep(2000);
				Actions act1 = new Actions(driver);
				act1.moveToElement(AddContact_button);
				Thread.sleep(2000);
				AddContact_button.click();
			} catch (Exception e) {
				System.out.println("The AddContact_button is Not Enabled ");

			}
		} catch (Exception e) {
			System.out.println("The AddContact_button is Not displayed ");

		}

		try {

			Boolean dis = Firstname_textbox.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("The Firstname_textbox is displayed ");

			try {

				Boolean ena = Firstname_textbox.isDisplayed();
				Assert.assertTrue(ena);
				System.out.println("The Firstname_textbox is enabled ");
				String N = Firstname_textbox.getAttribute("value");
				if (Firstnametextbox.isEmpty()) {
					if (N.isEmpty()) {

						Random randomgenerator = new Random();
						int ran = randomgenerator.nextInt(1000);
						Firstname_textbox.sendKeys("saravana" + ran);

					}

					else {
						Firstname_textbox.clear();
						Random randomgenerator = new Random();
						int ran = randomgenerator.nextInt(1000);
						Firstname_textbox.sendKeys("saravana" + ran);
					}
				} else {

					if (N.isEmpty()) {
						Firstname_textbox.sendKeys(Firstnametextbox);
					} else {
						Firstname_textbox.clear();
						Firstname_textbox.sendKeys(Firstnametextbox);

					}

				}

			} catch (Exception e) {
				System.out.println("The Firstname_textbox is Not enabled");

			}
		} catch (Exception e) {
			System.out.println("The Firstname_textbox is Not displayed");
		}

		try {

			Boolean Dis = Lastname_textbox.isDisplayed();
			Assert.assertTrue(Dis);
			System.out.println("The Lastname_textbox is displayed ");

			try {

				Boolean ena = Lastname_textbox.isDisplayed();
				Assert.assertTrue(ena);
				System.out.println("The Lastname_textbox is enabled ");
				String N = Lastname_textbox.getAttribute("value");
				if (Lastnametextbox.isEmpty()) {
					if (N.isEmpty()) {

						Random randomgenerator = new Random();
						int ran = randomgenerator.nextInt(1000);
						Lastname_textbox.sendKeys("balaji" + ran);
					} else {
						Lastname_textbox.clear();
						Random randomgenerator = new Random();
						int ran = randomgenerator.nextInt(1000);
						Lastname_textbox.sendKeys("balaji" + ran);
					}

				} else {

					if (N.isEmpty()) {

						Lastname_textbox.sendKeys(Lastnametextbox);

					} else {
						Lastname_textbox.clear();
						Lastname_textbox.sendKeys(Lastnametextbox);

					}

				}

			} catch (Exception e) {
				System.out.println("The Lastname_textbox is Not enabled");

			}

		}

		catch (Exception e) {
			System.out.println("The Lastname_textbox is Not displayed");

		}

		try {

			Boolean Dis = phonenum_textbox.isDisplayed();
			Assert.assertTrue(Dis);
			System.out.println("The phonenum_textbox is displayed ");

			try {

				Boolean ena = phonenum_textbox.isDisplayed();
				Assert.assertTrue(ena);
				System.out.println("The phonenum_textbox is enabled ");
				String N = phonenum_textbox.getAttribute("value");

				if (phonenumtextbox.isEmpty()) {

					if (N.isEmpty()) {

						Random randomgenerator = new Random();
						int ran = randomgenerator.nextInt(100);
						phonenum_textbox.sendKeys("415" + ran + "2661");

					} else {
						phonenum_textbox.clear();
						Random randomgenerator = new Random();
						int ran = randomgenerator.nextInt(1000);
						phonenum_textbox.sendKeys("415" + ran + "2661");

					}
				} else {
					if (N.isEmpty()) {

						phonenum_textbox.sendKeys(phonenumtextbox);
						System.out.println(phonenumtextbox);

					} else {
						phonenum_textbox.clear();
						phonenum_textbox.sendKeys(phonenumtextbox);
						System.out.println(phonenumtextbox);

					}
				}

			} catch (Exception e) {
				System.out.println("The phonenum_textbox is Not enabled");

			}

		}

		catch (Exception e) {
			System.out.println("The phonenum_textbox is Not displayed");

		}

		try {
			Boolean dis = Add_Button.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("The Add_Button is displayed ");

			try {
				Boolean ena = Add_Button.isEnabled();
				Assert.assertTrue(ena);
				System.out.println("The Add_Button is Enabled");
				Add_Button.click();
			} catch (Exception e) {
				System.out.println("The Add_Button is Not Enabled ");

			}
		} catch (Exception e) {
			System.out.println("The Add_Button is Not displayed ");

		}
	}

	public void addcontactmethod() throws Exception {
		excels("Sheet1");

		for (int i = 1; i <= 6; i--)
			for (int j = 0; j <= 5; j--)
				if (j <= 5) {
					if (j <= 3) {
						String Firstnametextbox = sheet.getRow(i).getCell(j).getStringCellValue();
						String Lastnametextbox = sheet.getRow(i).getCell(j + 1).getStringCellValue();
						String phonenumtextbox = sheet.getRow(i).getCell(j + 2).getStringCellValue();
						i++;
						j++;
						Thread.sleep(5000);

						Addcontact(Firstnametextbox, Lastnametextbox, phonenumtextbox);

					}
				}
	}
}
