import java.util.Scanner;

public class BaekJoon_5622 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String word = stdIn.next();
        int tot = 0;
        for (int i = 0; i < word.length(); i++) {
            char C = word.charAt(i);
            if ((C >= 'A' && C < 'S') || (C >= 'T' && C < 'V') || (C >= 'W' && C < 'Y'))
                tot += ((C - 'A') / 3) + 2;
            else
                tot += ((C - 'A') / 3) + 1;
        }

        tot += word.length();

        System.out.println(tot);
    }
}
