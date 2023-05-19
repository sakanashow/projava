package main.java.projava;

import java.util.List;
public class ForEachListSample {
    public static void main(String[] args) {
        var strs = List.of("apple", "banana", "grape");
        var names = List.of("yusuke", "kis", "sugiyama");

        //拡張for
        for (String str : strs) {
            System.out.println(str);
        }
        /* practice
        for (int i = 0; i < names.size(); i++) {
            var name = names.get(i);
            System.out.println(name);
        }
        for (String name : names) {
            System.out.println(name);

        }
        */

    }
}
