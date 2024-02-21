package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준 4963 섬의 개수 - 실버2
 */
public class Island {

    static int node, count, w, h;

    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {-1, -1, -1, 0,0,1,1,1};
    static int[] dy = {1, 0, -1, 1,-1,-1,0,1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            count = 0;

            if (w == 0 && h == 0) break;

            arr = new int[w+1][h+1];
            check = new boolean[w+1][h+1];


            for (int i = 1; i <= h; i++){
                String[] intArr = br.readLine().split(" ");
                for (int l = 1; l <= w; l++) {
                    arr[l][i] = Integer.parseInt(intArr[l-1]);
                }
            }

            for (int j = 1; j <= w; j++){
                for (int k = 1; k <= h; k++){
                    if (arr[j][k] == 1 && !check[j][k]){
                        dfs(j,k);
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }

    }
    public static void dfs(int x, int y) {
        check[x][y] = true;

        for (int i = 0; i < 8; i++){
            int nextX = dx[i]+x;
            int nextY = dy[i]+y;

            if (nextX >= 1 && nextY >= 1 && nextX <= w && nextY <= h){
                if (arr[nextX][nextY] == 1 && !check[nextX][nextY]){
                    dfs(nextX,nextY);
                }
            }
        }
    }
}