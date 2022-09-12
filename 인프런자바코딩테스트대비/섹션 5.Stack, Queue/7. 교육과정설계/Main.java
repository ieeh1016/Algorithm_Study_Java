import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
	public int solution(int n, int k){
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		for(int i=0; i<n-1; i++) {
			for(int j =0; j<k-1; j++) {
				int number = queue.remove();
				queue.add(number);
			}
			queue.remove();
		}
		answer = queue.peek();
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
