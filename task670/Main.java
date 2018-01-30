package task670;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int iMax = 40000;

        ArrayList<Integer> list = new ArrayList();

        for (int i = 1; i < iMax; i++) {

            if(!(containRepeatDigit(i))){
                list.add(i);
            }

        }

        PrintWriter out = new PrintWriter(System.out);

        out.print(list.get(n - 1));
        out.flush();
    }
    public static boolean containRepeatDigit(int incom) {

        String strNumberIncom = Integer.toString(incom);

        HashSet<Character> hSet = new HashSet<>();

        for (int i = 0; i < strNumberIncom.length(); i++) {
            hSet.add(strNumberIncom.charAt(i));
        }

        if (hSet.size() == strNumberIncom.length()) {
            return false;
        } else {
            return true;
        }
    }
}
