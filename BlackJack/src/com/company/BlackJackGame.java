package com.company;

import java.util.Random;

/**
 * @author markus.moldaschl
 * @since 25.02.20
 */
public class BlackJackGame {

    private Card[] packet;
    private int cardsInGame;
    private static final int MAX_CARDS = 52;

    public BlackJackGame() {
        packet = new Card[MAX_CARDS];
        int counter = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                packet[counter] = new Card(i, j);
            }
        }
    }

    public Card[] getPacket() {
        return packet;
    }

    public int getCardsInGame() {
        return cardsInGame;
    }

    public void mix() {
        Random rnd = new Random();
        Card tmp;
        for (int i = MAX_CARDS-1; i >= 0; i--) {
            int pos = rnd.nextInt(MAX_CARDS);
            if ( pos != i ) {
                tmp = packet[pos];
                packet[pos] = packet[i];
                packet[i] = tmp;
            }
        }
        cardsInGame = MAX_CARDS;
    }

    public Card giveCard() {
        if ( cardsInGame == 0 ) {
            mix();
        }
        cardsInGame--;
        return packet[cardsInGame];
    }
    
}
