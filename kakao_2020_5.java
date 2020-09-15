import java.util.Arrays;

public class kakao_2020_5 {
    public static void main(String[] args) {
        String play_time = "02:03:55";
        String adv_time = "00:14:15";
        String[] logs = {"01:20:15-01:45:14",
                "00:40:31-01:00:00",
                "00:25:50-00:48:29",
                "01:30:59-01:53:29",
                "01:37:44-02:02:30"};

        Arrays.sort(logs);

        String[] overlap = new String[logs.length-1];

        for(int i = 0 ; i < logs.length-1; i++){

        }


        for(int i = 0 ; i < logs.length; i++){
            System.out.println(logs[i]);
        }
    }
}
