import java.io.*;

public class BaekJoon_11726 {

    static int[] d = new int[1001];

    private static int Block(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (d[n] != 0) return d[n];
        return d[n] = (Block(n - 1) + Block(n - 2))% 10007;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(Block(n)));
        bw.flush();
        bw.close();
    }
}
