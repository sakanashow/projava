package main.java.projava;

public class ForEachArraySample {
    public static void main(String[] args) {
        var nums = new int[]{2,3,5,7};
        var names = new String[]{"yusuke", "kis", "sugiyama"};

        for (int num : nums) {
            System.out.println(num);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
