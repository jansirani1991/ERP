package com.stockAccounting.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class hmpge {
	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a") WebElement sup;
	@FindBy(xpath=".//*[@id='mi_a_stock_items']/a") WebElement stitms;
	@FindBy(linkText="Stock Categories") WebElement scategry;
	@FindBy(xpath=".//*[@id='mi_a_unit_of_measurement']/a") WebElement stuom;
	@FindBy(xpath=".//*[@id='mi_a_purchases']/a") WebElement pur;
	public void supp()
	{
		sup.click();
	}
	public void stitem()
	{
		stitms.click();
	}
	public void stcategory(WebDriver d)
	{
		Actions act=new Actions(d);
		act.moveToElement(stitms).build().perform();
		scategry.click();	
	}
	public void suom(WebDriver d)
	{
		Actions act=new Actions(d);
		act.moveToElement(stitms).build().perform();
		stuom.click();
	}
	public void purc()
	{
		pur.click();
	}
	

}
