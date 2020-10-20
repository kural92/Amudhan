package com.sitemonitoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TraceRoute {

    public static void main(String args[]){

	    BufferedReader in;
	    String a = "A Bc Cde";
        String[] b = a.split(" ");
        int c = b.length;
        System.out.println(c);

	        try{
	            Runtime r   =   Runtime.getRuntime();
	            Process p   =   r.exec("tracert cmatri.in");

	            in  =   new BufferedReader(new InputStreamReader(p.getInputStream()));

	            String line;
	            
	            
	         

	            if(p==null)
	                System.out.println("could not connect");

	            while((line=in.readLine())!=null){

	                System.out.println(line);

	                //in.close();
	            }

	        }catch(IOException e){

	        System.out.println(e.toString());

	        }
	    }
	
}
