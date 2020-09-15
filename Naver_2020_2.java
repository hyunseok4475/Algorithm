import javax.naming.ldap.SortResponseControl;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Naver_2020_2 {
    public static void main(String[] args) {
        int[] ball = {1, 2, 3, 4, 5, 6};
        int[] order = {3, 4, 6, 1, 2, 5};
        StringBuilder out = new StringBuilder("");
        Queue<Integer> stay = new LinkedList<>();
        Deque balls = new ArrayDeque();

        for (int b : ball) {
            balls.add(b);
        }

        for (int j = 0; j < order.length; j++) {
            for(int i = 0 ; i < stay.size(); i++){
                int tmp = stay.poll();
                if (tmp == (int) balls.getFirst()) {
                    out.append(balls.pollFirst().toString() + " ");
                    i = 0;
                }
                if (tmp == (int) balls.getLast()) {
                    out.append(balls.pollLast().toString() + " ");
                    i = 0;
                }
                if(tmp != (int) balls.getFirst() && tmp != (int) balls.getLast()) {
                    stay.add(tmp);
                }
            }

            if (order[j] == (int) balls.getFirst()) {
                out.append(balls.pollFirst().toString() + " ");
            } else if (order[j] == (int) balls.getLast()) {
                out.append(balls.pollLast().toString() + " ");
            } else {
                stay.add(order[j]);
            }
        }



        String[] tmp = out.toString().split(" ");
        int[] answer = new int[tmp.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(tmp[i]);
            System.out.println(answer[i]);
        }


    }
}
