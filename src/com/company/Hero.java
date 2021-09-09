package com.company;

public class Hero {
    private int health;
    private double damage;
    private String magic;

    public int getHealth() {
        return health;
    }

    public double getDamage() {
        return damage;
    }

    public String getMagic() {
        return magic;
    }

    public Hero (int health, double damage, String magic){
        this.health=health;
        this.damage=damage;
        this.magic=magic;
    }
    public Hero (int health, double damage){
        this.health=health;
        this.damage=damage;
    }
}
