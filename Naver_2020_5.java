public class Naver_2020_5 {
    public static void main(String[] args) {
        int player = 0;
        int dealer = 0;
        int money = 0;
        int[] card = {12, 7, 11, 6, 2, 12};

        for(int i = 0; i < card.length; i++){
            if(card[i] > 10)
                card[i] = 10;
        }

        for(int i = 0 ; i < card.length; i++){
            if(i % 2 == 0 && player < 17){
                if(card[i] == 1){
                    if(player < 11){
                        player+=10;
                    }
                    else{
                        player+=1;
                    }
                }
                else{
                    player+=card[i];
                }
            }
            else if(dealer < 17){
                if(card[i] == 1){
                    if(dealer < 11){
                        dealer+=10;
                    }
                    else{
                        dealer+=1;
                    }
                }
                else{
                    dealer+=card[i];
                }
            }

            if(player == 21||dealer == 21){
                if(player == 21 && dealer == 21){
                    player = 0;
                    dealer = 0;
                }
                else if(player == 21 && dealer != 21){
                    money+= 2;
                    player = 0;
                    dealer = 0;
                }
                else if(player != 21 && dealer ==21){
                    money-= 2;
                    player = 0;
                    dealer = 0;
                }
            }
            else if(player > 21 || dealer > 21){
                if(player > 21 && dealer < 21){
                    money -= 1;
                    player = 0;
                    dealer = 0;
                }
                else if(player < 21 && dealer > 21){
                    money +=1;
                    player = 0;
                    dealer = 0;
                }
            }
        }

        System.out.println(money);

    }
}
