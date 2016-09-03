package com.stockAccounting.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws IOException
	{
		stocklib SL=new stocklib();
		String Res=SL.openApp("http://webapp.qedgetech.com");
         System.out.println(Res);
         Res=SL.Admlgn("admin","master");
	     System.out.println(Res);
	     
		 /*FileInputStream Fis=new FileInputStream("D:\\Jansi\\stockAccounting\\src\\com\\stockAccounting\\testdata\\catgrydel.xlsx");
		  
		  //Creating Workbook
		  
		    XSSFWorkbook WB=new XSSFWorkbook(Fis);
		    //Worksheet
		    XSSFSheet WS=WB.getSheet("catgrydetail");
		    int Rc=WS.getLastRowNum();
		    System.out.println(Rc);
		    //XSSFRow WR=WS.getRow();
		  //  XSSFCell WC=WR.getCell(0);
		    // Res=WC.getStringCellValue();
		    //System.out.println(Res);
		  //  Res=SL.stCategory(catgryname);
		    
		        for (int i = 1; i <=Rc; i++)
		        {
		        	XSSFRow WR=WS.getRow(i);
		    	    XSSFCell WC=WR.getCell(0);
		    	    
		    	    XSSFCell WC2=WR.createCell(1);
		    	    String scategiry=WC.getStringCellValue();
		    	    //String uomdes=WC1.getStringCellValue();
		    	  
					Res=SL.stCategory(scategiry);
		    	   // Res=SL.stUom(uomid, uomdes);
		             System.out.println(Res);
		             WC2.setCellValue(Res);
		        }	
		    
		    FileOutputStream Fos=new FileOutputStream("D:\\Jansi\\stockAccounting\\src\\com\\stockAccounting\\results\\catgrydel.xlsx");
		    WB.write(Fos);
		    WB.close();*/
		    
		  
	    /*Res=SL.Supplier("yuyiu", "ghjfgh", "gvjh", "gvfh", "fgfh", "2548855", "cvnbjb", "854566566", "fchgv");
	     System.out.println(Res);*/
	    /* Res=SL.stCategory("pouch");
	     System.out.println(Res);*/
	     /*Res=SL.stUom("505", "fdjguohi");
	     System.out.println(Res);*/
	    /* Res=SL.stItems("pouch", "34t", "ffhg", "344", "5675", "8777", "fcgfhgj");
	     System.out.println(Res);*/
	     Res=SL.Logout();
	     System.out.println(Res);
	     SL.closeApp();
	     
	     
	     
	}
	

}
