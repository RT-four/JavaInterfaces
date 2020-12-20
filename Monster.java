package rtfour;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int health;
    private int strength;
    List<String> savedValues = new ArrayList<>();

    public Monster(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.health);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }
}
