package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-30-2020
 * Program name: Dungeon of Holt - v0.8
 * Program Desc: Main class to run all of the code required to start the game.
 * 				 creates new objects of every class defined in the package minus Monster.java.
 * 				 TODO: Create code to handle execution of this from .Jar.  (Wait on this to see how the Jar works on other machines.)
 *************************************************************************************************/
import java.io.IOException;
import java.net.URISyntaxException;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-29-2020
 * Program name: Text-based RPG project
 * Program Desc:TODO: Add to me. before official release   
 * TODO: add jframe for output window to file so JRE can run the game.                                   
 *************************************************************************************************/
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.io.*;
import java.awt.GraphicsEnvironment;
import java.net.URISyntaxException;


public class Main {
	
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		boolean running = true;
		Scanner in = new Scanner(System.in);
		Player Player = new Player();
		Environment Environment = new Environment();
		Combat Combat = new Combat();
		Random rand = new Random();

		// Start game sequence.
		//Asks for Player name
		System.out.println("What is your Name, Traveler?");
		String inputStr = in.nextLine();
		Player.setPlayerName(inputStr);
		//Game introduction.
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
		//Some of these values are not in use yet.. Stamina and Potions.
		System.out.println("\tHealth: " + Player.getPlayerHealth() + "\tStamina: " + Player.getPlayerStamina()
				+ "\tHealth Potions: " + Player.getPlayerPotions());
		System.out.println("--------------------------------------------------------------------------");
		
		//Game Starts here
		try {//Error handler for TimeUnit
			while (running) {
				for (int i = 0; i <= 15; i++) {//15 rounds
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
						//Announces the floor to player.
						String floorName = Environment.announceFloor();
						System.out.println(floorName + "  Floor No: " + i);
						TimeUnit.SECONDS.sleep(2);
						//chance to encounter enemies upon entering a room
						//if (rand.nextInt(1000) >= 0) {
						Combat.startCombat();
						//} else {
						//	Combat.outOfCombat();
						//}
				}
				running = false;//Ends game if For loop is broken.
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}