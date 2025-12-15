package Pokemon;

public class GrassPokemon extends Pokemon {
	private String type;
	private String typeIcon;
	private String strongAgainst;
	private String weakAgainst;

	public GrassPokemon(String name, int level, float hp, float xp) {
		super(name, level, hp, xp);
		type = "Grass";
		typeIcon = "\uD83C\uDF3F";
		strongAgainst = "Water";
		weakAgainst = "Fire";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeIcon() {
		return typeIcon;
	}

	public void setTypeIcon(String typeIcon) {
		this.typeIcon = typeIcon;
	}

	public String getStrongAgainst() {
		return strongAgainst;
	}

	public void setStrongAgainst(String strongAgainst) {
		this.strongAgainst = strongAgainst;
	}

	public String getWeakAgainst() {
		return weakAgainst;
	}

	public void setWeakAgainst(String weakAgainst) {
		this.weakAgainst = weakAgainst;
	}

	public void doGrow() {
		System.out.println("Something is emits an earthy grounded aura...");
		System.out.println(this.getName() + " did grow");
	}

	public void makeShade() {
		System.out.println(this.getName() + " obstructed sunshine with a big leaf!");
	}

	@Override
	public void doNothing() {
		System.out.println(this.getName() + " is doing nothing with earthy style!");
	}

	@Override
	public String toString() {
		return "GrassPokemon{" +
				"name='" + this.getName() + '\'' +
				", level=" + this.getLevel() +
				", hp=" + this.getHp() +
				", xp=" + this.getXp() +
				", type='" + type + '\'' +
				", typeIcon='" + typeIcon + '\'' +
				", strongAgainst='" + strongAgainst + '\'' +
				", weakAgainst='" + weakAgainst + '\'' +
				'}';
	}
}
