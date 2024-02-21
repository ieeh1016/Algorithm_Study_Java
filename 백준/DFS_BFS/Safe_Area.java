package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
/*
 * 백준 2468 안전 영역 - 실버1
 */
public class Safe_Area {

    static int node, maxHeight, count;

    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        node = Integer.parseInt(br.readLine());

        arr = new int[node][node];
        check = new boolean[node][node];

        maxHeight = 0;

        for (int i = 0; i < node; i++) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < node; j++) {
                if (Integer.parseInt(strArr[j]) >= maxHeight) {
                    maxHeight = Integer.parseInt(strArr[j]);
                }
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }


        for (int i = 1; i <= maxHeight; i++) {
            for (int j = 0; j < node; j++) {
                for (int k = 0; k < node; k++) {
                    if (arr[j][k] >= i && !check[j][k]) {
                        dfs(j, k, i);
                        count++;
                    }
                }
            }
            arrayList.add(count);
            check = new boolean[node][node];
            count = 0;
        }

        arrayList.sort(Collections.reverseOrder());

        System.out.println(arrayList.get(0));
    }

    public static void dfs(int x, int y, int rainVolume) {
        check[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = dx[i] + x;
            int nextY = dy[i] + y;

            if (nextX >= 0 && nextY >= 0 && nextX < node && nextY < node) {
                if (arr[nextX][nextY] >= rainVolume && !check[nextX][nextY]) {
                    dfs(nextX, nextY, rainVolume);
                }
            }
        }
    }
}