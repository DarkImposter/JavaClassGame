//Parker Sexton
//4/15/19
//to venture into the woods and defeat enemies


import java.util.Scanner;
import java.util.Random;



public class SextonBarbarionMain {

	public static void main(String[] args) {
		// local vars
		Random randNum = new Random();
		Scanner kb = new Scanner(System.in);
		SextonPlayerClass you = new SextonPlayerClass();
		System.out.println("Welcome to Barbarion Quest! what is your name Adventurer?");
		boolean done = false;
		boolean alive = true;
		boolean comb = false;
		SextonMobClass[] mobs = new SextonMobClass[9];
		//name, hp, dmg, lvl, biome
		mobs[0] = new SextonMobClass("tree", 3, 0, 1, "forest");
		mobs[1] = new SextonMobClass("snail", 2, 1, 2, "forest");
		mobs[2] = new SextonMobClass("squirrel", 1, 2, 2, "forest");
		
		mobs[3] = new SextonMobClass("crab", 1, 2, 2, "desert");
		mobs[4] = new SextonMobClass("sand", 1, 1, 1, "desert");
		mobs[5] = new SextonMobClass("cactus", 2, 1, 1, "forest");

		mobs[6] = new SextonMobClass("fish", 1, 1, 1, "ocean");
		mobs[7] = new SextonMobClass("shark", 2, 3, 3, "ocean");
		mobs[8] = new SextonMobClass("eel", 1, 4, 2, "ocean");
		

		
		
		while(!done){
		try {
			you.setName(kb.nextLine());
			done = true;
		}catch (IllegalArgumentException ae) {
			System.out.println("Sorry, not a valid name. please enter words only.");
		}
		}
		you.setDmg(1);
		you.setHealth(5);

		System.out.println("welcome, "+you.getName()+"! are you ready to start? (y/n)");
		if (kb.nextLine().contentEquals("y")) {
			you.prog();
		}
		while (alive) {
			SextonMobClass bad = mobs[randNum.nextInt(mobs.length)];
			System.out.println("you have entered the "+bad.getBiome()+"! good luck, "+you.getName());
			//possible random biome text about encountering mob
			
			System.out.println("you have encountered a "+bad.getName()+"! do you want to fight it? (y/n)");
			if (kb.nextLine().equals("y")) {
				comb = true;
				System.out.println("you have entered combat with the "+bad.getName()+". it hits you for "+bad.getDmg());
				while (comb) {
					you.subHealth(bad.getDmg());
					System.out.println("you take a whopping "+bad.getDmg()+" from the "+bad.getName());
					wait(kb);
					bad.takeDam(you.getDmg());
					
					System.out.println("you smack the "+bad.getName()+" for "+you.getDmg());
					wait(kb);
					if (bad.getHealth() <= 0) {
						alive = false;
						System.out.println("Oh dear, you are dead!");
						comb = false;
					}else if (you.getHealth() <= 0) {
						System.out.println("you have beaten the "+bad.getName());	
						wait(kb);
						comb = false;
					} 
					
					
					
				}
			}
		}
		
		
		
		

	}
	
	public static void wait(Scanner kb) {
		System.out.print("Enter to Continue");
		String foo = kb.nextLine();
	}

}
