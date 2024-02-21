package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 백준 2667 단지번호 붙이기 - 실버1
 */
public class Danji_Number {

    // StringBuffer는 멀티쓰레드 환경에서 동기화를 지원하지만 StringBuilder는 동기화를 지원하지 않음
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int count;

    static int node, start;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> resultArr = new ArrayList<>();
        node = Integer.parseInt(br.readLine());
        start = 1;
        int totalCount = 0;
        count = 1;

        arr = new int[node+1][node+1];
        check = new boolean[node+1][node+1];

        for (int i = 1; i <= node; i++) {
            String[] strings = br.readLine().split("");

            for(int j = 1; j <= node; j++){
                arr[i][j] = Integer.parseInt(strings[j-1]);
            }
        }

        for (int i = 1; i <= node; i++){
            for (int j = 1; j <= node; j++){
                if (arr[i][j] == 1 && !check[i][j]){
                    dfs(i,j);
                    resultArr.add(count);
                    count = 1;
                }
            }
        }
        Collections.sort(resultArr);
        System.out.println(resultArr.size());
        for(int x : resultArr){
            System.out.println(x);
        }


    }
    public static void dfs(int x,int y) {
        check[x][y] = true;

        for (int i = 0; i < 4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX >= 1 && nextY >= 1 && nextX <= node && nextY <= node){
                if (arr[nextX][nextY] == 1 && !check[nextX][nextY]){
                    count++;
                    dfs(nextX,nextY);
                }
            }
        }

    }
}