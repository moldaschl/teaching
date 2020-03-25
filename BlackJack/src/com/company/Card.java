package com.company;

/**
 * @author markus.moldaschl
 * @since 11.02.20
 */
public class Card {

    private final int value;

    private final Colour colour;

    public Card(int value, Colour c) {
        this.value = value;
        this.colour = c;
    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour.getName();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("value=").append(value);
        sb.append(", colour=").append(colour);
        sb.append('}');
        return sb.toString();
    }
}
