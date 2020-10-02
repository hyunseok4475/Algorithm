import java.io.*;

public class BaekJoon_9461 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] test_case = new int[101];
        long[] results = new long[101];

        results[1] = 1;
        results[2] = 1;
        results[3] = 1;

        for(int i = 4; i < 101; i++){
            results[i] = results[i-2] + results[i-3];
        }

        for(int i = 0 ; i < n; i++){
            int get = Integer.parseInt(br.readLine());
            test_case[i] = get;
        }

        for(int i = 0; i < n; i++){
            bw.write(String.valueOf(results[test_case[i]]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
