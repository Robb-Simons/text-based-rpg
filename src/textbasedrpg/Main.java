package textbasedrpg;

import java.io.IOException;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-29-2020
 * Program name: Text-based RPG project
 * Program Desc:  
 * TODO:populate with variables that will handle events in the game.                                        
 *************************************************************************************************/
import java.util.Random;
import java.util.concurrent.TimeUnit;
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

		// Start game sequence.
//		Combat.startCombat();//shitty way to text combat features atm, but its workin so.. its stayin..
		System.out.println("What is your Name, Traveler?");
		String inputStr = in.nextLine();
		Player.setPlayerName(inputStr);
		System.out.println("\t # Welcome to the Dungeon of Holt, " + Player.getPlayerName()
				+ ". # \n--------------------------------------------------------------------------\n");
		System.out.println(
				"It seems you've lost your way...\nYou must fight your way out of here...\nIf you are going to make it out alive..\nGood luck."
						+ "\n--------------------------------------------------------------------------");
		// Instructions
		System.out.println("\t ################## HOW TO PLAY ##################\n");
		System.out.println(
				"\t WHEN OUT OF COMBAT:\nPRESS 1 to move forward.\nPRESS 2 to scan the area.\nPRESS 3 to drink a potion.\nPRESS 4 to rest.\nPRESS anything else to quit the game.");
		System.out.println("\t WHEN IN COMBAT: \nPRESS 1 to ATTACK\nPRESS 2 to BLOCK\nPRESS 3 To RUN");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Starting Values: ");
		System.out.println("\tHealth: " + Player.getPlayerHealth() + "\tStamina: " + Player.getPlayerStamina()
				+ "\tHealth Potions: " + Player.getPlayerPotions());
		System.out.println("--------------------------------------------------------------------------");
		// TODO: fix this logic to work in the game, might need to make this in
		// Player.java.
		/************************************************************************************************************
		 * // Class Selection
		 *  System.out.println("\t # What Class would you like to be? # ");
		 *  System.out.println("Enter 1 for Warrior (+75 HP) (+25 Attack) (-20 Stamina) (-2 Max Potions)\n");
		 *  System.out.println("Enter 2 for Rogue (-25 HP) (+20 Attack) (+10 Stamina) (Default Max Potions)\n");
		 *  System.out.println("Enter 3 for Alchemist (-50 HP) (-10 Attack) (-30 Stamina) (+4 Max Potions)\n");
		 *  int inputI = in.nextInt(); 
		 *  // TODO: make this a switch statement.. I dont think it needs to be IF // conditionals. Someone if you are reading this help. Im not sure. Help.
		 *  if (inputI == 1 || inputI == 2 || inputI == 3 || inputI == 4) {
		 *  	 if (inputI == 1) { 
		 *  		// Warrior
		 * 			Player.setClassName(1);
		 * 			Player.setWarClass(); 
		 * 			System.out.println("You have Chosen: " + Player.getClassName() + ". Great Choice. Your new stats are: ");
		 * 			System.out.println(Player.printStats()); 
		 * 		}
		 * 
		 * if (inputI == 2) { // Rogue Player.setClassName(2); Player.setRogClass();
		 * System.out.println("You have Chosen: " + Player.getClassName() + ". Great
		 * Choice. Your new stats are: "); System.out.println(Player.printStats()); }
		 * 
		 * if (inputI == 3) { // Alchemist Player.setClassName(3); Player.setAlcClass();
		 * System.out.println("You have Chosen: " + Player.getClassName() + ". Great
		 * Choice. Your new stats are: "); System.out.println(Player.printStats()); }
		 * 
		 * if (inputI == 4) { // Traveler System.out.println("You have Chosen: " +
		 * Player.getClassName() + ". Wait... Did I tell you about this? Anyway, Good
		 * Choice. Your stats are: "); System.out.println(Player.printStats()); } } else
		 * { running = false; System.out.println("Terminated goodbye!"); System.exit(0);
		 * }
		 *************************************************************************************************************************************************/
		try {
			while (running) {
				for (int i = 14; i <= 15; i++) {//15 rounds
					//checks rounds if 5 or 10 stops game for a merchant round.
					if (i == 5 || i == 10) {
						Environment.announceMerchant();
						TimeUnit.SECONDS.sleep(1);
						System.out.println("Welp... Onto the next floor.");
					} 
					if (i == 15) {
						//Final Boss round.		    
						System.out.println("The exit is in the next room. Your adrenaline starts pumping as you see light coming from the gates.\n");
						for(int c =0; c < 10; c++) {
							if (c==5) {
								System.out.println("The ground is quaking...");
							}
							System.out.println("\n\n");
							TimeUnit.SECONDS.sleep(1);
						}
						System.out.println("Wait.. You hear a sudden slam right behind you. Good luck, " + Player.getPlayerName() + ".");
						 Combat.startFCombat();
					}
						//rest of gameplay.
						String floorName = Environment.announceFloor();
						System.out.println(floorName);
						TimeUnit.SECONDS.sleep(2);
						if (rand.nextInt(1000) >= 0) {
							Combat.startCombat();
						} else {
							Combat.outOfCombat();
						}
				}
				running = false;// Test to break the while loop, saving memory while testing ofc.
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
