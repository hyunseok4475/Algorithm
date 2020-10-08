import java.util.Scanner;

public class BaekJoon_8958 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt();
        int[] score = new int[num];
        for(int i = 0; i < num; i++){
            String quiz = stdIn.next();
            int point = 0;
            for(int j = 0; j< quiz.length(); j++){
                if(quiz.charAt(j) == 'O'){
                    score[i]+= ++point;
                }
                else if(quiz.charAt(j) == 'X')
                    point = 0;
            }
        }

        for(int i = 0; i < num; i++){
            System.out.println(score[i]);
        }


    }
}
