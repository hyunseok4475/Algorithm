package Programmers;

import java.util.Arrays;

public class 모의고사 {

    static public int[] ArrayIncrease(int[] arr){
        int[] newarr = new int[arr.length+1];
        System.arraycopy(arr,0,newarr,0,arr.length);
        return newarr;
    }

    static public int[] solution(int[] answers) {
        int[] result = {0,0,0}; // 각 포기자들의 점수
        int[] answer = {}; // 결과값 저장배열
        int cnt = 0; // 최고점수 판별인원
        int[][] sol = {{1,2,3,4,5,1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}}; // 정답
        int max = -1; // 최고점수

        // 채점
        for(int j = 0 ; j < 3; j++){
            for(int i = 0 ; i < answers.length; i++){
                if(j == 0 || j == 2){
                    if(sol[j][i%10] == answers[i]){
                        result[j]++;
                    }
                }
                else{
                    if(sol[j][i%8] == answers[i]){
                        result[j]++;
                    }
                }
            }
        }

        //최고점수 판별
        for(int i = 0; i < result.length; i++){
            if(max < result[i])
                max = result[i];
        }

        //최고점수 인원 배열에 넣기
        for(int i = 0; i < result.length; i++){
            if(max == result[i]){
                answer = ArrayIncrease(answer);
                answer[cnt++] = i+1;
            }
        }

        //정렬
       Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args){
        int[] answers = {1,2,3,4,5};
        int[] answer = new int[3];
        answer = solution(answers);

        for(int i = 0 ; i < answer.length; i++)
            System.out.println(answer[i]);
    }
}
