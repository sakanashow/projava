package main.java.projava;

import java.util.List;

public class StreamSample2 {
    public static void main(String[] args) {
        var data = List.of("yamamoto", "kis", "sugiyama");

        //var result = (int) data.stream().filter(s -> s.length() >= 5).count();
        var result = 0;
        for (String s : data) {
            if(s.length() >= 5){
                result++;
            }
        }
        System.out.println(result);
    }
}
