package SprintTask;

import java.util.Scanner;

public class java_prog {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter The Number");
		
		int a = s.nextInt();
		
		if (a%3==0) {
			
			System.out.println("Hi" );
			
		} else if (a%5==0) {
			System.out.println("Bye");
		} else {
			System.out.println("Noyt divisible by 3 and 5 ");
			
		}
		
		if (a%3==0 && a%5==0) {
			System.out.println("Hi abd Bye");
		} else {
			
			
		}
		
		
		
		
		
	}

}
