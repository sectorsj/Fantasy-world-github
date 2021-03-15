package ru.sectorsj.level1;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Боромир", 200, 15);
        Hero mage = new Mage("Гэндальф", 200, 20);
        Hero archer = new Archer("Леголас",200, 10);

        Enemy goblin = new Enemy("Гоблин", 100, 5) {
        };

        attackEnemy(goblin, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy goblin, Hero... heroes) {
        while (goblin.isAlive()){
            for (Hero hero : heroes) {
                if (goblin.isAlive()) {
                    hero.attackEnemy(goblin);
                }
            }
        }
    }
}
