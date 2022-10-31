package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.utility.BaseClass;
import com.utility.Library;

public class Test_1 extends BaseClass {
	
	@Test
	public void Test() {
		
		LoginPom login = PageFactory.initElements(driver,LoginPom.class);
//		login.getTxt_email().sendKeys(excel.getStringData("Sheet1", 0, 0));
//		login.getTxt_password().sendKeys(excel.getStringData("Sheet1", 0, 1));
		
		
		Library.custom_SendKeys(login.getTxt_email(), excel.getStringData("Sheet1", 0, 0),"Email");
		Library.custom_SendKeys(login.getTxt_password(), excel.getStringData("Sheet1", 0, 1),"Password");
		
		Assert.assertTrue(false);
		
		
		
	
		
	}

}
