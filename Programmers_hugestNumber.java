import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<Integer> sd = new ArrayList<>();
        List<Integer> td = new ArrayList<>();
        List<Integer> hd = new ArrayList<>();
        List<Integer> tsd = new ArrayList<>();

        for (int i : numbers) {
            if (i >= 0 && i < 10) sd.add(i);
            else if (i >= 10 && i < 100) td.add(i);
            else if (i >= 100 && i < 1000) hd.add(i);
            else if (i >= 1000) tsd.add(i);
        }

        Collections.sort(sd);
        Collections.sort(td);
        Collections.sort(hd);
        Collections.sort(tsd);

        return answer;
    }
}

public class Programmers_hugestNumber {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        Solution s = new Solution();
        System.out.println(s.solution(numbers));
    }

}
