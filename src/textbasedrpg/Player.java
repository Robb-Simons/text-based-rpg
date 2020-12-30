package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-29-2020
 * Program name: Text-based RPG project
 * Program Desc:  
 *TODO: make getters and setters for all variables here to be executed in Main.java                                       
 *************************************************************************************************/
public class Player {
	private int playerHealth = 100;
	private int playerStamina = 100;
	private int playerMaxPotions = 5;
	private int playerAttack = 35;
	private int healthPotionHeal = 25;
	private int healthPotionDropChance = 50;
	
	public int getPlayerHealth() {
		return playerHealth;
	}
	
	public int getPlayerStamina() {
		return playerStamina;
	}
	
	public int getPlayerAttack() {
		return playerAttack;
	}
	
	public int getPlayerMaxPotions() {
		return playerMaxPotions;
	}
	
	public int getHealthPotionHeal() {
		return healthPotionHeal;
	}
	
	public int getHealthPotionDropChance() {
		return healthPotionDropChance;
	}
}
