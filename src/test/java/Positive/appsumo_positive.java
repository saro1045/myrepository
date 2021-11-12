package Positive;

import org.testng.annotations.Test;

import Appsumo_signup_and_signin.app_sumo;
import Browser.Browser2;

public class appsumo_positive extends Browser2 {

	@Test(priority=0)
	public void Test() throws Exception
	{
		app_sumo as=new app_sumo(driver);
		as.Appsumo_Method();
	}

}
