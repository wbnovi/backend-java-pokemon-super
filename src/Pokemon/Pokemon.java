package Pokemon;

public class Pokemon {
	private String name;
	private int level;
	private float hp;
	private float xp;

	public Pokemon(String name, int level, float hp, float xp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.xp = xp;
	}

	public Pokemon() {
		this.name = "New Pokemon";
		this.level = 1;
		this.hp = 10;
		this.xp = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public void levelUp() {
		setLevel(this.getLevel() + 1);
		System.out.println("OI!!!");
		System.out.println("What is happening???");
		System.out.print("Looks like " + this.getName() + " is levelling UP!\n");
		System.out.println("...");
		System.out.println("!!!");
		System.out.print(this.getName() + " went from level " + (this.getLevel() - 1) + " to level " + this.getLevel());
		System.out.println("!!!");
	}

	public void doNothing() {
		System.out.println(this.getName() + " is doing nothing!");
	}

	public void doMove() {
		System.out.println(this.getName() + " is moving!");
	}

	@Override
	public String toString() {
		return "Pokemon{" +
				"name='" + name + '\'' +
				", level=" + level +
				", hp=" + hp +
				", xp=" + xp +
				'}';
	}
}
