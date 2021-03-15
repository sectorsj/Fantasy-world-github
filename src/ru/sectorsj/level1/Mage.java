package ru.sectorsj.level1;

public class Mage extends Hero {

    public Mage(String name,int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy goblin) {
        System.out.println(getName() + " сотворил заклинание на " + goblin.getName());
        goblin.takeDamage(getDamage());
    }
}
