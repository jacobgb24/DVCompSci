/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Trent
 */
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
