import java.io.*;

public class BaekJoon_7568 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int people = Integer.parseInt(br.readLine());
            int[] height = new int[people];
            int[] weight = new int[people];
            int[] score = new int[people];
            String[] tmp;
            for (int i = 0; i < people; i++) {
                tmp = br.readLine().split(" ");
                weight[i] = Integer.parseInt(tmp[0]);
                height[i] = Integer.parseInt(tmp[1]);
            }

            for (int i = 0; i < people - 1; i++) {
                for (int j = i + 1; j < people; j++) {
                    if(weight[i] > weight[j] && height[i] > height[j]) score[j]++;
                    if(weight[i] < weight[j] && height[i] < height[j]) score[i]++;
                }
            }

            for(int i = 0; i < people; i++){
                score[i]++;
                bw.write(String.valueOf(score[i])+" ");
            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
