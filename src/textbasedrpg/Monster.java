package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-29-2020
 * Program name: Text-based RPG project
 * Program Desc: TODO: fill me.                                 
 *************************************************************************************************/
import java.util.Random;

public class Monster {
	Random rand = new Random();
	private int maxEnemyHealth = 35;
	private int EnemyAttack = 8;
	private String enemy ="";
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
	
	private String FinalBoss = "Osiris the Omnipresent";
	private int maxFEnemyHealth = 60;
	private int FEnemyAttack = 24;
	
	public String getFBossName() {
		return FinalBoss;
	}
	
	public int getFBossHealth() {
		return maxFEnemyHealth;
	}
	
	public int getFBossAttack() {
		return FEnemyAttack;
	}
	
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
	
	public String RandomEnemy() {
		enemy = Enames[rand.nextInt(Enames.length)];
		return enemy;
	}
	
	public int Attack() {
		int finalAttack = rand.nextInt(getMaxEnemyAttack());
		return finalAttack;
		
	}
}
