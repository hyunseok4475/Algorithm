import java.io.*;

public class BaekJoon_2748 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] test_case = new int[size];
        long[] get_one = new long[41];
        long[] get_zero = new long[41];

        get_zero[0] = 1;
        get_zero[2] = 1;
        get_one[1] = 1;
        get_one[2] = 1;

        for (int i = 3; i < 41; i++) {
            get_one[i] = get_one[i - 1] + get_one[i - 2];
            get_zero[i] = get_zero[i - 1] + get_zero[i - 2];
        }

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            test_case[i] = num;
        }

        for (int i = 0; i < size; i++) {
            bw.write(get_zero[test_case[i]] + " " + get_one[test_case[i]]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
