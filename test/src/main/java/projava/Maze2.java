package projava;;
//　練習版
import  java.io.IOException;
public class Maze2 {
    public static void main(String[] args) throws IOException{
        record Position(int x , int y){}
        int[][] map = {
                {1,1,1,1,1,1},
                {1,0,1,0,0,1},
                {1,0,0,0,1,1},
                {1,0,1,0,0,1},
                {1,1,1,1,1,1}
        };
        var current = new Position(1,1);
        var goal = new Position(4,3);
        for(;;){
            //maze open
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    if (x == current.x() && y == current.y()){
                        System.out.print("o");
                    } else if(map[y][x] == 1){
                        System.out.print("*");
                    } else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            //goal
            if(current.equals(goal)){
                System.out.println("GOAL!!");
                break;
            }
            //key input
            int ch = System.in.read();
            // get push key
            var next = switch (ch) {
                case 'a' -> new Position(current.x() - 1, current.y());
                case 'w' -> new Position(current.x(), current.y() - 1);
                case 's' -> new Position(current.x() + 1, current.y());
                case 'z' -> new Position(current.x(), current.y() + 1);
                default -> current;
            };
            // go
            if(map[next.y()][next.x()] == 0){
                current = next;
            }
            // enter out
            System.in.read();
        }
    }
}
