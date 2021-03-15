package ru.sectorsj.level1;

import ru.sectorsj.level1.Enemy;

public abstract class Hero {

    private String name;
    int health;
    private int damage;


    public Hero(String name, int health, int characterSelfDamage) {
        this.name = name;
        this.health = health;
        this.damage = characterSelfDamage;
    }

    public abstract void attackEnemy(Enemy enemy);


    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
