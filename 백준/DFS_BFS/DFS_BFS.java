package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 백준 1260 DFS와 BFS - 실버3
 */
public class DFS_BFS {

    // StringBuffer는 멀티쓰레드 환경에서 동기화를 지원하지만 StringBuilder는 동기화를 지원하지 않음
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;

    static int node, line, start;


    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());


        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        for (int i = 0; i < line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        System.out.println(sb);
        check = new boolean[node+1];

        sb = new StringBuilder();

        bfs(start);
        System.out.println(sb);
    }
    public static void dfs(int start) {
        check[start] = true;
        sb.append(start + " ");

        for (int i = 1; i <= node; i++){
            if (arr[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }
    public static void bfs(int start) {
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()){

            start = q.poll();
            sb.append(start + " ");

            for (int i = 1; i <= node; i++){
                if (arr[start][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }

        }
    }
}