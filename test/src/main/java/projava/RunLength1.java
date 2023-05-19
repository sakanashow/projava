package main.java.projava;

public class RunLength1 {
    public static void main(String[] args) {
        var data = "aa0bcd1efg1gg0abc";
        //var lower = true;
        var size = 0;
        var buf = new StringBuilder();

        for (char ch : data.toCharArray()) {
            if(ch == '1'){
                size = 0; //low
            } else if(ch == '0'){
                size = 1; //lar
            } else {
                //0or1であればtrue,falseを使っても同じ
                if(size == 0){
                    buf.append(Character.toLowerCase(ch));
                } else if(size == 1){
                    buf.append(Character.toUpperCase(ch));
                }
            }
            }
        var result = buf.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
//
//            switch (ch) {
//                    case '0' -> lower = false; // large
//                    case '1' -> lower = true; //small
//default -> {
//        if(lower) {
//        buf.append(Character.toLowerCase(ch));
//        } else {
//        buf.append(Character.toUpperCase(ch));
//        }
//        }
//        }