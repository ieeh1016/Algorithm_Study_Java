package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
 * 백준 11725 트리의 부모 찾기 - 실버2
 */
public class Tree_Parent {

    static int node;

    static ArrayList<Integer>[] adjArray;
    static boolean[] check;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());

        adjArray = new ArrayList[node + 1];
        check = new boolean[node + 1];
        parent = new int[node + 1];

        for (int i = 1; i <= node; i++) {
            adjArray[i] = new ArrayList<>();
        }

        for (int i = 0; i < node - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adjArray[a].add(b);
            adjArray[b].add(a);
        }

        dfs(1);

        for (int i = 2; i < parent.length; i++) System.out.println(parent[i]);
    }

    public static void dfs(int start) {
        check[start] = true;

        for (int w : adjArray[start]) {
            if (!check[w]) {
                parent[w] = start;
                dfs(w);
            }
        }

    }
}