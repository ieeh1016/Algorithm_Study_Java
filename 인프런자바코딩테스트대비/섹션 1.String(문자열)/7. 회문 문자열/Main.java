import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public String solution(String str) {
		String answer = "";
		String test = str.toLowerCase();
		
		int lt=0;
		int rt=str.length() - 1;
		
		int count = 0;
		
		for(int i=0; i<str.length()/2; i++) {
			if(test.charAt(lt) != test.charAt(rt)) {
				count++;
				lt++;
				rt--;
			}
			else {
				lt++;
				rt--;
			}
		}
		if(count == 0) {
			answer = "YES";
		}
		else {
			answer = "NO";
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.print(T.solution(str));
	}
}	
