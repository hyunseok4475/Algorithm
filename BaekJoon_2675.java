import java.util.Scanner;

public class BaekJoon_2675 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int testCase = stdIn.nextInt();

        for(int i = 0; i < testCase; i++){
            int num = stdIn.nextInt();
            String word = stdIn.next();

            for(int j = 0; j < word.length(); j++){
                for(int k = 0; k < num; k++){
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
