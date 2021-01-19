package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-29-2020
 * Program name: Dungeon of Holt - v0.8
 * Program Desc: This Class defines the player character in the game.
 * 				 it was created to be modular. Not all features are used
 * 				 in this game but will be used in future concepts.
 * TODO: Make Classes work.
 * TODO: Make Gold work
 * TODO: Make Stamina work
 * TODO: Make Potions work                                     
 *************************************************************************************************/
import java.util.Random;

public class Player {
	Random rand = new Random();
	private String playerName = "Traveler";
	private int gold = 0;
	private int playerHealth = 100;
	private int playerMaxHealth = 175;
	private int playerStamina = 100;
	private int playerMaxPotions = 5;
	private int playerAttack = 35;
	private int playerMaxBlock = 10;
	private int playerPotions = 2;
	private int healthPotionHeal = 25;
	private int healthPotionDropChance = 50;
	private String[] classNames = {"Warrior", "Rogue", "Alchemist"};
	private String finalClassName = "Traveler";
	
	public int getGold() {
		return gold;
	}
	
	public void setGold(int newGold) {
		this.gold = newGold;
	}
	
	public String printStats() {
		String statString = "";

	
		statString = "HP: " + getPlayerHealth()+"\nStamina: " + getPlayerStamina() + "\nMax Potions: " + getPlayerMaxPotions();
		return statString;
	}
	
	public String getClassName() {
		return finalClassName;
	}
	
	public void setClassName(int classNameMod) {
		int newClass = classNameMod - 1;
		finalClassName = classNames[newClass];
	}
	 
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String newName) {
		this.playerName = newName;
	}
	
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
		this.playerStamina = playerStamina - newStam;
	}
	
	public int getPlayerPotions() {
		return playerPotions;
	}
	
	public void setPlayerPotions(int newPots) {
		this.playerPotions = newPots;
	}
	
	public int getPlayerMaxBlock() {
		return playerMaxBlock;
	}
	
	public void setPlayerMaxBlock(int newBlock) {
		this.playerMaxBlock = newBlock;
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
	
	//Player actions
	//TODO:populate all of these methods 
	public void drinkPotion() {
		
	}
	
	public void moveForward() {
		//TODO:
		//move to next room (nothing, just continue the While loop in Main.)
	}
	
	//TODO: Make decision to eliminate Stamina or not. 
	public void Rest() {
		//TODO: if Rest roll for combat at 5% chance, if no combat restore 10 stamina.
		
	}
	
	public void Scan() {
		//TODO: Create logic to place here. 
		//Random chance to open a treasure chest that has gold + a 1/3 chance at bad mid or high tier loot.
	}
	
	public boolean Block() {
		boolean x = false;
		if (rand.nextInt(100) >49) {
			x=true;
		} else {
			x=false;
		}
		return x;
	}
	
	public boolean Run() {
		boolean x = false;
		if (rand.nextInt(100) >49) {
			x=true;
		} else {
			x=false;
		}
		return x;
		
	}
	
	public int Attack() {
		int finalAttack = rand.nextInt(getPlayerAttack());
		return finalAttack;
		
	}
	
}
