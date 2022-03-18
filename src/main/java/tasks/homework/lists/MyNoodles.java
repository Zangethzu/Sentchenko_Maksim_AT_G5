package main.java.tasks.homework.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyNoodles {

    private static final String DASH = "-";
    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();
        noodles.addAll(Arrays.asList("Hakka", "Ramen", "Hibachi", "Schezwan"));

        String str = "";
        for(String noodle : noodles){

            if(str.equals("")){
                str = noodle;
            }else{
                str = String.join(DASH,str,noodle);
            }
        }
        System.out.println(str);

//        for(String noodle : noodles){
//            noodle.replace("a","o");
//        }

        for (int noodle = 0; noodle < noodles.size();noodle++)
            System.out.println(noodles.get(noodle).replace("a","o"));
    }
}
