import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			if(i<str.length()-1) {
				if(str.charAt(i)=='c' && str.charAt(i+1)=='=') {
					i++;
				}
				else if(str.charAt(i)=='c' && str.charAt(i+1)=='-') {
					i++;
				}
				else if(str.charAt(i)=='d' && str.charAt(i+1)=='-') {
					i++;
				}
				
				else if(str.charAt(i)=='l' && str.charAt(i+1)=='j') {
					i++;
				}
				else if(str.charAt(i)=='n' && str.charAt(i+1)=='j') {
					i++;
				}
				else if(str.charAt(i)=='s' && str.charAt(i+1)=='=') {
					i++;
				}
				else if(str.charAt(i)=='z' && str.charAt(i+1)=='=') {
					i++;
				}
				else {
					
				}
			}
			else {
				
			}
			if(i<str.length()-2) {
				if(str.charAt(i)=='d' && str.charAt(i+1)=='z' && str.charAt(i+2)=='=') {
					i+=2;
				}
				else {
					
				}
			}
			else {
				
			}
			count++;
		}
		System.out.print(count);
		}	
	
}
