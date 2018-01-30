package task579;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] < 0){
                count1 = count1 + arr[i];
                list1.add(i + 1);
            }
            if(arr[i] > 0){
                count2 = count2 + arr[i];
                list2.add(i + 1);
            }
        }
        count1 = Math.abs(count1);

        PrintWriter out = new PrintWriter(System.out);

        if(count1 >= count2){
            out.print(list1.size());
            out.print("\n");
            for(int i : list1){
                out.print(i + " ");
            }
        }
        if(count2 > count1){
            out.print(list2.size());
            out.print("\n");
            for(int i : list2){
                out.print(i + " ");
            }
        }
        out.flush();
    }
}
