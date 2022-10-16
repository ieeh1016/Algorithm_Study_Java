import java.io.*;
import java.util.*;

public class Main {	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<>();
		String formula = br.readLine();
		String zero = "+";

		// 처음 시작하는 부호가 -일 경우 (음수일 경우)
		if( !formula.startsWith("-")) {
			zero += formula;
			formula = zero;
		}


		int length = formula.length();
		boolean open = false;
		for(int i=0; i<length; i++) {
			char ch = formula.charAt(i);

			if(ch == '-' && open == false) {
				open = !open;
				list.add(ch + "(+");
			}
			// + 기호 인데, 괄호가 열려있음을 의미
			else if(ch == '+' && open == true) {
				list.add(String.valueOf(ch));
			}
			else if(ch == '-' && open == true) {
				list.add(")" + ch + "(+");
			}
			else {
				list.add(String.valueOf(ch));
			}

			// 마지막줄에 괄호가 열려있을 경우
			if( i == length-1 && open == true) {
				list.add(")");
			}
		}

		formula = "";
		for(String str : list) {
			formula += str;
		}

        StringTokenizer st = new StringTokenizer(formula, "-");
        int minus_sum = 0;
        int plus_sum = 0;

        while(st.hasMoreElements()) {
            String temp = st.nextToken();

            if( temp.contains("(")) {
                temp = temp.replace("(", "");
                temp = temp.replace(")", "");

                StringTokenizer plus_token = new StringTokenizer(temp, "+");
                while(plus_token.hasMoreElements()) {
                    minus_sum -= Integer.parseInt(plus_token.nextToken());
                }

            }
            else if ( temp.contains("+")){

                StringTokenizer plus_token = new StringTokenizer(temp, "+");
                while(plus_token.hasMoreElements()) {
                    plus_sum += Integer.parseInt(plus_token.nextToken());
                }

            }
        }

        System.out.println(minus_sum + plus_sum);

	} // End of main
} // End of class
