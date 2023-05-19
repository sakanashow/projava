package main.java.projava;

public class CheckFloat {
    //ステータス状態をまとめて保持しておくenum
    enum FloatState {
        START, INT, FRAC_START, FRAC, ZERO, MAINASU
    }

    static boolean check(String data) { // 判定部分
        var state = FloatState.START; // 初期値はスタート
        // 一文字づつ受け取って判定していく
        for(char ch : data.toCharArray()) {
            switch (state) {
                case MAINASU -> {
                    if(ch != '-'){
                        state = FloatState.START;
                    } else {
                        return false;
                    }
                }
                //最初の処理は必ずこれになる
                case START -> {
                    //一文字目が0なら０ステータス、それ以外の数値ならINTステータス、それ以外はFalseで終了。
                    if(ch == '0') {
                        state = FloatState.ZERO;
                    } else if(ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else if(ch == '-') {
                        state = FloatState.MAINASU;
                    } else {
                        return false;
                    }
                }
                //入手文字が０だった時の処理
                case ZERO -> {
                    //０の次に来て良いのは小数点のみ
                    if (ch == '.') {
                        //小数点だった場合は小数点判定用のステータスに遷移
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                }
                //整数だった時、次に来ていいのは数値か小数点
                case INT -> {
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.INT;
                    } else if(ch == '.') {
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                }
                //少数だった時、次に来ていいのは数値のみ、かつその後は小数ステータスから変わらない
                case FRAC_START, FRAC -> {
                    if (ch >= '1' && ch <= '9') {
                        state = FloatState.FRAC;
                    } else {
                        return false;
                    }
                }
            }
        }
        //最終的に以下の３つのステータスのみがTRUE
        return switch (state) {
            case ZERO, INT, FRAC -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        System.out.println(check("-123"));
        System.out.println(check("--123"));
        System.out.println(check("-12-3"));
        //        System.out.println(check(""));
//        System.out.println(check("012"));
//        System.out.println(check(".12"));
//        System.out.println(check("12."));
//        System.out.println(check("1.2.3"));
//        System.out.println(check("1..3"));
//        System.out.println(check("0"));
//        System.out.println(check("12"));
//        System.out.println(check("12.3"));
//        System.out.println(check("0.3"));
//        System.out.println(check("12.30"));
    }
}
