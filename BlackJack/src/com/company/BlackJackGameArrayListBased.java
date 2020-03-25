package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author markus.moldaschl
 * @since 25.02.20
 */
public class BlackJackGameArrayListBased {

    private List<Card> packet;

    public BlackJackGameArrayListBased() {
        this.packet = initPacket();
    }

    private List<Card> initPacket() {
        List<Card> myPacket = new ArrayList<>();
        for(Colour c : Colour.values() ) {
            for (int j = 1; j < 14; j++) {
                myPacket.add(new Card(j, c));
            }
        }
        return myPacket;
    }

    public List<Card> getPacket() {
        return packet;
    }

    public int getCardsInGame() {
        return packet.size();
    }

    public void mix() {
        Collections.shuffle(packet);
    }

    public Card giveCard() {
        if (packet.isEmpty()) {
            this.packet = initPacket();
            mix();
        }
        return packet.remove(packet.size()-1);
    }

}
