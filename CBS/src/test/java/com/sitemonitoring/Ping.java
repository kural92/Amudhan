package com.sitemonitoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ping {
	
	   public static void main(String[] args) {
	        String ip = "cmatri.in";
	        String pingResult = "";

	        String pingCmd = "ping " + ip;
	        try {
	            Runtime r = Runtime.getRuntime();
	            Process p = r.exec(pingCmd);

	            BufferedReader in = new BufferedReader(new
	            InputStreamReader(p.getInputStream()));
	            String inputLine;
	            while ((inputLine = in.readLine()) != null) {
	                System.out.println(inputLine);
	                pingResult += inputLine;
	            }
	            in.close();

	        } catch (IOException e) {
	            System.out.println(e);
	        }
	        
		    BufferedReader in;

	        try{
	            Runtime r   =   Runtime.getRuntime();
	            Process p   =   r.exec("tracert www.communitymatrimony.com");

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
