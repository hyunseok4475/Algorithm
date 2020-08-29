import java.io.*;

public class BaekJoon_2108 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {

            int get;
            double sum = 0;
            double avg = 0;
            int resultAvg = 0;
            int mid = 0;
            int fre = 0;
            int start = 0, end = 0;
            boolean secondflag = false;
            int[] nums = new int[8001];
            int max = -4001;
            int min = 4001;
            int num = Integer.parseInt(br.readLine());

            for (int i = 0; i < num; i++) {
                get = Integer.parseInt(br.readLine());
                sum += get;
                nums[get + 4000]++;
                if (get > max) max = get;
                if (get < min) min = get;
            }
            //간격
            int diff = max - min;
            //평균반올림
            avg = Math.round(sum / num);
            resultAvg = (int) avg;

            //중앙값
            int cnt = 0;
            int tmp = 0;
            for (int i = 0; i < nums.length; i++) {
                cnt += nums[i];
                if (num % 2 == 0) {
                    if (cnt >= num / 2)
                        tmp = i - 4000;
                    if (cnt >= num / 2 + 1) {
                        mid = (tmp + i - 4000) / 2;
                        break;
                    }
                } else {
                    if (num == 1) {
                        mid = (int) sum;
                        break;
                    }

                    if (cnt >= num / 2 + 1) {
                        mid = i - 4000;
                        break;
                    }
                }
            }

            if (num != 1) {
                max = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        if (nums[i] > max) max = nums[i];
                    }
                }
            }

            for (int i = 0; i < nums.length; i++) {

                if (num == 1) {
                    fre = (int) sum;
                    break;
                }

                if (nums[i] == max) {
                    if (secondflag) {
                        fre = i - 4000;
                        break;
                    } else {
                        secondflag = true;
                        fre = i - 4000;
                    }
                }
            }


            bw.write(String.valueOf(resultAvg));
            bw.newLine();

            bw.write(String.valueOf(mid));
            bw.newLine();

            bw.write(String.valueOf(fre));
            bw.newLine();

            bw.write(String.valueOf(diff));
            bw.newLine();


            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
