package Programmers;

import java.util.*;

public class 완주하지못한선수 {
    static public String solution(String[] participant, String[] completion) {
        String answer = "";

        ArrayList<String> part = new ArrayList<>();
        ArrayList<String> com = new ArrayList<>();

        for(String p:participant){
            part.add(p);
        }
        for(String c:completion){
            com.add(c);
        }

        Collections.sort(part);
        Collections.sort(com);

        for(int i = 0; i <com.size(); i++){
                if(!part.get(i).equals(com.get(i))){
                    answer = part.get(i);
                    return answer;
            }
        }
        answer = part.get(part.size()-1);
        return answer;
    }

    public static void main(String[] args){
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String answer = solution(participant,completion);

        System.out.print(answer);
    }
}
