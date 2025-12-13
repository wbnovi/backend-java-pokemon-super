package Pokemon;

public class ElectricPokemon extends Pokemon {
	private String type;
	private String typeIcon;
	private String strongAgainst;
	private String weakAgainst;

	public ElectricPokemon(String name, int level, float hp, float xp) {
		super(name, level, hp, xp);
		type = "Electric";
		typeIcon = "\uD83D\uDD25";
		strongAgainst = "Water";
		weakAgainst = "Grass";
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

	public void makeFire() {
		System.out.println("Something is burning...");
		System.out.println(this.getName() + " made fire!");
	}

	public void lightCigar() {
		System.out.println(this.getName() + "lit a cigar!");
	}

	@Override
	public void doNothing() {
		System.out.println(this.getName() + " is doing nothing but the sparks are flying!");
	}

	@Override
	public String toString() {
		return "ElectricPokemon{" +
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
