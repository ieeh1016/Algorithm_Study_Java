import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public ArrayList<String> solution(int number , int[] arrA, int[] arrB) {
		ArrayList<String> arr = new ArrayList<>();
		
		//가위 1 바위 2 보 3
		
		for(int i=0; i<number; i++) {
			if((arrA[i] > arrB[i] && (arrA[i] - arrB[i] == 1)) || (arrB[i] -arrA[i] == 2)) {
				arr.add("A");
			}
			else if(arrA[i] == arrB[i]) {
				arr.add("D");
			}
			else {
				arr.add("B");
			}
		}
		
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arrA = new int[number];
		int[] arrB = new int[number];
		for(int i=0; i<number; i++) {
			int input = sc.nextInt();
			arrA[i] = input;
		}
		for(int i=0; i<number; i++) {
			int input = sc.nextInt();
			arrB[i] = input;
		}
		
		
		for(String x: T.solution(number, arrA, arrB)) {
			System.out.println(x);
		}
	}
}	
