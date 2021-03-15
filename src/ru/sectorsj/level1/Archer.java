package ru.sectorsj.level1;

public class Archer extends Hero {

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy goblin) {
        System.out.println(getName() + " выстрелил из лука в " + goblin.getName());
        goblin.takeDamage(getDamage());
    }
}
