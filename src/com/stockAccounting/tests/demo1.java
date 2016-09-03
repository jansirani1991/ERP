package com.stockAccounting.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo1 {
	

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://webapp.qedgetech.com");
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		
	
		 //supplier creation
		driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("x_Supplier_Name")).sendKeys("jansi");
		driver.findElement(By.id("x_Address")).sendKeys("12-66-192,sri nagar colony");
		driver.findElement(By.id("x_City")).sendKeys("hyd");
		driver.findElement(By.id("x_Country")).sendKeys("india");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("janaki");
		driver.findElement(By.id("x_Phone_Number")).sendKeys("040854622");
		driver.findElement(By.id("x__Email")).sendKeys("janu@gmail.com");
		driver.findElement(By.id("x_Mobile_Number")).sendKeys("8456975255");
		driver.findElement(By.id("x_Notes")).sendKeys("ufhduikv");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		String expval="add succeeded";
		
		String actval=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		System.out.println(actval);
		
		if (expval.equalsIgnoreCase(actval)) 
		{
			
		System.out.println("added succeeded");
		}
		else
		{
			System.out.println("not added succeeded");
		}
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		
	     driver.findElement(By.linkText("Stock Categories")).click();
	     driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	     org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
	     driver.findElement(By.id("x_Category_Name")).sendKeys("pouch");
	     driver.findElement(By.id("btnAction")).click();
	     driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    String expval1="added successfully";
	     String actval1=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
			org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			System.out.println(actval1);
			
			if (expval1.equalsIgnoreCase(actval1)) 
			{
				
			System.out.println("added succeeded");
			}
			else
			{
				System.out.println("not added succeeded");
			}
			Actions act1=new Actions(driver);
			
			act1.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();

			 driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
			 driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			 org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
			 driver.findElement(By.id("x_UOM_ID")).sendKeys("105");
			 driver.findElement(By.id("x_UOM_Description")).sendKeys("dgvfh");
			 driver.findElement(By.id("btnAction")).click();
			 driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			 String expval2="added successfully";
		     String actval2=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
				org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
				driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
				System.out.println(actval2);
				
				if (expval2.equalsIgnoreCase(actval2)) 
				{
					
				System.out.println("added succeeded");
				}
				else
				{
					System.out.println("not added succeeded");
				}	    
			act.build().perform();
			
		
		//stock item creation
		driver.findElement(By.linkText("Stock Items")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);				
		Select slist=new Select(driver.findElement(By.id("x_Category")));
		slist.selectByVisibleText("pouch");
		Select slist1=new Select(driver.findElement(By.id("x_Supplier_Number")));
		slist1.selectByVisibleText("ffddff");
		driver.findElement(By.id("x_Stock_Name")).sendKeys("fgbv");
		Select slist2=new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
		slist2.selectByVisibleText("rrrrrrr");
		driver.findElement(By.id("x_Purchasing_Price")).sendKeys("1500");
		driver.findElement(By.id("x_Selling_Price")).sendKeys("2000");
		driver.findElement(By.id("x_Notes")).sendKeys("xgbfh");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		
		String expval3="added successfully";
	     String actval3=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
	     org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
	
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
			System.out.println(actval3);
			
			if (expval3.equalsIgnoreCase(actval3)) 
			{
				
			System.out.println("added succeeded");
			}
			else
			{
				System.out.println("not added succeeded");
			}
		//purchaser creation
		
		driver.findElement(By.xpath(".//*[@id='mi_a_purchases']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[2]/div/a")).click();
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath(".//*[@id='r3_a_purchases_detail']/td[1]/div/a")).click();
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.xpath(".//*[@id='r2_a_purchases_detail']/td[1]/div/a")).click();
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		
		Select slist6=new Select(driver.findElement(By.xpath(".//*[@id='x_Supplier_ID']")));
		
		
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		
		slist6.selectByVisibleText("nexus");
		
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		
		Select slist11=new Select(driver.findElement(By.id("x1_Supplier_Number")));
		slist11.selectByVisibleText("nexus");
		
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		
		Select slist21=new Select(driver.findElement(By.id("x1_Stock_Item")));
		slist21.selectByVisibleText("laptop");
		
		//Select slist3=new Select(driver.findElement(By.id("x1_Purchasing_Quantity")));
		
		//slist3.selectByVisibleText("10");
		driver.findElement(By.id("x1_Purchasing_Quantity")).sendKeys("10");
		
		driver.findElement(By.id("x1_Purchasing_Price")).click();
		driver.findElement(By.id("x1_Selling_Price")).click();
		driver.findElement(By.xpath(".//*[@id='x1_Purchasing_Total_Amount']")).click();
		
		//driver.findElement(By.id("x1_Purchasing_Quantity")).click();
		driver.findElement(By.id("x_Total_Payment")).sendKeys("1555");
	    driver.findElement(By.id("btnAction")).click();
	  
	    String expval4="added successfully";
	     String actval4=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div")).getText();
	     org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
	
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
			System.out.println(actval4);
			
			if (expval4.equalsIgnoreCase(actval4)) 
			{
				
			System.out.println("added succeeded");
			}
			else
			{
				System.out.println("not added succeeded");
			}
			String expval5="added successfully";
		     String actval5=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
		     org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		
				driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
				org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
				System.out.println(actval5);
				
				if (expval5.equalsIgnoreCase(actval5)) 
				{
					
				System.out.println("added succeeded");
				}
				else
				{
					System.out.println("not added succeeded");
				}
		
		
		
		
		
		//customer creation
		driver.findElement(By.xpath(".//*[@id='mi_a_customers']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.id("x_Customer_Name")).sendKeys("hema");
		driver.findElement(By.id("x_Address")).sendKeys("fdhgvj");
		driver.findElement(By.id("x_City")).sendKeys("fxhg");
		driver.findElement(By.id("x_Country")).sendKeys("fchn");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("fcbgv");
		driver.findElement(By.id("x_Phone_Number")).sendKeys("40456565546");
		driver.findElement(By.id("x__Email")).sendKeys("gbfhgj");
		driver.findElement(By.id("x_Mobile_Number")).sendKeys("8745555252");
		driver.findElement(By.id("x_Notes")).sendKeys("fttgfy");
		driver.findElement(By.id("btnAction" )).click();
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		String expval41="added successfully";
	     String actval41=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
	     org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
	
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
			System.out.println(actval41);
			
			if (expval41.equalsIgnoreCase(actval41)) 
			{
				
			System.out.println("added succeeded");
			}
			else
			{
				System.out.println("not added succeeded");
			}
		//sales creation
		/*driver.findElement(By.xpath(".//*[@id='mi_a_sales']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();*/
		
				
				
		}
		
	}
	



