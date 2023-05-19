package main.java.projava;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //var data = "abcccbaabcc";
        var data = "abcde";
        char prev = 0;
        var builder = new StringBuilder();

        //書籍記載箇所
//        for(char ch : data.toCharArray()){
//            if(ch == prev){
//                continue;
//            }
//            builder.append(ch);
//            prev = ch;
//        }
//        var result = builder.toString();

        //書籍初期記載
//        for (int i = 0; i < data.length(); i++) {
//            char ch = data.charAt(i);
//            if(i > 0 && ch == data.charAt(i - 1)){
//                char t = data.charAt(i - 1);
//                continue;
//            }
//            builder.append(ch);
//
//        }
//        var result = builder.toString();

        //練習１
        //初期値に２を足すことで偶数のみをピックアップしている
        for (int i = 0; i < data.length(); i += 2) {
            if (i + 1 < data.length()) {
                //最初に奇数番目を追加している（入れ替えている）
                builder.append(data.charAt(i + 1));
            }
            //ここで偶数番目を奇数番目の後に追加することで偶数と奇数を入れ替え
            builder.append(data.charAt(i));
        }
        var result = builder.toString();

        System.out.println(data);
        System.out.println(result);
    }
}
