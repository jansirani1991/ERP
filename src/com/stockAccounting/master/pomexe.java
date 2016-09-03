
package com.stockAccounting.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pomexe
{

	@Test
	public void xyz()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		
		loginpage lp=PageFactory.initElements(driver, loginpage.class);
		lp.Adminlgn("admin", "master");
		hmpge hp=PageFactory.initElements(driver, hmpge.class);
		hp.supp();
		hp.purc();
		hp.suom(driver);
		hp.stcategory(driver);
		hp.stitem();
		
		
	}
}
