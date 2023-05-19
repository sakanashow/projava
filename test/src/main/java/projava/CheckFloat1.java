package main.java.projava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFloat1 {
    //static Pattern pat = Pattern.compile("(0|[1-9][0-9]*)(\\.[0-9]+)?");
    static boolean check(String data) {
//        Matcher mat = pat.matcher(data);
//        return mat.matches();
        return data.matches ("(0|[1-9][0-9]*)(\\.[0-9]+)?");
    }

    public static void main(String[] args) {

        System.out.println(check(""));
        System.out.println(check("00.12"));
        System.out.println(check(".12"));
        System.out.println(check("12."));
        System.out.println(check("1.2.3"));
        System.out.println(check("1..3"));
        System.out.println(check("0"));
        System.out.println(check("12"));
        System.out.println(check("12.3"));
        System.out.println(check("0.3"));
        System.out.println(check("12.30"));
    }
}
