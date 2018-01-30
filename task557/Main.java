package task557;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();

        ArrayList list = new ArrayList();

        for (int i = 0; i < m; i++) {
            int [][] arr = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            list.add(arr);
        }

        int[][] mA = (int[][]) list.get(0);

        for (int r = 0; r < list.size() - 1; r++) {

            int[][] mB = (int[][]) list.get(r + 1);

            int m1 = mA.length;
            int n1 = mB[0].length;
            int o = mB.length;
            int[][] res = new int[m1][n1];


            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    for (int k = 0; k < o; k++) {
                        res[i][j] += mA[i][k] * mB[k][j];
                    }
                    if(res[i][j] >= p){
                        res[i][j] = res[i][j]%p;
                    }
                }
            }
            mA = res;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(mA[a - 1][b - 1]);
        out.flush();
    }
}
