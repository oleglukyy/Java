package EjercicioPokemons;

public class Bulbasaur extends Pokemon implements IGrass {

	public Bulbasaur() {

	}

	@Override
	protected void attackBlock() {
		System.out.println("Im Bulbasur and im blocking your attack");
	}

	@Override
	protected void attackScratch() {
		System.out.println("Im Bulbasur and im scratching you");
	}

	@Override
	protected void attackBit() {
		System.out.println("Im Bulbasur and i bit you");

	}

	@Override
	public void attackAbsorb() {
		System.out.println("Im Bulbasur and i Absorb you");

	}

	@Override
	public void attackParalyze() {
		System.out.println("Im Bulbasur and i Paralyze you");

	}

}
