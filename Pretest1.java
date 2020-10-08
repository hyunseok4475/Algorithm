import java.awt.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Pretest1 {

    static int[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n;
    

    public static void bfs(int x, int y) {
        Queue<Point> points = new LinkedList<>();

        while (!points.isEmpty()) {
            Point locate = points.poll();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(0 <= nx && nx < n && 0 <= ny && ny < n){
                    if(map[nx][ny] == 1)
                        map[nx][ny] = 2;
                }

            }
            map[locate.x][locate.y] = 2;

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        //지도 초기화
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j);
            }
        }
    }
}
