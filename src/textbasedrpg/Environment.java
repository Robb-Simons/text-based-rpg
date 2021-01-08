package textbasedrpg;
/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-30-2020
 * Program name: Text-based RPG project
 * Program Desc:                                   
 *************************************************************************************************/
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Environment {
	Random rand = new Random();
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
	private String[] badLoot = {"Withered junk", "10-Day old carcass", "Glob of slime", "Rusted Coin"};//sells for 2 gold @ vendor
	private String[] midLoot = {"Prisioner's Chain", "Dead man's Jewelry", "Chain-mail Undergarments", "Sealed-shut Steamy romance novel"};//sells for 5 gold @ vendor
	private String[] highLoot = {"Glowing Stone", "Bag of Fine Jewels", "Mysterious Key", "King's Chaliace", "Tooth of an Old One"};//sells for 7 gold @ vendor
	
	private String breakRoom = "Friendly Merchants Chamber";
	
	public String announceFloor() {
		//This announces the floor in 2 strings. 
		//x is the adjective y is the floor name.
		//together they create a large amount of variety.
		String x = "";
		String y = "";
		x = roomNameAdj[rand.nextInt(roomNameAdj.length)];
		y = roomNames[rand.nextInt(roomNames.length)];
		String Announcement = "You are in the "+ x + " " + y + "..";
		return Announcement;
	}
	
	public void announceMerchant() {
		System.out.println("You are in the " + breakRoom + ". You can take a breather here.");
		System.out.println("in future updates you will be able to increase your power through this vendor.");
		//"load" for the leaving of the dungeons merchant room.
		for (int i=5; i >=1; i--) {
			System.out.println("Leaving room in " + i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
