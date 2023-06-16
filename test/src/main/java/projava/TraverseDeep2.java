package main.java.projava;

import java.util.ArrayDeque;

public class TraverseDeep2 {
    public static void main(String[] args) {
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1},
                {1, 0, 1, 0, 0, 2, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        traverse(map, 1, 1);
        char[] ch = {'.', '*', 'G', 'o'};
        for (int[] row : map) {
            for (int cell : row) {
                System.out.print(ch[cell]);
            }
            System.out.println();
        }
    }

    static boolean traverse(int[][] map, int curX, int curY) {
        record Position(int x, int y) {
        }
        var stack = new ArrayDeque<Position>();
        stack.push(new Position(curX, curY));
        for (Position p; (p = stack.pollFirst()) != null; ) {
            switch (map[p.y()][p.x()]) {
                case 0:
                    break; //通路なので続きの処理
                case 2:
                    return true; //ゴールなので終了
                default:
                    continue; //通れないので他のマスの処理
            }

            map[p.y()][p.x()] = 3;
            stack.push(new Position(p.x() + 1, p.y()));
            stack.push(new Position(p.x() - 1, p.y()));
            stack.push(new Position(p.x(), p.y() + 1));
            stack.push(new Position(p.x(), p.y() - 1));
        }
        return false;
    }
}