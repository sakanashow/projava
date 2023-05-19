package main.java.projava;

public class RunLength2 {
    public static void main(String[] args) {
        var data = "ab0c1ba2bc9cd1";
        var builder = new StringBuilder();
        var pref = '0'; //ここを数値の0にしておくと型の違いによるエラーとなった

        for(var ch : data.toCharArray()) {
            if(ch >= '0' && ch <= '9') {
                if(pref == '0') {
                    continue;
                }
                for(int i = 0; i < ch - '0' + 1; i++){
                    builder.append(pref);
                }
            } else {
                pref = ch;
                builder.append(ch);
            }
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
