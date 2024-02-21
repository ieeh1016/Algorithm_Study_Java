package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준 11724 연결 요소의 개수 - 실버2
 */
public class Connected_Component {

    static int node, line, count, start;
    static int[][] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        count = 0;

        for (int i = 0; i < line; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        for (int j = 1; j <= node; j++){
            if (!check[j]){
                dfs(j);
                count++;
            }
        }
        System.out.println(count);
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