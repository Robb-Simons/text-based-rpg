package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-29-2020
 * Program name: Text-based RPG project
 * Program Desc: 
 * TODO:make getters and setters for all variables here to be executed in Main.java                                        
 *************************************************************************************************/

public class Monster {
	private int maxEnemyHealth = 75;
	private int EnemyAttack = 25;
	private String[] Enames = {"Orc",//0
					   "Skeleton",//1
					   "Torturer",//2
					   "Ghoul",//3
					   "Small Bat",//4
					   "Snake",//5
					   "Amber-eyed Fiend",//6
					   "Mimic",//7 thank you @vigmu2 for the suggestion :) 
					   "Deranged Prisioner",//8
					   "Lunatic",//9
					   "Thief",//10
					   };
	
	public int getMaxEnemyHealth() {
		return maxEnemyHealth;
	}
	public void setMaxEnemyHealth(int newMEH) {
		this.maxEnemyHealth = newMEH;
	}
	public int getMaxEnemyAttack() {
		return EnemyAttack;
	}
	public void setMaxEnemyAttack(int newMEA) {
		this.EnemyAttack = newMEA;
	}
	
	public void setRandomEnemy() {
		
	}
}
