package textbasedrpg;

/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-30-2020
 * Program name: Text-based RPG project
 * Program Desc: Program handles all combat engagements.  
 * TODO: Create startCombat()method. 
 *************************************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class Combat {
	private Random rand = new Random();
	Monster Monster = new Monster();
	Player Player = new Player();
	// Might need to put the variables here so the other methods can use it. TODO:
	// Test this.
	int enemyHealth = rand.nextInt(Monster.getMaxEnemyHealth());
	String enemyName = Monster.RandomEnemy();
	private int enemyNewHealth = enemyHealth;

	public void startCombat() {
		// this method should start the combat block, while in this
//		int enemyHealth = rand.nextInt(Monster.getMaxEnemyHealth());
//		String enemyName = Monster.RandomEnemy();
		System.out.println("\t!#> " + enemyName + " has appeared! <#! ");

		// While enemy is alive
		COMBAT_START: while (enemyNewHealth > 0) {
			System.out.println(Player.getPlayerName() + "\n     HP: " + Player.getPlayerHealth() + "     Stamina: "
					+ Player.getPlayerStamina());
			System.out.println("----------------------------");
			System.out.println(enemyName + "     HP: " + enemyNewHealth);

			Scanner in = new Scanner(System.in);
			System.out.println("\n\t # ACTIONS # ");
			System.out.println("\t1.) Attack!");
			System.out.println("\t2.) Block!");
			System.out.println("\t3.) Run!\n");
			System.out.println("What are you going to do?");
			int input = in.nextInt();
			// Attack
			if (input == 1) {
				int hit = Player.Attack();
				System.out.println("You lunge forward and strike the " + enemyName + "!!");
				System.out.println("You dealt " + hit + " damage!");
				enemyNewHealth = enemyHealth - hit;
				System.out.println("The " + enemyName + " has " + enemyNewHealth + " health left!");
				if (enemyHealth <= 0) {
					System.out.println("You have defeated " + enemyName + "!!");
					break;
				} else {
					continue COMBAT_START;
				}
			}
			// Block
			else if (input == 2) {
				System.out.println("You attempt to cower behind your shield!");
				// roll to see if block
				// Block
				Player.Block();
				continue COMBAT_START;

			}
			// Run chance
			if (input == 3) {
				System.out.println("You attempt to flee!");
				// roll to see if flee
//				if (Player.Run() == true) {
//					System.out.println("you've run away from the" + enemyName + "!");
//					break;
//				} else {
//				
//					continue COMBAT_START;
//			}

			}

			// When Enemy Dies.
			if (enemyHealth <= 0) {
				System.out.println("You have defeated " + enemyName + "!!");
				break;
			} else {
				continue COMBAT_START;
			}
		}
	}

	public void outOfCombat() {
		// TODO: populate with the While loop for Gameplay outside of combat (if
		// conditionals relying on the numbers generated from Main.java (just to make it
		// spicy))
	}

	public void combatResolve() {
		// TODO: print to screen after victory against an enemy.
	}
}
