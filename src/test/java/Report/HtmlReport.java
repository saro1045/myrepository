package Report;

import java.lang.reflect.Method;

import Browser.Browser;

public class HtmlReport extends Browser{
	public void createreport(Method testMethod)
	{
		test=report.createTest(testMethod.getName());
		
	}


}
