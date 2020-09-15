public class N으로표현 {
    static int answer = 0;
    public int solution(int N, int number) {

        calc(N, number, answer, N);
        if (answer > 8){
            return -1;
        }
        return answer;
    }

    public static void calc(int N, int number, int count, int accn) {
        if (count > 8) {
            return ;
        }
        if (number == accn) {
            return;
        }
        int nn = N;
        while (accn < number && count < 8) {
            calc(N, number, ++count, accn + nn);
            calc(N, number, ++count, accn - nn);
            calc(N, number, ++count, accn * nn);
            calc(N, number, ++count, accn / nn);
            nn = N * 10 + N;
        }
    }


    public static void main(String[] args) {
        N으로표현 test = new N으로표현();
        System.out.println(test.solution(5, 12));
    }
}
