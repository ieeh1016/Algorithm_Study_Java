import java.util.Scanner;

class Main {
	public int solution(int n, int k, int[] arr){
		
		int answer = 0;
		int sum = 0;
		
		for(int i=0; i<k; i++){
			sum = sum + arr[i];
		}
		
		answer = sum;
		
		for(int i=k; i<n; i++) {
			sum = sum + arr[i] - arr[i-k];
			if(sum > answer) {
				answer = sum;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}