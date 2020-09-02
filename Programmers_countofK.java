import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//
//        int start;
//        int end;
//        int location;
//        int[] answer = new int[commands.length];
//        List answertmp = new ArrayList<Integer>();
//
//        for (int i = 0; i < commands.length; i++) {
//            start = commands[i][0] - 1;
//            end = commands[i][1];
//            location = commands[i][2] - 1;
//
//            int[] tmp = Arrays.copyOfRange(array, start, end);
//
//            Arrays.sort(tmp);
//
//            answertmp.add(tmp[location]);
//        }
//
//        for (int i = 0; i < commands.length; i++) {
//            answer[i] = (int) answertmp.get(i);
//        }
//
//        return answer;
//    }
//}

public class Programmers_countofK {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution s = new Solution();
//
//        int[] tmp = s.solution(array, commands);

        for (int i = 0; i < commands.length; i++) {
//            System.out.println(tmp[i]);
        }
    }
}
