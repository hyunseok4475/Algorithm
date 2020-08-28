import java.io.*;

public class BaekJoon_11650 {

    static void swap(int[][] a, int i, int j) {
        int tmp = i;
        a[i][0] = a[j][0];
        a[i][1] = a[j][1];
        a[j][0] = a[tmp][0];
        a[j][1] = a[tmp][1];
    }

    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());
            String get;
            int[][] a = new int[num][2];
            for (int i = 0; i < num; i++) {
                get = br.readLine();
                a[i][0] = get.charAt(0);
                a[i][1] = get.charAt(2);
            }

            int[][] tempArr = new int[num][2];

            for(int i =0 ; i <num; i++){

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
