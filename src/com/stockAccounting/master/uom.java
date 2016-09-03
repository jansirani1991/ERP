package com.stockAccounting.master;

import java.io.IOException;

public class uom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		stocklib SL=new stocklib();
		String Res=SL.openApp("http://webapp.qedgetech.com");
         System.out.println(Res);
         Res=SL.Admlgn("admin","master");
	     System.out.println(Res);
	     Res=SL.stUom("go10tfyu", "sdftuthkjfd");
	     System.out.println(Res);
	     
	}

}
