package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 백준 1012 유기농 배추 - 실버3
 */
public class Organic_Food {

    static int testCase;
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int count;
    static int x, y, line, start;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> resultArr = new ArrayList<>();

        testCase = Integer.parseInt(br.readLine());
        count = 0;

        for (int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            line = Integer.parseInt(st.nextToken());

            arr = new int[x][y];
            check = new boolean[x][y];

            for (int j = 0; j < line; j++){
                StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(stringTokenizer.nextToken());
                int b = Integer.parseInt(stringTokenizer.nextToken());
                arr[a][b] = 1;
            }

            for (int j = 0; j < x; j++){
                for (int k = 0; k < y; k++){
                    if (arr[j][k] == 1 && !check[j][k]){
                        dfs(j,k);
                        count++;
                    }
                }
            }
            resultArr.add(count);
            count = 0;
        }

        for (int x : resultArr){
            System.out.println(x);
        }
    }
    public static void dfs(int dfsx,int dfsy) {
        check[dfsx][dfsy] = true;

        for(int k = 0; k < 4; k++){
            int nextX = dx[k]+dfsx;
            int nextY = dy[k]+dfsy;

            if(nextX >= 0 && nextY >= 0 && nextX < x && nextY < y){
                if (arr[nextX][nextY] == 1 && !check[nextX][nextY]){
                    dfs(nextX,nextY);
                }
            }
        }
    }
}