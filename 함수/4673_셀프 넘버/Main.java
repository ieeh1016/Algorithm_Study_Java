import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a=10000;
		
		boolean array[] = new boolean[10001];
		Arrays.fill(array, false);
		for(int i=1; i<10001; i++) {
			int n = d(i);
			if(n<10001) {
				array[n]=true;
			}
		}
		for(int i=1; i<10001; i++) {
			if(!array[i]) {
			}
		}
			
			
		}
	public static int d(int number) {
		int a=number;
		
		while(number!=0) {
			a+=(number%10);
			number=number/10;
		}
		return a;
	}
		
}


	
