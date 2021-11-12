package Appsumo_signup_and_signin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Choose_appsumo_plan{

//	@FindBy(how=How.XPATH,using="//*[@id=\"chooseplandtls_div\"]/div/div[3]/div/div[3]/div/div[2]/a")
//	WebElement Choose_Appsumo_plan_Button;

	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div[3]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/label")
	WebElement Choose_number_Typeasac;

	@FindBy(how=How.XPATH,using="//*[@id=\"picknumbertype1\"]/div/div/div/div/input")
	WebElement Search_By_Areacode;

	@FindBy(how=How.XPATH,using="//*[@id=\"plivonumbers\"]/div/div/div[1]")
	WebElement Choosenum_by_areacode;

	@FindBy(how=How.XPATH,using="//*[@id=\"plivonumbers\"]/div/div/div[13]/span")
	WebElement Loadmore_AC;
	
	@FindBy(how=How.XPATH,using="	//*[@id=\"root\"]/div/div/div[3]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[2]/label")
	WebElement Choose_number_Typeasloc;
	
	//florida
	//Select state=new Select (driver.findElement(By.xpath("//*[@id=\"picknumbertype2\"]/div/div/div/div/div/select"))
	
//	@FindBy(how=How.XPATH,using="//*[@id=\"plivoregionnumbers\"]/div/div/div[1]/div")
//	WebElement Choosenum_by_location;
//
//	@FindBy(how=How.XPATH,using="	//*[@id=\"root\"]/div/div/div[3]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/button")
//	WebElement continue_button;


}
