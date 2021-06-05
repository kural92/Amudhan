package com.testScript;

import java.io.*;
import java.util.*;

import org.apache.xalan.xsltc.compiler.sym;
import org.testng.annotations.Test;

import java.math.*;

public class test1 {
   
	@Test
	public void methods() throws Throwable {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
		/*
		 * System.out.println("Enter the Value of Job Start : "); int i1 = s.nextInt();
		 * //System.out.println("Enter the Value of Job Start : ");
		 * System.out.println(i1);
		 */
	
	int i1=0;
	int[] cc = null;
	int aaaray[];
	System.out.println("Enter the number of Job : ");
	int i2 = s.nextInt();
	
	System.out.println(i2);
	
	int j1=0;
		/*
		 * System.out.println("Enter the Value of Machine Start : "); int j1 =
		 * s.nextInt();
		 * 
		 * System.out.println(j1);
		 */
	
	System.out.println("Enter the number of Machinene : ");
	int j2 = s.nextInt();
	
	System.out.println(j2);
	
	int[] j3 = new int[j2];
	
	//////////////////////////////////
/*	
	for (int a = 0; a <=i2; a++) {
		
		for (int b = 0; b <j2; b++) {
			System.out.println("Enter The Array Value ");
			j3[b] = s.nextInt();
		
			
		}
		
		  System.out.println("Contents of the array are: "+Arrays.toString(j3));
		    String abc =  Arrays.toString(j3);
		    
		    String abd = abc.replace("]", "}");
		    Thread.sleep(2000);
		    String abe = abd.replace("[", "{");
		    String abf = abe+",";
		    System.err.println(abf);
		    
		    int mnb=Integer.parseInt(abe);
		    
		    
		 
		    int[][] p = mnb ; 
		
	}
	
	*/
	//////////////////

	int[][] arays = new int[i2][j2];
	
	for (int d = 0; d < i2; d++) {
		
		for (int e = 0; e < j2; e++) {
			System.out.println("Please Enter The Value");
			
			
		}
		System.out.println("YOU ENTERED : ");
		
		
	}
	
for (int d = 0; d < i2; d++) {
		
		for (int e = 0; e < j2; e++) {
			
			arays[d][e] =s.nextInt();
		}
		System.out.println(Arrays.toString(arays+ " ");
		
	//	String aqw= Arrays.toString();
		//System.out.println(aqw);
		
		System.out.println("");
		
	}
	
	
	
	
	//////////////////////////////////
  
       int[][] p = {  { 2,3,4,3,1,6},{3,4,6,1,2,6},{4,5,6,3,2,6} ,{4,5,6,3,2,6}}; 
        int i,j,k;
        double[] javg=new double[10];
        double[] j1avg=new double[10];
        double pavg,sum,sum1=0,temp;
        double[] min=new double[10];
        double[] max=new double[10];
        int[] loc=new int[10];
        double[] djavg=new double[10];
        int[][] start=new int[10][10];
        int[][] end=new int[10][10];



        for (i = i1; i < i2; i++)
        {
             sum=0;
            for (j = j1; j < j2; j++)
            {
                System.out.println("Job[" + i + "][" + j + "] = "
                                   +p[i][j]);
                sum=sum+p[i][j];
            }

            javg[i]=sum/j;

                System.out.println("Jaavg[" + i + "] = "
                                   +javg[i]);

            sum1=sum1+javg[i];

       }
       pavg=sum1/i;
        System.out.println("Process Average = "+pavg);

        for (i = i1; i < i2; i++)
        {
             min[i]=max[i]=p[i][0];
             
            for (j = j1; j < j2; j++)
            {
               if(p[i][j]<min[i])
               {
                  min[i]=p[i][j];

               }
               if(p[i][j]>max[i])
               {
                   max[i]=p[i][j];


                }
              }
                System.out.println("Minimum["+i+"]=" +min[i]);
                System.out.println("Maximum["+i+"]=" +max[i]);
                j1avg[i]=(1/(min[i]+max[i]));
                j1avg[i]=djavg[i]=Math.round(j1avg[i]*1000.0)/1000.0;
                if(javg[i]<pavg)
                    j1avg[i]=djavg[i]=-1*j1avg[i];

                System.out.println("J-1 Average["+i+"]=" +j1avg[i]);


             
          }


        for (i = i1; i < i2; i++) 
                {
                for (j = i + 1; j < p.length; j++) 
                {
                if (j1avg[i] > j1avg[j]) 
                {
                    temp = j1avg[i];
                    j1avg[i] = j1avg[j];
                    loc[i]=j;
                    j1avg[j] = temp;
                }
            }
        }


          for(i=i1;i<i2;i++)

          {
            System.out.println("    "+djavg[i]+"    "+j1avg[i]);

          }


      for(i=i1;i<i2;i++)

      {

         for(j=j1;j<j2;j++)
         {
          if(j1avg[i]==djavg[j])
          {
             loc[i]=j;
           //  System.out.println(j);

         }
      }

     }
      for(i=i1;i<i2;i++)
      System.out.println("Now the Scheduling is :J"+(loc[i]+1)+" ");


      start[0][0]=0;
      for(i=i1;i<i2;i++)
      {
         if(i>0)
         {
         start[i][0]=end[i-1][0];
         }
         for(j=j1;j<j2;j++)
         {
                 if(i>0 && j>0)
                 {
                       start[i][j]=end[i-1][j];
                 }
                    end[i][j]= start[i][j]+p[loc[i]][j];
                    start[i][j+1]=end[i][j];
                
         }
     }
          for(i=i1;i<i2;i++)


          {
            for(j=j1;j<j2;j++)
            {
            System.out.print(" "+start[i][j]+"-"+end[i][j]);

            }
            System.out.println("\n");

        }

         
    }



}