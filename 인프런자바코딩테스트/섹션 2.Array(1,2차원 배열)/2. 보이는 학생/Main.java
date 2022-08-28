import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public int solution(int number , int[] arr) {
		int answer = 1;
		int max = arr[0];
		
		for(int i=1; i<number; i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
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
		
		System.out.print(T.solution(number, arr));
	}
}	
