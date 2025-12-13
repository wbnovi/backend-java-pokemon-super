import Pokemon.ElectricPokemon;
import Pokemon.FirePokemon;
import Pokemon.GrassPokemon;
import Pokemon.WaterPokemon;

public class Main {
	public static void main(String[] args) {
		FirePokemon flareon = new FirePokemon("Flareon", 1, 100, 100);
		ElectricPokemon jolteon = new ElectricPokemon("Jolteon", 1, 100, 100);
		GrassPokemon leafeon = new GrassPokemon("Leafeon", 1, 100, 100);
		WaterPokemon vaporeon = new WaterPokemon("Vaporeon", 1, 100, 100);

		System.out.println(flareon.toString());
		flareon.makeFire();
		flareon.lightCigar();
		jolteon.levelUp();
		jolteon.levelUp();
		jolteon.levelUp();
		System.out.println(jolteon.toString());
	}
}
