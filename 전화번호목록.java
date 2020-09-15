import java.util.Arrays;

public class 전화번호목록 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        전화번호목록 a = new 전화번호목록();
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = a.solution(phone_book);
        System.out.println(result);
    }
}
