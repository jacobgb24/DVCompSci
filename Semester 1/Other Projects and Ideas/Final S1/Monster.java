//Class for the enemy
public class Monster {
    static int maxHealth, defense, damage, health;
    
    public Monster(int hp, int armor, int attack){
        maxHealth = health = hp;
        defense = armor;
        damage = attack;
    }
    public Monster(){
        maxHealth = 50;
        defense = 0;
        damage = 5;
    }
    
    public void changeHealth(int change){
        health+=change;
    }
    public int getHealth(){
        return health;
    }
    public int getDefense(){
        return defense;
    }
    public int getDamage(){
        return damage;
    }
}
