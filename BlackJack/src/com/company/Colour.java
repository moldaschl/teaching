package com.company;

/**
 * @author markus.moldaschl
 * @since 18.03.20
 */
public enum Colour {

    Karo("Karo"), Herz("Herz"), Pik("Pik"), Treff("Treff");

    String name;

    Colour(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
