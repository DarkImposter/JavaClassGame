/*
 * Parker Sexton
 * 4/19/19
 * class for the enemy
 */
public class SextonMobClass {
	private String name;
	private int health;
	private int dmg;
	private int lvl;
	private String biome;
	
	public SextonMobClass () {
		name = "Stick";
		health = 1;
		dmg = 1;
		lvl = 1;
		biome = "Forest";
		
	}
	public SextonMobClass(String nm, int h, int d, int l, String b) {
		name = nm;
		health = h;
		dmg = d;
		lvl = l;
		biome = b;
	}
	//setters
	public void setName(String nm) {
		name = nm;
	}
	public void sethealth(int h) {
		health = h;
	}
	public void setDmg(int d) {
		dmg = d;
	}
	public void setLvl(int l) {
		lvl = l;
	}
	public void setBiome(String b) {
		biome = b;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getDmg() {
		return dmg;
	}
	public int getLvl() {
		return lvl;
	}
	public String getBiome() {
		return biome;
	}
	
	public void takeDam(int d) {
		health -= d;
	}
	
}
