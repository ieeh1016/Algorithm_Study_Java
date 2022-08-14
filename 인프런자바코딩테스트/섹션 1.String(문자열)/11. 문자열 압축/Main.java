import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public String solution(String str) {
		String answer = "";
		
		int count = 1;
		str = str + " ";
		for(int i=0; i<str.length()-1; i++) {
			if((str.charAt(i) == str.charAt(i+1))) {
				count++;
				
			}
			else {
				if(count>1) {
					answer += str.charAt(i) + Integer.toString(count);
					count = 1;
				
				}
				else {
					answer += str.charAt(i);
				}
				
			}
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
