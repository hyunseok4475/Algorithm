import java.io.*;
import java.util.Arrays;

public class BaekJoon_5052 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int t = Integer.parseInt(br.readLine());
            String[] results = new String[t];
            for (int times = 0; times < t; times++) {
                int n = Integer.parseInt(br.readLine());
                String[] numbersBook = new String[n];
                boolean list = true;

                for (int i = 0; i < numbersBook.length; i++) {
                    numbersBook[i] = br.readLine();
                }

                Arrays.sort(numbersBook);

                for (int i = 0; i < numbersBook.length - 1; i++) {
                    if(numbersBook[i+1].startsWith(numbersBook[i])){
                        list = false;
                        break;
                    }
                }

                if (list)
                    results[times] = "YES";
                else
                    results[times] = "NO";
            }

            for (String result : results) {
                bw.write(result);
                bw.newLine();
            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
