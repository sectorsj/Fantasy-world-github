package ru.sectorsj.level1;

public class Warrior extends Hero {

    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " ударил мечом " +enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
