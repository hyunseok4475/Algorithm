import java.io.*;
import java.util.Arrays;

class Point implements Comparable<Point>{

    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.y > o.y){
            return 1;
        }
        else if(this.y == o.y){
            if(this.x > o.x){
                return 1;
            }
            else return -1;
        }
        return -1;
    }
}

public class BaekJoon_11651 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());
            Point[] points = new Point[num];

            String[] get;
            for (int i = 0; i < num; i++) {
                get = br.readLine().split(" ");
                points[i] = new Point(
                        Integer.parseInt(String.valueOf(get[0])),
                        Integer.parseInt(String.valueOf(get[1])));
            }

            Arrays.sort(points);

            for (int i = 0; i < num; i++) {
                bw.write(points[i].x + " " + points[i].y);
                bw.newLine();
            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
