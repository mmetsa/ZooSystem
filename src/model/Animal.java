package model;

import java.util.Date;
import java.util.Random;

public class Animal {

    @Override
    public String toString() {
        String result = "";
        result = "Animal (name = " + this.name + "), ";
        result += "Type (" +  this.type + ")";

        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cage getLocation() {
        return location;
    }

    public void setLocation(Cage location) {
        this.location = location;
    }

    public int getMaximumChildren() {
        return maximumChildren;
    }

    public void setMaximumChildren(int maximumChildren) {
        this.maximumChildren = maximumChildren;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public String getDeathReason() {
        return deathReason;
    }

    public void setDeathReason(String deathReason) {
        this.deathReason = deathReason;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public AnimalHealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(AnimalHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getSicknessType() {
        return sicknessType;
    }

    public void setSicknessType(String sicknessType) {
        this.sicknessType = sicknessType;
    }

    public Animal[] getChildren() {
        return children;
    }

    public void setChildren(Animal[] children) {
        this.children = children;
    }

    private Date deathDate;
    private String deathReason;
    private int hungerLevel;
    private AnimalHealthStatus healthStatus;
    private String sicknessType;
    private Animal[] children;
    private String name;
    private int age;
    private String type;

    public Animal(String name, String type, long id, Date birthDate) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.birthDate = birthDate;
    }

    private Cage location;
    private int maximumChildren;
    private long id;
    private Date birthDate;

    public Animal[] breed (Animal otherAnimal) {
        if (!this.type.equals(otherAnimal.type)) {
            return new Animal[0];
        }
        Random r = new Random();
        int breedAmount = r.nextInt(this.maximumChildren) + 1;
        int sickChance = r.nextInt(2); // r.nextInt(2) - 0, 1
        long animalID = r.nextInt(999_999_991);
        Animal[] children = new Animal[breedAmount];
        // children[0] = new Animal(); -- see ei toimi, sest sa ei tea palju neid kohti arrays on
        // children[4] = new Animal(); -- mis siis, kui breedAmount oli 3?

        for (int i = 0; i <= children.length; i++) {
            Animal animal = new Animal("Joosep", "KIRJU_KOER", animalID + i, new Date(System.currentTimeMillis()) );
            // Muuda animali objekti
            animal.birthDate = new Date(System.currentTimeMillis());
            animal.type = this.type;
            animal.hungerLevel = 50;
            // animal.healthStatus = sickChance == 0 ? AnimalHealthStatus.SICK : AnimalHealthStatus.HEALTHY;
            if (sickChance == 0) {
                animal.healthStatus = AnimalHealthStatus.HEALTHY;
            } else {
                animal.healthStatus = AnimalHealthStatus.SICK;
            }
            // Pane see animal objekt arraysse
            children[i] = animal;
        }
        return children;
    }

    public void eat(int amountOfFood) {
        this.hungerLevel -= amountOfFood;
    }
    public void kill(String deathReason) {
        this.deathDate = new Date(System.currentTimeMillis());
        this.deathReason = deathReason;
        this.hungerLevel = -1;
        this.healthStatus = AnimalHealthStatus.DEAD;
    }
}
