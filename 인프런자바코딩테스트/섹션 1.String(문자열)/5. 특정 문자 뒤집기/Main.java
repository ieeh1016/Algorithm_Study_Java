import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public String solution(String str) {
		
		
		char[] arr = str.toCharArray();
		
		int lt = 0;
		int rt = str.length() - 1;
		
		
		while(lt < rt)
		{
			if(!((arr[lt] >= 'A' && arr[lt] <= 'Z') || (arr[lt] >= 'a' && arr[lt] <= 'z'))) {
				lt++;
			}
			else if(!((arr[rt] >= 'A' && arr[rt] <= 'Z') || (arr[rt] >= 'a' && arr[rt] <= 'z'))) {
				rt--;
			}
			else {
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		String answer = String.valueOf(arr);
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
