import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kakao_2020_3 {

    public static void main(String[] args) {
        //언어, 지원분야, 경력, 소울푸드
        String[] info = {"java backend junior pizza 150", "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100",
                "- and - and - and - 150"};

        int[] answer = new int[query.length];
        Arrays.sort(info);
        String[] lang = new String[info.length];
        String[] fb = new String[info.length];
        String[] js = new String[info.length];
        String[] cp = new String[info.length];
        int[] score = new int[info.length];
        int count = 0;
        for (int i = 0; i < info.length; i++) {
            String[] tmp = info[i].split(" ");
            lang[i] = tmp[0];
            fb[i] = tmp[1];
            js[i] = tmp[2];
            cp[i] = tmp[3];
            score[i] = Integer.parseInt(tmp[4]);
        }

        for (int i = 0; i < query.length; i++) {
            String tmp = query[i].replaceAll(" and ", " ");
            String[] changequery = tmp.split(" ");
            int[] pass = new int[info.length];

            for (int j = 0; j < changequery.length; ) {
                if (changequery[j].equals("-")) {
                    for (int k = 0; k < info.length; k++) {
                        pass[k]++;
                    }
                    j++;
                }
                switch (j) {
                    case 0:
                        if (changequery[j].equals("-")) break;
                        for (int k = 0; k < info.length; k++) {
                            if (lang[k].equals(changequery[j]))
                                pass[k]++;
                        }
                        j++;
                        break;
                    case 1:
                        if (changequery[j].equals("-")) break;
                        for (int k = 0; k < info.length; k++) {
                            if (fb[k].equals(changequery[j]))
                                pass[k]++;
                        }
                        j++;
                        break;
                    case 2:
                        if (changequery[j].equals("-")) break;
                        for (int k = 0; k < info.length; k++) {
                            if (js[k].equals(changequery[j]))
                                pass[k]++;
                        }
                        j++;
                        break;
                    case 3:
                        if (changequery[j].equals("-")) break;
                        for (int k = 0; k < info.length; k++) {
                            if (cp[k].equals(changequery[j]))
                                pass[k]++;
                        }
                        j++;
                        break;
                    case 4:
                        if (changequery[j].equals("-")) break;
                        for (int k = 0; k < info.length; k++) {
                            if (score[k] >= Integer.parseInt(changequery[j]))
                                pass[k]++;
                        }
                        j++;
                        break;
                }

                for (int k = 0; k < info.length; k++) {
                    if (pass[k] == 5) {
                        count++;
                    }
                }

            }
            answer[i] = count;
            count = 0;
        }

        for(int i = 0 ; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
