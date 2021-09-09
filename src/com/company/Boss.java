package com.company;

public class Boss {
    public int getHealthBoss() {
        return healthBoss;
    }

    public void setHealthBoss(int healthBoss) {
        this.healthBoss = healthBoss;
    }

    private int healthBoss;

    public double getDamageBoss() {
        return damageBoss;
    }

    public void setDamageBoss(double damageBoss) {
        this.damageBoss = damageBoss;
    }

    private double damageBoss;

    public String getTypeOfProtectionBoss() {
        return typeOfProtectionBoss;
    }

    public void setTypeOfProtectionBoss(String typeOfProtectionBoss) {
        this.typeOfProtectionBoss = typeOfProtectionBoss;
    }

    private String typeOfProtectionBoss;

}
