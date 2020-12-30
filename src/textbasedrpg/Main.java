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
		Player myPlayer = new Player();
		Monster myMonsters = new Monster();
		
		//Start game sequence. 
		System.out.println("\t # Welcome to the Dungeon of Holt, Traveler. # \n---------------------------------------------------------------------");
		System.out.println("It seems you've lost your way...\nYou must fight your way out of here...\nIf you are going to make it out alive..\nGood luck."
							+ "\n---------------------------------------------------------------------");
		
		GAME: // label needed for later to return to the beginning of the game (death, or restart). Make other labels within the While loop to call to certain events. 
		while (running) {
			//Game Start.
		}
	}
}
