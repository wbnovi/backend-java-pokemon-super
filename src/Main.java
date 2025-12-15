import Pokemon.ElectricPokemon;
import Pokemon.FirePokemon;
import Pokemon.GrassPokemon;
import Pokemon.WaterPokemon;

public class Main {
	public static void main(String[] args) {
		// INSTANTIATE THE EEVEES
		FirePokemon flareon = new FirePokemon("Flareon", 1, 100, 100);
		ElectricPokemon jolteon = new ElectricPokemon("Jolteon", 1, 100, 100);
		GrassPokemon leafeon = new GrassPokemon("Leafeon", 1, 100, 100);
		WaterPokemon vaporeon = new WaterPokemon("Vaporeon", 1, 100, 100);

		// OVERRIDE METHOD
		System.out.println(flareon.toString());
		System.out.println("================");

		// FIREPOKEMON METHODS
		flareon.makeFire();
		System.out.println("================");
		flareon.lightCigar();
		System.out.println("================");

		// ELECTRIC POKEMON METHODS
		System.out.println(jolteon.toString());
		System.out.println("================");
		jolteon.levelUp();
		System.out.println("================");
		jolteon.levelUp();
		System.out.println("================");
		System.out.println(jolteon.toString());
		System.out.println("================");
		jolteon.doDischarge();
		System.out.println("================");
		jolteon.doPower();
		System.out.println("================");


		// GRASS POKEMON METHODS
		leafeon.doGrow();
		System.out.println("================");
		leafeon.makeShade();
		System.out.println("================");
		System.out.println(leafeon.toString());
		System.out.println("================");
		leafeon.levelUp();
		System.out.println("================");

		// WATER POKEMON METHODS
		vaporeon.makeRain();
		System.out.println("==============");
		vaporeon.waterPlant();
		System.out.println("==============");
		System.out.println(vaporeon.toString());

	}
}
