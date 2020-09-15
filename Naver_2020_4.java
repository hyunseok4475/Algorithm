import java.util.LinkedList;
import java.util.Queue;

public class Naver_2020_4 {

    public static void main(String[] args) {

        int answer = 0;
        int[][] maze = {{0, 1, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 1, 0}};

        int N = maze[0].length;
        int M = maze.length;
        int state = 0;

        Queue<Point> q = new LinkedList();
        q.add(new Point(0, 0));
        while (!q.isEmpty()) {
            int nx = q.peek().x;
            int ny = q.peek().y;

            //0 down 1 up 2 left 3 right
            switch (state) {
                case 0:
                    if (ny + 1 == M || maze[nx][ny + 1] == 1) {
                        state = 3;
                        q.add(new Point(nx + 1, ny));
                    } else {
                        q.add(new Point(nx, ny + 1));
                    }
                    break;
                case 1:
                    if (ny - 1 == -1 || maze[nx][ny - 1] == 1) {
                        state = 2;
                        q.add(new Point(nx - 1, ny));
                    } else {
                        q.add(new Point(nx, ny - 1));
                    }
                    break;
                case 2:
                    if(nx -1 == -1 || maze[nx -1][ny] == 1){
                        state = 0;

                    }
                    break;
                case 3:
                    break;
            }
        }

        System.out.println(maze[N - 1][M - 1]);
    }
}
