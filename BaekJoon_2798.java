import java.io.*;
import java.util.Arrays;

public class BaekJoon_2798 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] tmpTarget = br.readLine().split(" ");
            int cardNum = Integer.parseInt(tmpTarget[0]);
            int target = Integer.parseInt(tmpTarget[1]);

            String[] tmpCards = br.readLine().split(" ");
            int[] cards = new int[tmpCards.length];
            int max = 0, sum;

            for (int i = 0; i < tmpCards.length; i++) {
                cards[i] = Integer.parseInt(tmpCards[i]);
            }

            Arrays.sort(cards);

            for (int i = 0; i < tmpCards.length - 2; i++) {
                for (int j = i + 1; j < tmpCards.length - 1; j++) {
                    for (int k = j + 1; k < tmpCards.length; k++) {
                        sum = cards[i] + cards[j] + cards[k];
                        if (sum > target) {
                            break;
                        }
                        if (sum <= target && sum > max) {
                            max = sum;
                        }
                    }
                }
            }

            bw.write(String.valueOf(max));
            bw.newLine();
            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
