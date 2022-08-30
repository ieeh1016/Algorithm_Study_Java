import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public ArrayList<Integer> solution(int number , int[] arr) {
		ArrayList<Integer> answer= new ArrayList<>();
		
		answer.add(arr[0]);
		for(int i=1; i<number; i++) {
			if(arr[i] > arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr = new int[number];
		for(int i=0; i<number; i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}
		
		for(int x: T.solution(number, arr)) {
			System.out.print(x+" ");
		}
	}
}	
