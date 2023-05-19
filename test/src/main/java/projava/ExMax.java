package main.java.projava;

import java.util.Arrays;

public class ExMax {
    public static void main(String[] args) {
        var data = new int[]{3,6,9,4,2,1,5};
        //make list which how many
        var result = new int[data.length];

        for (int i = 0; i < data.length; i++){
            //データ数の最大値を超えないようにマイナス１
            if(i < data.length - 1){
                //そのデータとデータの一個プラスしたもの
                result[i] = Math.max(data[i], data[i + 1]);
            } else {
                //最後の数値はそのまま入れる
                result[i] = data[i];
            }
        }
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(result));
    }
}
