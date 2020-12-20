package rtfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements ISaveable {
    private String name;
    private int health;
    private String weapon;
    List<String> savedValues = new ArrayList<>();

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.health);
        values.add(2, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
            this.weapon = savedValues.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
