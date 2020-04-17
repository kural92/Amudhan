import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {

	
	public static void main(String[] args) {
		
		try {
			System.out.println("area & perimeter of the circle");
			System.out.println("********************");
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(in);
			System.out.println("Enter the Radius:");
			String s=br.readLine();
			double r=Double.parseDouble(s);
			double pi=3.14;
			double area=pi*r*r;
			double peri=2*pi*r;
			System.out.println("Area of the circle=" +area);
			System.out.println("perimeter of the circle="+peri);
		}
		catch(IOException e) 
		
		{   
			System.out.println(e);
		}
	}
}
			
	
		
		
		

