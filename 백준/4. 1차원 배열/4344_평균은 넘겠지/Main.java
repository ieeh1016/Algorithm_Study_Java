import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a=scanner.nextInt();
		for(int i=0; i<a; i++) {
			int b = scanner.nextInt();
			int array[] = new int[b];
			int count=0;
			double sum=0;
			double avg=0;
			double result=0;
			
			for(int j=0; j<b; j++) {
				int c = scanner.nextInt();
				array[j]=c;
				sum=sum+array[j];
			}
			avg=sum/array.length;
			
			for(int k=0; k<b; k++) {
				if(array[k]>avg) {
					count++;
				}
			}
			result=(double)count/(double)array.length*100;
			DecimalFormat form = new DecimalFormat("#.000");
			
			
			System.out.printf("%.3f%%\n",(result));
			
			
			
		}

		
	}
}
	
