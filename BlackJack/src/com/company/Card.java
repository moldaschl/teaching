package com.company;

/**
 * @author markus.moldaschl
 * @since 11.02.20
 */
public class Card {

    private final int value;

    private final String colour;

    public Card(int value, int colourCode) {
        this.value = value;
        switch (colourCode) {
            case 1:
                this.colour = "Karo";
                break;
            case 2:
                this.colour = "Herz";
                break;
            case 3:
                this.colour = "Pik";
                break;
            case 4:
                this.colour = "Treff";
                break;
            default:
                this.colour = "undefined";
        }

    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
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
