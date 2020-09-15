import java.util.*;


public class kakao_2020_2 {

    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};


        return answer;
    }

    public static void main(String[] args) {

        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};

        ArrayList<String> comb = new ArrayList<>();
        List<String> order = new ArrayList<>();
        List<String> record = new ArrayList<>();
        for(int i = 0 ; i < course.length; i++){
            for(int j = 0 ; j < orders.length; j++){

                for(int k = 0; k < orders[j].length(); k++){
                    order.add(Character.toString(orders[j].charAt(k)));
                }
                reculsion(order, comb, 0, orders[j].length(), course[i], record);
            }
        }

        HashSet<String> arr = new HashSet<String>(record);
        int[] cnt = new int[arr.size()];

        Iterator it = arr.iterator();
        while(it.hasNext()){
            for(int i = 0 ; i < record.size(); i++){
                if(it.next().toString().equals(record.get(i)));
            }
        }



    }

    private static void reculsion(List<String> arr, List<String> result, int index, int n, int r,List<String> record) {

        if (r == 0) {
            record.add(result.toString());
            return;
        }

        for (int i = index; i < n; i++) {

            result.add(arr.get(i));
            reculsion(arr, result, i + 1, n, r - 1, record);
            result.remove(result.size() - 1);
        }
    }
}
