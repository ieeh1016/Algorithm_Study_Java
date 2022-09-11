import java.util.Scanner;

class Main {
	public int solution(int n){
		int answer = 0;
		
		int number = n / 2 + 1;
		for(int i=0; i<number; i++) {
			int sum = 0;
			for(int j=i+1; j<=number; j++) {
				sum = sum + j;
				if(sum == n) {
					
					answer++;
					break;
				}
			}
		}
		

		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.print(T.solution(n));
	}
}