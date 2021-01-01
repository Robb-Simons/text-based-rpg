package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-29-2020
 * Program name: Text-based RPG project
 * Program Desc:  
 *TODO: make getters and setters for all variables here to be executed in Main.java
 *TODO: Create moveForward(), Attack(), Block(), drinkPotion() and Rest();                                       
 *************************************************************************************************/
public class Player {
	private String playerName = "Traveler";
	private int gold = 0;
	private int playerHealth = 100;
	private int playerMaxHealth = 175;
	private int playerStamina = 100;
	private int playerMaxPotions = 5;
	private int playerAttack = 35;
	private int playerMaxBlock = -10;
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
	
	public String getClassName() {
		return finalClassName;
	}
	
	public void setClassName(int classNameMod) {
		int newClass = classNameMod - 1;
		finalClassName = classNames[newClass];
	}
	
	//TODO: Add stat bonuses/decreases for each Class. 
	
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
		this.playerStamina = newStam;
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
	
	public void moveForward() {
		
	}
	
	public void Rest() {
		
	}
	
	public void Block() {
		
	}
	
	public void Attack() {
		
	}
	
}
