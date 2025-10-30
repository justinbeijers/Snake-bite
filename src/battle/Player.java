/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battle;

/**
 *
 * @author ST10468144
 */
public class Player extends Character {
    private String classType;
        //used InheritanceExample as blueprint for this inheritance done on the 29th august
    public Player(String name, String classType, int hp, int attack, int def) {
        super(name, hp, attack, def);
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }
}