package Positive;

import org.testng.annotations.Test;

import Appsumo_signup_and_signin.app_sumo;
import Browser.Browser;
import Excel.excel;
import Main.Add_contact;
import Main.Select_contact;
import Main.contact_search;
import Main.login;

public class postive_test extends Browser {
	@Test(priority=0)
	public void Test() throws Exception
	{
		login log=new login(driver);
		log.loginexcel();

	}

	@Test(priority=1)
	public void Test2() throws Exception 
	{
		login log=new login(driver);
		log.loginexcel();

		Add_contact ac=new Add_contact(driver);
		ac.addcontactmethod();
	}

	@Test(priority=2)
	public void Test3() throws Exception
	{
		login log=new login(driver);
		log.loginexcel();

		Select_contact sc=new Select_contact(driver);
		sc.select_contact();	
	}
	
	
	@Test(priority=3)
	public void Test4() throws Exception
	{
		login log=new login(driver);
		log.loginexcel();

		contact_search sc=new contact_search(driver);
		sc.search_contact_Method();	
	}
	
	@Test(priority=4)
	public void Test5() throws Exception
	{
		
		app_sumo as=new app_sumo(driver);
		as.Appsumo_Method();
	}
	
	
	
	
}
