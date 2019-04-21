//Parker Sexton
//4/15/19
// to make a class to keep track of the player
public class SextonPlayerClass {
	private int health;
	private int dmg;
	private String name;
	private int prog;
	
	
	
	
	
	
	public void setName(String n)throws IllegalArgumentException {
		int num = 0;
		for (int counter = 0; counter < n.length(); counter++) {
			if (Character.isLetter(n.charAt(counter))) {
				num++;
			}else {
				throw new IllegalArgumentException();
			}
			if (num == n.length()) {
				name = n;
			}
		}
		
	}
	public void prog() {
		prog++;
	}
	public int getProg() {
		return prog;
	}
	public String getName() {
		return name;
	}
	public void setHealth(int h) {
		health = h;
	}
	public void setDmg(int d) {
		dmg = d;
	}
	public int getHealth() {
		return health;
	}
	public int getDmg() {
		return dmg;
	}
	public void addHealth(int h) {
		health += h;
	}
	public void subHealth(int h) {
		health -= h;
	}
	public void addDmg(int d) {
		dmg += d;
	}
	public void subDmg(int d) {
		dmg -= d;
	}
	
	
}
