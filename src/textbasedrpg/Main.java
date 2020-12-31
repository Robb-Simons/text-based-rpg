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
		Player Player = new Player();
		Monster Monster = new Monster();
		Environment Envionment = new Environment();
		Combat Combat = new Combat();
		Random rand = new Random();
		
		//Start game sequence. 
		System.out.println("\t # Welcome to the Dungeon of Holt, Traveler. # \n--------------------------------------------------------------------------");
		System.out.println("It seems you've lost your way...\nYou must fight your way out of here...\nIf you are going to make it out alive..\nGood luck."
							+ "\n--------------------------------------------------------------------------");
		//Instructions
		System.out.println("\t ################## HOW TO PLAY ##################\n");
		System.out.println("\t WHEN OUT OF COMBAT:\nPRESS 1 to move forward.\nPRESS 2 to scan the area.\nPRESS 3 to drink a potion.\nPRESS 4 to rest.\nPRESS 'x' to quit the game.");
		System.out.println("\t WHEN IN COMBAT: \nPRESS 1 to ATTACK\nPRESS 2 to BLOCK\nPRESS 3 To RUN");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Starting Values: ");
		System.out.println("\tPlayer Health: " + Player.getPlayerHealth() + "\tPlayer Stamina: " + Player.getPlayerStamina() + "\tHealth Potions: " + Player.getPlayerPotions());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\t # What Class would you like to be? # ");
		System.out.println("1 for Warrior (+75 HP) (-20 Stamina) (-2 Max Potions)");
		
		
		GAME: // label needed for later to return to the beginning of the game (death, or restart). Make other labels within the While loop to call to certain events. 
		while (running) {
			//Game Start.
			running = false;//Test to break the while loop, saving memory while testing ofc.
		}
	}
}
