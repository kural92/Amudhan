package com.testScript;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class test2  
{   
	
	@Test
public void class22() throws InterruptedException {
	/*	  
		      System.out.println("Enter the required size of the array :: ");
		      Scanner s = new Scanner(System.in);
		      int size = s.nextInt();
		      int myArray[] = new int [size];
		      System.out.println("Enter the elements of the array one by one ");
		    
		      for (int ii = 0; ii < 3; ii++) {
				
		    	  
			
		      
		      for(int i=0; i<size; i++) {
		         myArray[i] = s.nextInt();
		      }
		      System.out.println("Contents of the array are: "+Arrays.toString(myArray));
		    String abc =  Arrays.toString(myArray);
		    
		    String abd = abc.replace("]", "}");
		    Thread.sleep(2000);
		    String abe = abd.replace("[", "{");
		    System.err.println(abe);
		    
		   int mnb=Integer.parseInt(abe);
		     
		   int[] AA = new int[ii];
				   for (int i = 0; i < AA.length; i++) {
					  String[] D = AA[abe]
					   System.out.println();
				}
		        
		      }      
		      
		    */
		
		
		/*
		 int[] num;
	        Scanner scanner=new Scanner(System.in);
	        System.out.print("How many integers you want to enter: ");
	        int n = 0;
	        if(scanner.hasNextInt()) {
	            n=scanner.nextInt();
	        }
	        num=new int[n];
	        for (int e = 0; e < 3; e++) {
				
			
	        for(int i=0;i<n;i++) {
	            System.out.printf("Enter integer %d: ",i+1);
	            if(scanner.hasNextInt()) {
	                num[i]=scanner.nextInt();
	            }           
	        }
	       // System.out.println(Arrays.toString(num));
	        
	        String AQ = Arrays.toString(num);
	        System.err.println(AQ);
	        
	   //     String[] AW = Arrays.toString(num[i]);
	        }
		
		*/
		
		/*
		
		 Scanner input = new Scanner(System.in);

	        //allow user  input;
	        System.out.println("How many numbers do you want to enter?");
	        int num = input.nextInt();

	        int array[] = new int[num];

	        System.out.println("Enter the " + num + " numbers now.");

	        for (int i = 0 ; i < array.length; i++ ) {
	           array[i] = input.nextInt();
	        }

	        //you notice that now the elements have been stored in the array .. array[]

	        System.out.println("These are the numbers you have entered.");
	        printArray(array);

	        input.close();

	    }

	    //this method prints the elements in an array......
	    //if this case is true, then that's enough to prove to you that the user input has  //been stored in an array!!!!!!!
	    public static void printArray(int arr[]){

	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }

		*/
		
		
		
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String [] arr=str.split(" ");
        Integer [] a=new Integer[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            a[i]=Integer.parseInt(arr[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    

		
		
		
	}
}
