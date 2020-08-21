import java.util.Scanner;

public class BaekJoon_11720 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int sum = 0;
        int n = stdIn.nextInt();
        String num = stdIn.next();

        for(int i = 0; i < n; i++){
            int firstNumber = Character.getNumericValue(num.charAt(0));
            sum += firstNumber;
            num = num.substring(1);
        }

        System.out.println(sum);
    }
}
