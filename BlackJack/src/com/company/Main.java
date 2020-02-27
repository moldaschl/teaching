package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Card herzAss = new Card(1, 2);
        Card treffDrei = new Card(1, 4);
        System.out.println(herzAss.toString());
        System.out.println(treffDrei.toString());


        System.out.println(("BLACK JACK!"));

        int sum = 0;

        do {
            sum += pullCard();
            System.out.println(sum);
        } while(sum<17);

        if(sum>21) {
            System.out.println(sum + " Punkte. Die Bank hat überzogen");
        } else if(sum == 21) {
            System.out.println(sum + " Punkte. Die Bank gewinnt auf jeden Fall, außer du hast auch BlackJack");
        } else {
            System.out.println((sum + " Punkte. Die Bank hat nicht überzogen und kann noch gewinnen"));
        }
    }

    public static int pullCard() {
        Random rnd = new Random();
        int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
        int rndIndex = rnd.nextInt(values.length);
        return values[rndIndex];
    }
}
