import java.util.Scanner;

public class BaekJoon_4344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        float avg[] = new float[num];
        int total = 0;
        int score = 0;
        int people = 0;
        float count = 0;

        for(int i = 0; i < num; i++){
            count = 0;
            total = 0;
            people = sc.nextInt();
            int student[] = new int [people];
            for(int j = 0; j < people; j++){
                score = sc.nextInt();
                student[j] = score;
                total += score;
            }

            avg[i] = total / people;

            for(int j = 0; j < people; j++){
                if(student[j] > avg[i]){
                    count++;
                }
            }
            avg[i] = count / people * 100;
        }

        for(int i = 0; i < num; i++){
            System.out.printf("%.3f",avg[i]);
            System.out.println("%");
        }
    }
}
