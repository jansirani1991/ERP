package com.stockAccounting.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exeng extends NewTest
{
	@Test(dataProvider="uom")
	public void uom(String uid,String udes)
	{
		SL.stUom(uid,udes);
	}
	
	@DataProvider
	public Object[][] uom()
	{
	Object[][] obj=new Object[3][2];
	
	obj[0][0]="478858";
	obj[0][1]="udeskljfd";
	
	obj[1][0]="578968";
	obj[1][1]="lkfjdl";
	
	obj[2][0]="4321145";
	obj[2][1]="kjnvjbj";
	 
	return obj;
	
	}

}
