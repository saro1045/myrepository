package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Excel.excel;


public class login extends excel {

	public WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/form/div[1]/input")
	WebElement mailtextbox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/form/div[2]/input")
	WebElement passwordtextbox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/form/div[4]/button")
	WebElement Login_button;

	public login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login_test_positive(String mail_textbox, String password_textbox) throws Exception {

		try {
			Boolean dis = mailtextbox.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("mailtextbox is displayed");
			test.log(Status.PASS,"mailtextbox is displayed");
			try {
				Boolean ena = mailtextbox.isEnabled();
				Assert.assertTrue(ena);
				String N = mailtextbox.getAttribute("value");
				if (N.isEmpty()) {
					mailtextbox.clear();

					mailtextbox.sendKeys(mail_textbox);
					System.out.println("mailtextbox is enabled");
					
					test.log(Status.PASS,"mailtextbox is enabled");


				} else {
					Thread.sleep(2000);

					mailtextbox.sendKeys(mail_textbox);

				}
			} catch (Exception e) {
				System.out.println("mailtextbox is not enabled");
				test.log(Status.ERROR,"mailtextbox is enabled");


			}
		} catch (Exception e) {
			System.out.println("mailtextbox is not displayed");
			test.log(Status.ERROR,"mailtextbox is not displayed");


		}

		// password textbox

		try {
			Boolean dis = passwordtextbox.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("passwordtextbox is displayed");
			//test.log(Status.PASS,"passwordtextbox is displayed");

			try {
				Boolean ena = passwordtextbox.isEnabled();
				Assert.assertTrue(ena);
				System.out.println("passwordtextbox is enabled");
				//test.log(Status.PASS,"passwordtextbox is enabled");

				String N = passwordtextbox.getAttribute("value");
				if (N.isEmpty()) {

					passwordtextbox.sendKeys(password_textbox);

				} else {

					passwordtextbox.sendKeys(password_textbox);

				}
			} catch (Exception e) {
				System.out.println("passwordtextbox is not enabled");
				//test.log(Status.FAIL,"passwordtextbox is not enabled");

			}
		} catch (Exception e) {
			System.out.println("passwordtextbox is not displayed");
			//test.log(Status.FAIL,"passwordtextbox is not displayed");

		}

		//login button		

		try {
			Boolean dis = Login_button.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("Login_button is displayed");
			//test.log(Status.PASS,"Login_button is displayed");

			try {
				Boolean ena = Login_button.isDisplayed();
				Assert.assertTrue(ena);
				System.out.println("Login_button is enabled");
				//	test.log(Status.PASS,"Login_button is enabled");

				Login_button.click();
			} catch (Exception e) {
				System.out.println("Login_button is not enabled");
				//test.log(Status.FAIL,"Login_button is not enabled");

				Thread.sleep(5000);

			}
		} catch (Exception e) {
			System.out.println("Login_button is not displayed");
			//test.log(Status.FAIL,"Login_button is not displayed");

		}
	}

	public void loginexcel() throws Exception {
		

		excels("Sheet2");
		System.out.println("Sheet 2");
		String Mail_textbox = sheet.getRow(0).getCell(0).getStringCellValue();
		String password_textbox = sheet.getRow(1).getCell(0).getStringCellValue();
		login_test_positive(Mail_textbox, password_textbox);

	}


}
