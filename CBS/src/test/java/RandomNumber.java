import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import org.apache.xalan.xsltc.compiler.sym;

public class RandomNumber {
	static int i,j,temp;
	public static void main(String[] args) {
		
		
		try {
			
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br  =  new BufferedReader(in);
			int a[] = new int[10];
			Random r = new Random();
			System.err.println("Enter the Number of Elements");
			int n = Integer.parseInt(br.readLine());
			System.err.println("\n\t Random Numbers are");
			for (int i = 0; i < n; i++) 
				a[i]=r.nextInt(n);
				
				for (int i = 0; i < n; i++)
					System.err.println("\t"+a[i]);
				
				int opt;
				
				do {
					System.err.println("\t 1. Ascending Order");
					System.err.println("\t 2. Descending Order");
					System.err.println("\t 3. Exit");
					System.err.println("\t Enter your Choice");
					 int k = Integer.parseInt(br.readLine());
					 
					 switch (k) {
					case 1:
						
					{
						System.err.println("\t 1. Ascending Order");
						for (int i = 0; i < n; i++) 
							for (int j = i+1; j < n; j++) ;
						
						{
							if (a[i]>a[j])
							{
								int temp=a[i];
								a[i]=a[j];
								a[j]=temp;
							}
						}
						for (int i = 0; i < n; i++) 
							System.err.println("\n\t"+a[i]);
						break;
						
								
								
							}
					
	case 2:
						
					{
						System.err.println("\t 1. Descending Order");
						for (int i = 0; i < n; i++) 
							for (int j = i+1; j < n; j++) ;
						
						{
							if (a[i]<a[j]) {
								
								int temp=a[i];
								a[i]=a[j];
								 a[j]=temp;
							}
						}
						for (int i = 0; i < n; i++) 
							System.err.println("\n\t"+a[i]);
						break;
						
								
								
							}
	case 3:
		System.exit(0);
						
						
						
					 }
					
					System.out.println("\n\t Do you want to continue (0/1)");
					opt=Integer.parseInt(br.readLine());
					
					
					
					
					
					
				} while (opt==1);
					
			
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
