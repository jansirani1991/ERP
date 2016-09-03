package com.stockAccounting.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class uomdata {

	public static void main(String[] args) throws IOException
	{
		stocklib SL=new stocklib();
		String Res=SL.openApp("http://webapp.qedgetech.com");
         System.out.println(Res);
         Res=SL.Admlgn("admin","master");
	     System.out.println(Res);
	     
   //Filepath
		String Fpath="D:\\Jansi\\stockAccounting\\src\\com\\stockAccounting\\testdata\\Uom.txt";
 //Creating text file for resuluts
		String Rpath="D:\\Jansi\\stockAccounting\\src\\com\\stockAccounting\\results\\Uomres.txt";
		String SD;
		FileReader fr=new FileReader(Fpath);
		BufferedReader br=new BufferedReader(fr);
		String sread=br.readLine();
		System.out.println(sread);
		FileWriter fw=new FileWriter(Rpath);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(sread+"@@@"+"Results");
		bw.newLine();
		/*while((SD=br.readLine())!=null)
		{
			System.out.println(SD);
			String sr[]=SD.split("###");
			String uid=sr[0];
			System.out.println(uid);
			String udes=sr[1];
			System.out.println(udes);
			Res=SL.stUom(uid, udes);
			System.out.println(Res);
			bw.write(uid+"%%%"+udes+"@@@"+Res);
			bw.newLine();
		}
		bw.close();
		br.close();
          FileReader Fr=new FileReader(Fpath);
          BufferedReader Br=new BufferedReader(Fr);
          String Sread=Br.readLine();
          System.out.println(Sread);
          
          FileWriter Fw=new FileWriter(Rpath);
          BufferedWriter Bw=new BufferedWriter(Fw);
          Bw.write(Sread+"%%%"+"Results");
          Bw.newLine();*/
          
          while((SD=br.readLine())!=null) 
          {
			System.out.println(SD);
			String SR[]=SD.split("###");
                     String Uid=SR[0];
                     System.out.println(Uid);
                     String Udes=SR[1];
                  System.out.println(Udes);
               Res=SL.stUom(Uid, Udes);
                 System.out.println(Res);
                 
                 bw.write(Uid+"$$$"+Udes+"&&&"+Res);
                 bw.newLine();
                 
          }
          bw.close();
          br.close();

	}

}
