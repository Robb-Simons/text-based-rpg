package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-29-2020
 * Program name: Text-based RPG project
 * Program Desc:  
 * TODO:populate with variables that will handle events in the game.                                        
 *************************************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		boolean running = true;
		Scanner in = new Scanner(System.in);
		Player Player = new Player();
		Monster Monster = new Monster();
		Environment Environment = new Environment();
		Combat Combat = new Combat();
		Random rand = new Random();
		
		//TODO: Variables to control RNG within the while loop
		//TODO: create if when entering a room roll for combat 62% chance so if rngesus_combat >= 620 Combat.startCombat()
		int rngesus_Attack = rand.nextInt(Player.getPlayerAttack());
		int rngesus_Block = rand.nextInt(Player.getPlayerMaxBlock());
		
		//Start game sequence. 
//		Combat.startCombat();//shitty way to text combat features atm, but its workin so.. its stayin..
		System.out.println("What is your Name, Traveler?");
		String inputStr = in.nextLine();
		Player.setPlayerName(inputStr);
		System.out.println("\t # Welcome to the Dungeon of Holt, " + Player.getPlayerName() +
				". # \n--------------------------------------------------------------------------\n");
		System.out.println("It seems you've lost your way...\nYou must fight your way out of here...\nIf you are going to make it out alive..\nGood luck."
							+ "\n--------------------------------------------------------------------------");
		//Instructions
		System.out.println("\t ################## HOW TO PLAY ##################\n");
		System.out.println("\t WHEN OUT OF COMBAT:\nPRESS 1 to move forward.\nPRESS 2 to scan the area.\nPRESS 3 to drink a potion.\nPRESS 4 to rest.\nPRESS '999' to quit the game.");
		System.out.println("\t WHEN IN COMBAT: \nPRESS 1 to ATTACK\nPRESS 2 to BLOCK\nPRESS 3 To RUN");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Starting Values: ");
		System.out.println("\tHealth: " + Player.getPlayerHealth() + "\tStamina: " + Player.getPlayerStamina() + "\tHealth Potions: " + Player.getPlayerPotions());
		System.out.println("--------------------------------------------------------------------------");
		//Class Selection
		System.out.println("\t # What Class would you like to be? # ");
		System.out.println("Enter 1 for Warrior (+75 HP) (+25 Attack) (-20 Stamina) (-2 Max Potions)\n");
		System.out.println("Enter 2 for Rogue (-25 HP) (+20 Attack) (+10 Stamina) (Default Max Potions)\n");
		System.out.println("Enter 3 for Alchemist (-50 HP) (-10 Attack) (-30 Stamina) (+4 Max Potions)\n");
		int inputI = in.nextInt();
		//TODO: make this a switch statement.. I dont think it needs to be IF conditionals. Someone if you are reading this help. Im not sure. 
			if(inputI == 1 ||inputI == 2 ||inputI == 3 || inputI == 4) {
				if (inputI == 1) {
					//Warrior
					Player.setClassName(1);
					System.out.println("You have Chosen: " + Player.getClassName() + ". Great Choice. Your new stats are: ");
				}
				
				if (inputI == 2) {
					//Rogue
					Player.setClassName(2);
					System.out.println("You have Chosen: " + Player.getClassName() + ". Great Choice. Your new stats are: ");
				}
				
				if (inputI == 3) {
					//Alchemist
					Player.setClassName(3);
					System.out.println("You have Chosen: " + Player.getClassName() + ". Great Choice. Your new stats are: ");
				}
				
				if (inputI == 4) {
					//Traveler
					System.out.println("You have Chosen: " + Player.getClassName() + ". Wait... Did I tell you about this? Anyway, Good Choice. Your stats are: ");
				}
			} else {
				running = false;
				System.out.println("Terminated goodbye!");
				System.exit(0);
			}
		GAME_START: // label needed for later to return to the beginning of the game (death, or restart). Make other labels within the While loop to call to certain events. 
		while (running) {
			//Game Start.
			NEW_FLOOR://Label to reuse these lines
			//Announce Floor via Environment.java
			System.out.println(Environment.announceFloor());
			//TODO: Roll for Combat after entering room
			
			//testing roll for combat and its fairness 
			//TODO: make a method to call this code when stepping forward (or scanning the area).
			if (rand.nextInt(1000) >= 620) {
				//TODO: add Combat.startCombat();
				Combat.startCombat();
			}
			//TODO: add continue label to continue playing after combat resolves.
			//TODO: Add system input for next move.
			//TODO: add If conditional for move rest drink and scan.
			//TODO: if(input2==1){Player.moveForward();}...
			running = false;//Test to break the while loop, saving memory while testing ofc.
		}
	}
}
