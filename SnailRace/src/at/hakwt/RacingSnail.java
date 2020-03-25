package at.hakwt;

import java.util.Random;

/**
 * A racing snail
 *
 * @author markus.moldaschl
 * @since 29.01.20
 */
public class RacingSnail {

    private String name;
    private String type;
    private int maxSpeed;
    private int distanceRaced;

    public RacingSnail(String name, String type, int maxSpeed) {
        this.name = name;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.distanceRaced = 0;
    }

    public void crawl() {
        Random rnd = new Random();
        int dist = rnd.nextInt(maxSpeed)+1;
        this.distanceRaced += dist;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getDistanceRaced() {
        return distanceRaced;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RacingSnail{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", distanceRaced=").append(distanceRaced);
        sb.append('}');
        return sb.toString();
    }

}