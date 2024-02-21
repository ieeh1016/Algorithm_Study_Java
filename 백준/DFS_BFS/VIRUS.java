package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준 2606 바이러스 - 실버3
 */
public class VIRUS {

    // StringBuffer는 멀티쓰레드 환경에서 동기화를 지원하지만 StringBuilder는 동기화를 지원하지 않음
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;

    static int node, line, start;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        start = 1;
        int result = 0;

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        for (int i = 0; i < line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);

        for (int i = 2; i <= node; i++) {
            if (check[i]) {
                result++;
            }
        }

        System.out.print(result);
    }
    public static void dfs(int start) {
        check[start] = true;

        for (int i = 1; i <= node; i++){
            if (arr[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }
}