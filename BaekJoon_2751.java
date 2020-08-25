import java.io.*;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.*;

public class BaekJoon_2751 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int num = Integer.parseInt(br.readLine());
            List<Integer> nums = new ArrayList<>();

            for (int i = 0; i < num; i++) {
                nums.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(nums);

            for (int i = 0; i < num; i++) {
                bw.write(String.valueOf(nums.get(i)));
                bw.newLine();
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
