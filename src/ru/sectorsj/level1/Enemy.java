package ru.sectorsj.level1;

public class Enemy implements Mortal {

    private String name;
    private int health;
    private int selfDamage;

    public Enemy(String name, int health, int selfDamage) {
        this.name = name;
        this.health = health;
        this.selfDamage = selfDamage;
    }

    public void takeDamage(int damage) {
        this.health -= Math.min(health,damage);
        System.out.println(name + " получил урон " + damage + ". Осталось " + health);
    }

    @Override
    public boolean isAlive(){
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSelfDamage() {
        return selfDamage;
    }

}
