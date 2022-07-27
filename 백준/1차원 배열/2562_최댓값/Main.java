import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int array[] = new int[9];
		int big=0;
		int check=0;
		
		for(int i=0; i<array.length; i++) {
			int c = scanner.nextInt();
			array[i]=c;
			
			if(big<array[i]) {
				big=array[i];
				check=i+1;
			}
			
	}
		System.out.println(big);
		System.out.print(check);
		
	}
}
