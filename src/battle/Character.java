/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battle;

/**
 *
 * @author ST10468144
 */
public class Character {

    private String name;
    private int hp;
    private int attack;
    private int def;
        //used the insert constructor 
    public Character(String name, int hp, int attack, int def) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.def = def;
    }
//used inserrt code for getters and setters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDef() {
        return def;
    }

    public boolean isAlive() {
        return hp > 0;
    }
//asked chatgpt for insight for takedmg and attack
    public void takeDmg(int dmg) {

        this.hp -= dmg;
        if (this.hp < 0) {
            this.hp = 0;
        }

    }

    public void attack(Character target) {
        int dmg = Math.max(0, attack - target.getDef());
        target.takeDmg(dmg);
        System.out.println(name + " attacks " + target.getName() + " for " + dmg + " damage. "
                + target.getName() + " has " + target.getHp() + " HP left.");
    }

    public static Character createGoblin() {
        return new Character("Goblin ", 10, 5, 0); //defence 0 so goblin cant defend because it can only attack
    }

}
