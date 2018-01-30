package task278;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) throws IOException{
        new Main().run();
    }
    public void run() throws IOException{
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        solve(sc, out);
    }

    void  solve(Scanner sc, PrintWriter out){

        String s = sc.next();
        String t = sc.next();

        int sIndex = 0;

        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
                if(sIndex == s.length()){
                    out.println("YES");
                    out.flush();
                    return ;
                }
            }
        }
        out.println("NO");
        out.flush();
    }
}
