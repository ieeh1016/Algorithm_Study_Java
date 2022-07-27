import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a=scanner.nextInt();

		if (a%5==0) {
			System.out.print(a/5);
		}
		else if(a==4 || a==7){
			
			System.out.print(-1);
		}
		else if(a%5==2 || a%5==4) {
			System.out.print((a/5)+2);
		}
		else if(a%5==3 || a%5==1) {
			System.out.print((a/5)+1);
		}
				
	}
}


	
