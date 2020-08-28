import java.io.*;
import java.util.Arrays;

public class BaekJoon_1427 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String nums = br.readLine();
            int[] numsArr = new int[nums.length()];
            for(int i = 0; i < numsArr.length; i++){
                numsArr[i] = nums.charAt(i);
            }

            Arrays.sort(numsArr);

            for(int i = numsArr.length - 1; i >= 0; i--){
                bw.write(numsArr[i]);
            }

            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
