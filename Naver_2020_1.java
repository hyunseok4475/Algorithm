public class Naver_2020_1 {
    public static void main(String[] args) {
        int[][] boxes = {{1, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}, {2, 2}};
        int[] products = new int[1000001];
        int total = boxes.length;
        int pair = 0;
        int answer = 0;

        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < boxes[i].length; j++) {
                products[boxes[i][j]]++;
                if (products[boxes[i][j]] == 2 ) {
                    pair++;
                    products[boxes[i][j]] = 0;
                }
            }
        }

        if(total != pair){
            answer = total - pair;
        }

        System.out.println(answer);

    }
}
