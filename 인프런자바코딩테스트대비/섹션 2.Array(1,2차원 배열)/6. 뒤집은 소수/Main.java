import java.util.ArrayList;
import java.util.Scanner;

class Main {
	

	public boolean isPrime(int x) {
		if(x==1) return false;
		for(int i=2; i<x; i++) {
			if(x % i == 0) return false;
		}
		
		return true;
	}
	
	public ArrayList<Integer> solution(int number, int[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=0; i<number; i++) {
			int tmp = arr[i];
			int rev = 0;
			while(tmp>0) {
				rev = rev*10 + tmp%10;
				tmp = tmp / 10;
			}
			if(isPrime(rev)) {
				arrayList.add(rev);
			}
		}
		
		
		return arrayList;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr = new int[number];
		for(int i=0; i<number; i++) {
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		for(int x: T.solution(number, arr)) {
			System.out.print(x + " ");
		}
	
	
	}
   
   

}