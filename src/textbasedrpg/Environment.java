package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-30-2020
 * Program name: Text-based RPG project
 * Program Desc: 
 * TODO:make getters and setters for all variables here to be executed in Main.java      
 * TODO:add things like room names, and loot to go inside dungeons.    
 * TODO: add announceFloor() method
 * TODO: Create specialRoom(array) and method for boss/mechants etc;                                
 *************************************************************************************************/
public class Environment {
	private String[] roomNameAdj = {"Dank",//0
									"Damp",//1
									"Dark",//2
									"Cold",//3
									"Haunted",//4
									"Desolated"//5
									};
	private String[] roomNames = {"Cell Block", //0
			"Torture Chamber",//1
			"Hallway",//2
			"Guard's Quarters",//3
			"Labratory",//4
			"Bed Chambers",//5
			"Kitchen",//6
			"Chapel",//7
			"Great Hall",//8
			"Undercroft",//9
			"Cellars",//10
			"Mage's Chamber",//11
			"Portal Room",//12
			};
	
	private String bossRoom = "The Throne Room";
	private String breakRoom = "Friendly Merchants Chamber";
	
}
