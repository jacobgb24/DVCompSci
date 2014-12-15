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
public class Combat {
    static int maxHealth, defense, damage, health, mana;
    
    public Combat(int hp, int armor, int attack, int mp){
        maxHealth = health = hp;
        defense = armor;
        damage = attack;
        mana = mp;
    }
    public Combat(){
        maxHealth = 100;
        defense = 0;
        damage = 10;
    }
    
    public void changeHealth(int change){
        health+=change;
    }
    public int getMaxHealth(){
        return maxHealth;
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
    public int getMana(){
        return mana;
    }
    public void useMana(int cost){
        mana -= cost;
    }
}
