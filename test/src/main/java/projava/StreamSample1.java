package main.java.projava;

import java.util.List;
import java.util.ArrayList;

public class StreamSample1 {
    public static void main(String[] args) {
        var datas = List.of("yamamoto", "kis", "sugiyama");

        //var result = datas.stream().filter(data -> data.length() >= 5).collect(Collectors.toCollection(ArrayList::new));
        var result = new ArrayList<String>();
        for (String data : datas) {
            if(data.length() >= 5){
                result.add(data);
            }
        }
        System.out.println(datas);
        System.out.println(result);
        int twice = MethodSample.twice(89);
        System.out.println(twice);
    }
}
