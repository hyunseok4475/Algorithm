import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int[][]b = new int[a][2];
        for(int i = 0; i < a; i++){
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            b[i][0] = Integer.parseInt(st.nextToken());
            b[i][1] = Integer.parseInt(st.nextToken());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < a; i++){
            bw.write(String.valueOf(b[i][0]+b[i][1])+"\n");
        }
        bw.flush();
        bw.close();
    }
}
