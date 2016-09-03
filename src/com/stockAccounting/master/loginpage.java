package com.stockAccounting.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	@FindBy(id="username") WebElement uname;
	@FindBy(id="password") WebElement pwd;
	@FindBy(id="btnsubmit") WebElement login;
	@FindBy(id="btnreset") WebElement reset;
	
	public void Adminlgn(String Un,String Pswd)
	{
		reset.click();
		uname.sendKeys(Un);
		pwd.sendKeys(Pswd);
		login.click();
	}
	
}
