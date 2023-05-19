package main.java.projava;
import java.util.List;
import java.util.ArrayList;
public class StreamSample3 {
    public static void main(String[] args) {
        var l = List.of("apple", "banana", "grape");
        var l2 = new ArrayList<String>();
        var count = 0;

        for (String s : l) {
            if(s.length() == 5){
                //System.out.println(s);
                l2.add(s);
            }
        }
        for (String s1 : l2) {
            //System.out.println(s1);
            if(s1.contains("p")){
                count++;
            }

        }
        System.out.println(count);
        System.out.println(l2);
    }
}

