package words;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listOfStrings;

        
        checkArgs(args);


        listOfStrings = getListOfStrings(args);


        for (String string : listOfStrings){
            System.out.println(string);
        }
    }
    public static void checkArgs(String[] args){
        if (args.length == 0)
        {
            System.err.print("Invalid parametrs for program. ");
            System.err.println("Program must have one parametr.");
            return;
        }
    }
    public static ArrayList<String> getListOfStrings(String[] args){
        ArrayList<String> list = new ArrayList();
        String currentLine;
        Pattern pattern;
        Matcher matcher;


        while (!(currentLine = (new Scanner(System.in)).nextLine()).equals("")){


            StringTokenizer tokenizer = new StringTokenizer(currentLine);
            ArrayList<String> currentLineArray = new ArrayList();

            while(tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                currentLineArray.add(token);
            }


            boolean flag = false;
            for (int i = 0; i < currentLineArray.size(); i++) {
                for (String keyword: args){
                    System.out.println(keyword);
                    pattern = Pattern.compile(keyword);
                    matcher = pattern.matcher(currentLineArray.get(i));
                    if (matcher.matches()){
                        flag = true;
                    }
                }
            }


            if (flag){
                list.add(currentLine);
            }
        }
        return list;
    }
}
