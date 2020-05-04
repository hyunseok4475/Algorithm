import java.util.Scanner;

public class BaekJoon_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int person[] = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++){
            person[i] = sc.nextInt();
            if(person[i] < 40) person[i] = 40;
            total += person[i];
        }

        System.out.println(total/5);
    }
}
