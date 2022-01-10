import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.next();
		byte[] bytes = a.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes[0]);
 
		
	}
 

 
}


	
