package EjercicioPokemons;

public class Main {
	public static void main(String[] args) {

		Squirtle squirtle = new Squirtle();
		Bulbasaur bulbasaur = new Bulbasaur();
		Charmander charmander = new Charmander();
		Pikachu pikachu = new Pikachu();

		squirtle.attackBit();
		charmander.attackBit();
		bulbasaur.attackAbsorb();
		pikachu.attackThunderBolt();

	}

}
