import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public int[] solution(String str, int c) {
		int[] answer = new int[str.length()];
		
		int check = 500;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				check = 0;
				answer[i] = check;
			}
			else {
				check++;
				answer[i] = check;
			}
		}
		
		check = 500;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == c) {
				check = 0;
			}
			else {
				check++;
				answer[i] = Math.min(answer[i],check);
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		for(int x : T.solution(str, c)) {
			System.out.print(x+" ");
		}
		
	}
}	
