package SprintTask;

import java.util.Base64;

public class Encryption {

public static void main(String[] args) {

String encrptData= "AGR104152";
		
byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
		
System.out.println("encodedBytes --------------->" + new String(encodedBytes));

}
}
//*[@id="textareawrapper"]/div/div[6]