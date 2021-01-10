package textbasedrpg;

/*************************************************************************************************
 * Written by: Robert Simons 
 * Composition date: 12-30-2020
 * Program name: Text-based RPG project
 * Program Desc: Program handles all combat engagements.  
 * TODO: Make the monster swing back.
 * TODO: Fill the program description
 *************************************************************************************************/
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Combat {
	private Random rand = new Random();
	Monster Monster = new Monster();
	Player Player = new Player();
	// Might need to put the variables here so the other methods can use it.
	// TODO: Test this.
	int enemyHealth = rand.nextInt(Monster.getMaxEnemyHealth());
	int playerHealth = Player.getPlayerHealth();
	String enemyName = Monster.RandomEnemy();
	private int playerNewHealth = playerHealth;
	private int enemyNewHealth = enemyHealth;
	private int enemySwing = rand.nextInt(Monster.Attack()+1);
	private int hit = rand.nextInt(Player.Attack()+1);

	public void startCombat() {
		try { // error handler for TimeUnit
			// this method should start the combat block, while in this
//		int enemyHealth = rand.nextInt(Monster.getMaxEnemyHealth());
//		String enemyName = Monster.RandomEnemy();
			enemyName = Monster.RandomEnemy();
			System.out.println("\t!#> " + enemyName + " has appeared! <#! ");
			enemyNewHealth = rand.nextInt(Monster.getMaxEnemyHealth());

			// While enemy is alive
			COMBAT_START: while (enemyNewHealth > 0) {
				System.out.println(Player.getPlayerName() + "\n     HP: " + playerNewHealth + "     Stamina: "
						+ Player.getPlayerStamina());
				System.out.println("----------------------------");
				System.out.println(enemyName + "     HP: " + enemyNewHealth);

				Scanner in = new Scanner(System.in);
				System.out.println("\n\t # ACTIONS # ");
				System.out.println("\t1.) Attack!");
				System.out.println("\t2.) Block!");
				System.out.println("\t3.) Run!\n");
				System.out.println("What are you going to do?");
				int input = in.nextInt();
				// conditonal preventing other input
				if (input == 1 || input == 2 || input == 3) {
					// Attack
					if (input == 1) {
						enemySwing = rand.nextInt(Monster.Attack()+1);
						hit = rand.nextInt(Player.Attack()+2);
						System.out.println("You lunge forward and strike the " + enemyName + "!!");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("You dealt " + hit + " damage!");		
						System.out.println(enemyName + " dealt " + enemySwing + " Damage!");
						enemyNewHealth = enemyNewHealth - hit;
						playerNewHealth = playerNewHealth - enemySwing;
						if (playerNewHealth <= 0) {
							System.out.println("\t!@#$%^ GAME OVER ^%$#@!");
							System.exit(0);
						}
						if (enemyNewHealth <= 0) {
							enemyNewHealth = 0;
							//System.out.println("You have defeated " + enemyName + "!!");
						} else {
							System.out.println("The " + enemyName + " has " + enemyNewHealth + " health left!");
							continue COMBAT_START;
						}
					}
					// Block
					if (input == 2) {
						enemySwing = rand.nextInt(Monster.Attack());
						System.out.println("You attempt to cower behind your shield!");
						// Block
						if (Player.Block() == true) {
							TimeUnit.SECONDS.sleep(2);

							System.out.println("\tBlock Successful!");
							System.out.println(enemyName + " trys to deal " + enemySwing + " damage!");
							// how much is blocked
							enemySwing = enemySwing - rand.nextInt(Player.getPlayerMaxBlock());
							// if how much is blocked results neg make it 0
							if (enemySwing <= 0) {
								enemySwing = 0;
							}
							// output results
							System.out.println("You took " + enemySwing + " damage");
							// adjust health value
							playerNewHealth = playerNewHealth - enemySwing;
						} else {
							System.out.println(enemyName + " dealt " + enemySwing + " damage!");
							playerNewHealth = playerNewHealth - enemySwing;
						}
						if (playerNewHealth <= 0) {
							System.out.println("\t!@#$%^ GAME OVER ^%$#@!");
							System.exit(0);
						}
						continue COMBAT_START;

					}
					// Run chance
					if (input == 3) {
						System.out.println("You attempt to flee!");
						// roll to see if flee
						if (Player.Run() == true) {
							TimeUnit.SECONDS.sleep(2);
							System.out.println("you've run away from the " + enemyName + "!");
							break COMBAT_START;
						} else {
							enemySwing = rand.nextInt(Monster.Attack());
							System.out.println(enemyName + " dealt " + enemySwing + " Damage!");
							playerNewHealth = playerNewHealth - enemySwing;
							continue COMBAT_START;
						}

					}
				} else {
					System.out.println("\t!!!Invalid Input!!!");
					System.out.println("\tPlease try Again.");
				}

				// When Enemy Dies.
				if (enemyNewHealth <= 0) {
					System.out.println("You have defeated " + enemyName + "!!");
					in.close();
					break;
				} else {
					continue COMBAT_START;
				}

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void outOfCombat() {
		// TODO: populate with shit for Gameplay outside of combat (if
		// conditionals relying on the numbers generated from Main.java)
		Scanner OoCInput = new Scanner(System.in);
		int in = OoCInput.nextInt();
		System.out.println("It seems to be clear for a moment.\nWhat would you like to do?");
		System.out.println("Press 1 to move on to the next room.\nPress 2 to scan the room for Treasures.\nPress 3 to rest for a minute (Stamina Regen)\nPress 4 to Drink a potion");
		//blanket if preventing faulty input
		if (in == 1 || in == 2 || in == 3 || in == 4) {
			if (in == 1) {
				Player.moveForward();
			}
			if (in == 2) {
				Player.Scan();
			}
			if (in == 3) {
				Player.Rest();
			}
			if (in == 4) {
				Player.drinkPotion();
			}
		} else {
			System.out.println("Invalid Input. Please try again.");
		}
	}

	
	public void startFCombat() {
		//TODO: Final boss fight. Copy startCombat here but remove all enemy tags
		try { 
			enemyName = Monster.getFBossName();
			System.out.println("\t!#> " + enemyName + " has appeared! <#! ");
			enemyNewHealth = Monster.getFBossHealth();

			// While enemy is alive
			COMBAT_START: while (enemyNewHealth > 0) {
				System.out.println(Player.getPlayerName() + "\n     HP: " + playerNewHealth + "     Stamina: "
						+ Player.getPlayerStamina());
				System.out.println("----------------------------");
				System.out.println(enemyName + "     HP: " + enemyNewHealth);

				Scanner in = new Scanner(System.in);
				System.out.println("\n\t # ACTIONS # ");
				System.out.println("\t1.) Attack!");
				System.out.println("\t2.) Block!");
				System.out.println("\t3.) Run!\n");
				System.out.println("What are you going to do?");
				int input = in.nextInt();
				// conditonal preventing other input
				if (input == 1 || input == 2 || input == 3) {
					// Attack
					if (input == 1) {
						enemySwing = rand.nextInt(Monster.getFBossAttack()+1);
						hit = rand.nextInt(Player.Attack()+1);
						System.out.println("You lunge forward and strike the " + enemyName + "!!");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("You dealt " + hit + " damage!");		
						System.out.println(enemyName + " dealt " + enemySwing + " Damage!");
						enemyNewHealth = enemyNewHealth - hit;
						playerNewHealth = playerNewHealth - enemySwing;
						if (playerNewHealth <= 0) {
							System.out.println("\t!@#$%^ GAME OVER ^%$#@!");
							System.exit(0);
						}
						if (enemyNewHealth <= 0) {
							enemyNewHealth = 0;
							//System.out.println("You have defeated " + enemyName + "!!");
						} else {
							System.out.println("The " + enemyName + " has " + enemyNewHealth + " health left!");
							continue COMBAT_START;
						}
					}
					// Block
					if (input == 2) {
						enemySwing = rand.nextInt(Monster.Attack());
						System.out.println("You attempt to cower behind your shield!");
						// Block
						if (Player.Block() == true) {
							TimeUnit.SECONDS.sleep(2);

							System.out.println("\tBlock Successful!");
							System.out.println(enemyName + " trys to deal " + enemySwing + " damage!");
							// how much is blocked
							enemySwing = enemySwing - rand.nextInt(Player.getPlayerMaxBlock());
							// if how much is blocked results neg make it 0
							if (enemySwing <= 0) {
								enemySwing = 0;
							}
							// output results
							System.out.println("You took " + enemySwing + " damage");
							// adjust health value
							playerNewHealth = playerNewHealth - enemySwing;
						} else {
							System.out.println(enemyName + " dealt " + enemySwing + " damage!");
							playerNewHealth = playerNewHealth - enemySwing;
						}
						if (playerNewHealth <= 0) {
							System.out.println("\t!@#$%^ GAME OVER ^%$#@!");
							in.close();
							System.exit(0);
						}
						continue COMBAT_START;

					}
					// Run chance
					if (input == 3) {
						System.out.println("You attempt to flee!");
						// roll to see if flee
						if (Player.Run() == true) {
							TimeUnit.SECONDS.sleep(2);
							System.out.println("you've run away from the " + enemyName + "!");
							break COMBAT_START;
						} else {
							enemySwing = rand.nextInt(Monster.Attack());
							System.out.println(enemyName + " dealt " + enemySwing + " Damage!");
							playerNewHealth = playerNewHealth - enemySwing;
							continue COMBAT_START;
						}

					}
				} else {
					System.out.println("\t!!!Invalid Input!!!");
					System.out.println("\tPlease try Again.");
				}

				// When Enemy Dies.
				if (enemyNewHealth <= 0) {
					System.out.println("You have defeated " + enemyName + "!!");
					System.out.println("You have beaten my FIRST game ever. Thank you so fuckin' much for playing. it means the W O R L D to me :)");
					System.exit(0);
					break;
				} else {
					continue COMBAT_START;
				}

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
