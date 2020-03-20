package SprintTask;

public class digit10 {
	
	static String a = "1234567890";
	
	public static void main(String[] args) {
		
		
		String b = a.substring(0,3);
		System.out.println(b);
		
		String c = a.substring(3,6);
		System.out.println(c);
		
		
		String d = a.substring(6,10);
		System.out.println(d);
		
		String e = b+"-"+c+"-"+d;
		System.out.println(e);
		
		
	}

}
