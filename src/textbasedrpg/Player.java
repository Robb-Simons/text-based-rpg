package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-29-2020
 * Program name: Text-based RPG project
 * Program Desc:  
 *TODO: make getters and setters for all variables here to be executed in Main.java
 *TODO: Create moveForward(), Attack(), Block(), drinkPotion();                                       
 *************************************************************************************************/
public class Player {
	private int playerHealth = 100;
	private int playerMaxHealth = 175;
	private int playerStamina = 100;
	private int playerMaxPotions = 5;
	private int playerAttack = 35;
	private int healthPotionHeal = 25;
	private int healthPotionDropChance = 50;
	
	public int getPlayerHealth() {
		return playerHealth;
	}
	
	public void setPlayerHealth(int newHealth) {
		this.playerHealth = newHealth;
	}
	
	public int getPlayerMaxHealth() {
		return playerMaxHealth;
	}
	
	public void getPlayerHealth(int newMaxHealth) {
		this.playerMaxHealth = newMaxHealth;
	}
	
	public int getPlayerStamina() {
		return playerStamina;
	}
	
	public void setPlayerStamina(int newStam) {
		this.playerStamina = newStam;
	}
	
	public int getPlayerAttack() {
		return playerAttack;
	}
	
	public void setPlayerAttack(int newAtt) {
		this.playerAttack = newAtt;
	}
	
	public int getPlayerMaxPotions() {
		return playerMaxPotions;
	}
	
	public int getHealthPotionHeal() {
		return healthPotionHeal;
	}
	
	public void setHealthPotionHeal(int newPotHeal) {
		this.healthPotionHeal = newPotHeal;
	}
	
	public int getHealthPotionDropChance() {
		return healthPotionDropChance;
	}
	
	public void setHealthPotionDropChance(int newDropchance) {
		this.healthPotionDropChance = newDropchance;
	}
}
