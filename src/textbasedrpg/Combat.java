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
		//this method should start the combat block, while in this 
		int enemyHealth = rand.nextInt(Monster.getMaxEnemyHealth());
		String enemyName = Monster.RandomEnemy();
		System.out.println("\t!#> " + enemyName + " has appeared! <#! ");
		
		//While enemy is alive
		while (enemyHealth > 0) {
			System.out.println(Player.getPlayerName()+"\n     HP: "+ Player.getPlayerHealth() + "     Stamina: " + Player.getPlayerStamina());
			System.out.println("----------------------------");
			System.out.println(enemyName +"\n     HP: "+ enemyHealth);
			
			enemyHealth = 0;
		}
	}
}
