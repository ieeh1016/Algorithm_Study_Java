import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public ArrayList<Integer> solution(int number) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		if(number == 1) {
			arr.add(1);
		}
		else if(number == 2) {
			for(int i=0; i<2; i++) {
				arr.add(1);
			}
		}
		else {
			for(int i=0; i<2; i++) {
				arr.add(1);
			}
			for(int i=2; i<number; i++) {
				arr.add(arr.get(i-2) + arr.get(i-1));
			}
		}
		
		
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for(int x: T.solution(number)) {
			System.out.print(x+" ");
		}
	}
}	
