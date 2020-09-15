public class Naver_2020_3 {

    static int CNT = 0;

    public static int calc(String num, int cnt){
        int a =  Integer.parseInt(num.substring(0,num.length()/2+1));
        int b = Integer.parseInt(num.substring(num.length()/2+1, num.length()));
        if(a+b < 10){
            cnt++;
            return a+b;
        }
        else{
            cnt++;
            calc(String.valueOf(a+b),cnt);
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 73425;
        int cnt = 0;
        int result = 0;

        String m = String.valueOf(n);
        if(n < 10){
            System.out.println(n);
        }
        for(int i = 0 ; i < m.length(); i++){

        }
    }
}
