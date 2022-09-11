import java.util.Scanner;
import java.util.Stack;

class Main {
	public int solution(int[][] board, int[] moves){
		int answer = 0;

		Stack<Integer> stack = new Stack<>();

		for(int i =0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					if(stack.isEmpty()) {
						stack.push(board[j][moves[i]-1]);
						board[j][moves[i]-1] = 0;
					}
					else {
						if(stack.peek() == board[j][moves[i]-1]) {
							stack.pop();
							answer += 2;
							board[j][moves[i]-1] = 0;
						}
						else {
							stack.push(board[j][moves[i]-1]);
							board[j][moves[i]-1] = 0;
						}
					}
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
		int[][] board=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j]=kb.nextInt();
			}
		}
		int m=kb.nextInt();
		int[] moves=new int[m];
		for(int i=0; i<m; i++) moves[i]=kb.nextInt();
		System.out.println(T.solution(board, moves));
	}
}