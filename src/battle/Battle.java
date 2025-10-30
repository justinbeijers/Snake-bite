/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battle;

/**
 *
 * @author ST10468144
 */
import java.util.*;

public class Battle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your Character's name?: ");
        String name = scan.nextLine();

        System.out.println("Choose your class: ");
        System.out.println("(1) Warrior");
        System.out.println("(2) Rogue");
        System.out.println("(3) Mage");
        int choice = scan.nextInt();

        Player player = null; //let netbeans instantiate player
        switch (choice) {
            case 1 ->
                player = new Player(name, "Warrior", 30, 6, 3);
            case 2 ->
                player = new Player(name, "Rogue", 20, 8, 2);
            case 3 ->
                player = new Player(name, "Mage", 15, 10, 1);
        }

        Character goblin = Character.createGoblin();
//the fight loop
        while (player.isAlive() && goblin.isAlive()) {
            System.out.println("\nYour HP: " + player.getHp() + " ........... Goblin HP: " + goblin.getHp());
            System.out.println("Choose action: 1. Attack  2. Defend");
            int action = scan.nextInt();

            if (action == 1) {
                player.attack(goblin);
            } else {
                System.out.println(player.getName() + " defends, reduce damage");
                // Goblin attack but reduced
                int reduced = Math.max(0, goblin.getAttack() - player.getDef());
                player.takeDmg(reduced);
                System.out.println("Goblin attacks " + player.getName() + " for " + reduced + " damage.");
            }

        }

        // when either die or win
        if (player.isAlive()) {
            System.out.println("\nYou defeated the Goblin, you win");
        } else {
            System.out.println("\nThe dobby defeated you, you lost");
        }
    }

}
