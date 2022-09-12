import java.util.Scanner;
import java.util.Stack;

class Main {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
				int number = str.charAt(i) - '0';
				stack.push(number);
			} else {
				int b = stack.peek();
				stack.pop();
				int a = stack.peek();
				stack.pop();
				switch (str.charAt(i)) {
				case '+':
					answer = a + b;
					break;
				case '-':
					answer = a - b;
					break;
				case '*':
					answer = a * b;
					break;
				case '/':
					answer = a / b;
					break;
				}
				stack.push(answer);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}