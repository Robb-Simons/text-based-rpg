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
	
	public void startCombat() {
		// this method should start the combat block, while in this
		int enemyHealth = rand.nextInt(Monster.getMaxEnemyHealth());
		String enemyName = Monster.RandomEnemy();
		System.out.println("\t!#> " + enemyName + " has appeared! <#! ");

		// While enemy is alive
		while (enemyHealth > 0) {
			System.out.println(Player.getPlayerName() + "\n     HP: " + Player.getPlayerHealth() + "     Stamina: "
					+ Player.getPlayerStamina());
			System.out.println("----------------------------");
			System.out.println(enemyName + "     HP: " + enemyHealth);

			Scanner in = new Scanner(System.in);
			System.out.println("\n\t # ACTIONS # ");
			System.out.println("\t1.) Attack!");
			System.out.println("\t2.) Block!");
			System.out.println("\t3.) Run!\n");
			System.out.println("What are you going to do, " + Player.getPlayerName() + "?");
			int input = in.nextInt();
			//Attack
			if (input == 1) {

			}
			//Block
			else if (input == 2) {

			}
			//Run chance
			if (input == 3) {

			}

			enemyHealth = 0;
		}
	}
}
