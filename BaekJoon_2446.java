import java.util.Scanner;

public class BaekJoon_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (num - i) * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                System.out.print(" ");
            }

            for (int k = i * 2 + 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
