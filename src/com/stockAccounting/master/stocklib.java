package com.stockAccounting.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class stocklib 
	{
	public static WebDriver driver;
	public static String Expval,Actval;
	public static Properties pr;
	public static FileInputStream fi;
	

    public String openApp(String Url) throws IOException
	{
    pr = new Properties();
    	FileInputStream Fi = new FileInputStream("D:\\Jansi\\stockAccounting\\src\\com\\stockAccounting\\properties\\Rep.properties");
    	pr.load(Fi);
        Expval="Login";
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(Url);
		Actval=driver.findElement(By.id(pr.getProperty("Login"))).getText();
	    if (Expval.equalsIgnoreCase(Actval))
	    {
		//System.out.println("pass");
		  return "Pass";
	    }
	    else
	    {
	    	//System.out.println("Fail");
	       return "Fail";
	    }
	}

	public String Admlgn(String Un,String Pwd)
	{
		Expval="Administrator";
		driver.findElement(By.id(pr.getProperty("Reset"))).click();
		driver.findElement(By.id(pr.getProperty("Uname"))).sendKeys(Un);
		driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys(Pwd);
		driver.findElement(By.id(pr.getProperty("Login"))).click();
		Sleeper.sleepTightInSeconds(2);
		 Actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
	 	    if(Expval.equalsIgnoreCase(Actval))
	 	       {
	 			//System.out.println("Stock accounting home page displayed");
	 	      return "pass";
	 	       }
	 	       else
	 	       {
	 	    	//System.out.println("Stock accounting home page not displayed");
	 	       return "Fail";
	 	       }
	}

 
	
	//supplier creation
	 public String Supplier(String sname,String adrs,String city,String cntry,String cntprsn,String phno,String emil,String mbno,String nts)
	 	    {
	 	    	driver.findElement(By.xpath(pr.getProperty("Supclk"))).click();
	 			driver.findElement(By.xpath(pr.getProperty("Supadd"))).click();
	 		Sleeper.sleepTightInSeconds(2);
	 			driver.findElement(By.id(pr.getProperty("sname"))).sendKeys(sname);
	 			driver.findElement(By.id(pr.getProperty("adrs"))).sendKeys(adrs);
	 			driver.findElement(By.id(pr.getProperty("cty"))).sendKeys(city);
	 			driver.findElement(By.id(pr.getProperty("cntry"))).sendKeys(cntry);
	 			driver.findElement(By.id(pr.getProperty("cntprsn"))).sendKeys(cntprsn);
	 			driver.findElement(By.id(pr.getProperty("phno"))).sendKeys(phno);
	 			driver.findElement(By.id(pr.getProperty("emil"))).sendKeys(emil);
	 			driver.findElement(By.id(pr.getProperty("mbno"))).sendKeys(mbno);
	 			driver.findElement(By.id(pr.getProperty("nts"))).sendKeys(nts);
	 			driver.findElement(By.id(pr.getProperty("add"))).click();
	 			driver.findElement(By.xpath(pr.getProperty("Supnew"))).click();
	 			String expval="Add succeeded";
	 			
	 			String actval=driver.findElement(By.xpath(pr.getProperty("Supconfirm"))).getText();
	 			Sleeper.sleepTightInSeconds(2);
	 			driver.findElement(By.xpath(pr.getProperty("Supaddok"))).click();
	 			System.out.println(actval);
	 			
	 			if (expval.equalsIgnoreCase(actval)) 
	 			{
	 				return "supplier created";
	 				
	 			}
	 			else
	 			{
	 				return "supplier not created";
	 			}
	 	    }
	   //stock category
	public String stCategory(String catgryname) 
	  {
		  Actions act=new Actions(driver);
			
			act.moveToElement(driver.findElement(By.xpath(pr.getProperty("stitemsclk")))).build().perform();
			
		     driver.findElement(By.linkText(pr.getProperty("stcatgryclk"))).click();
		     driver.findElement(By.xpath(pr.getProperty("stcatgryadd"))).click();
		     Sleeper.sleepTightInSeconds(2);
		     driver.findElement(By.id(pr.getProperty("stcatgryname"))).sendKeys(catgryname);
		     driver.findElement(By.id(pr.getProperty("stcatgryad"))).click();
		     driver.findElement(By.xpath(pr.getProperty("stcatgrynew"))).click();
		    String expval1="Add succeeded";
		     String actval1=driver.findElement(By.xpath(pr.getProperty("stcatgryconfirm"))).getText();
				Sleeper.sleepTightInSeconds(2);
				driver.findElement(By.xpath(pr.getProperty("stcatgryaddok"))).click();
				System.out.println(actval1);
				
				if (expval1.equalsIgnoreCase(actval1)) 
				{
					
				return "pass";
				}
				else
				{
				return "fail";
				}

	}
	  //stuom creation
	 public String stUom(String uomid,String uomdes)
	  {
		 
		  Actions act=new Actions(driver);
			
		  Sleeper.sleepTightInSeconds(5);
		 // act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		  
      act.moveToElement(driver.findElement(By.xpath(pr.getProperty("sctlink")))).build().perform();

			 driver.findElement(By.xpath(pr.getProperty("stuom"))).click();
			 
			 driver.findElement(By.xpath(pr.getProperty("stuomadd"))).click();
			 
			 Sleeper.sleepTightInSeconds(2);
			 driver.findElement(By.id(pr.getProperty("stuomid"))).sendKeys(uomid);
			 driver.findElement(By.id(pr.getProperty("stuomdes"))).sendKeys(uomdes);
			 driver.findElement(By.id(pr.getProperty("stuomad"))).click();
			 driver.findElement(By.xpath(pr.getProperty("stuomnew"))).click();
			 String expval2="Add succeeded";
		     String actval2=driver.findElement(By.xpath(pr.getProperty("stuomconfirm"))).getText();
				Sleeper.sleepTightInSeconds(2);
				driver.findElement(By.xpath(pr.getProperty("stuomaddok"))).click();
				//System.out.println(actval2);
				
				if (expval2.equalsIgnoreCase(actval2)) {
					return "pass";
					
				} else {
					return "fail";

				}
	  }
	//stockitem creation
	public String stItems(String ctgry,String supno,String stname,String uom,String prchsingprice,String sellprice,String nts)
	{
		driver.findElement(By.linkText(pr.getProperty("stitemclk"))).click();
		driver.findElement(By.xpath(pr.getProperty("stitemadd"))).click();
		org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);				
		Select slist=new Select(driver.findElement(By.id(pr.getProperty("stitemcatgry"))));
		slist.selectByVisibleText(ctgry);
		Sleeper.sleepTightInSeconds(2);
		Select slist1=new Select(driver.findElement(By.id(pr.getProperty("stitemsupno"))));
		slist1.selectByVisibleText(supno);
		driver.findElement(By.id(pr.getProperty("sitemstname"))).sendKeys(stname);
		Select slist2=new Select(driver.findElement(By.id(pr.getProperty("stitemuom"))));
		slist2.selectByVisibleText(uom);
		driver.findElement(By.id(pr.getProperty("stitempurprice"))).sendKeys(prchsingprice);
		driver.findElement(By.id(pr.getProperty("stitemsellprice"))).sendKeys(sellprice);
		driver.findElement(By.id(pr.getProperty("stitemnts"))).sendKeys(nts);
		driver.findElement(By.id(pr.getProperty("stitemad"))).click();
		driver.findElement(By.xpath(pr.getProperty("stitemnew"))).click();
		
		String expval3="Add successed";
	     String actval3=driver.findElement(By.xpath(pr.getProperty("stitemconfirm"))).getText();
	     org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
	
			driver.findElement(By.xpath(pr.getProperty("sitemaddok"))).click();
			org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
			System.out.println(actval3);
			
			if (expval3.equalsIgnoreCase(actval3)) 
			{
				
			return "pass";
			}
			else
			{
				return "fail";
			}

	}
	public  String Logout()
	{
		driver.findElement(By.xpath(".//*[@id='logout']")).click();
		List<WebElement> lo=driver.findElements(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"));
		for (int i = 0; i < lo.size(); i++)
		{
		if (lo.get(i).getText().equalsIgnoreCase("OK!")) 
		{
			lo.get(i).click();
			break;
		}
		}
				//String expval4="Are you sure you want to logout?";
	  //driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    // org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
	
			//driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			//org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
			//System.out.println(actval4);
			
			/*if (expval4.equalsIgnoreCase(actval4)) 
			{
				
			return "pass";
			}
			else
			{
				return "fail";
			}*/
		if (driver.findElement(By.id("btnsubmit")).isDisplayed()) 
		{
		return "pass";	
		}else
		{
		return "fail";
		}
		
	}
	public void closeApp() 
	{
	driver.quit();	
	}
	
	 	    
	 	    
	}




