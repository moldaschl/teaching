package at.hakwt;

/**
 * @author markus.moldaschl
 * @since 02.03.20
 */
public class Automat {

    private String description;

    private double drinkStock;

    private int chipStock;

    public Automat(String description) {
        this.description = description;
        this.drinkStock = 5.0;
        this.chipStock = 0;
    }

    public double getDrinkStock() {
        return drinkStock;
    }

    public void setDrinkStock(double drinkStock) {
        this.drinkStock = drinkStock;
    }

    public int getChipStock() {
        return chipStock;
    }

    public void removal() {
        if ( this.drinkStock >= 0.5 ) {
            this.drinkStock -= 0.5;
            this.chipStock++;
        } else {
            System.out.println("Getränkevorrat auffüllen");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Automat{");
        sb.append("description='").append(description).append('\'');
        sb.append(", drinkStock=").append(drinkStock);
        sb.append(", chipStock=").append(chipStock);
        sb.append('}');
        return sb.toString();
    }
}
