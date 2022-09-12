import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
	public String solution(String need, String plan){
		String answer = "NO";
		Queue<Character> queue = new LinkedList<>();
		
		for(int i=0; i<need.length(); i++) {
			queue.add(need.charAt(i));
		}
		for(int i=0; i<plan.length(); i++) {
			
			if(queue.peek() != null && plan.charAt(i) == queue.peek()){
				queue.remove();
			}
		}
		if(queue.poll() == null) {
			answer = "YES";
		}
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.println(T.solution(a, b));
	}
}
