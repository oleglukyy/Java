package EjercicioPokemons;

public class Squirtle extends Pokemon implements IWater {

	public Squirtle() {
	}

	@Override
	protected void attackBlock() {
		System.out.println("Im Squirtle and im blocking your attack");

	}

	@Override
	protected void attackScratch() {
		System.out.println("Im Squirtle and im scratching you");

	}

	@Override
	protected void attackBit() {
		System.out.println("Im Squirtle and i bit you");

	}

	@Override
	public void attackHidroExplosion() {
		System.out.println("Im Squirtle and i Hidro explosion you");

	}

	@Override
	public void attackHidroBubble() {
		System.out.println("Im Squirtle and i Hidro Bubble you");

	}

	@Override
	public void attackHidroPistol() {
		System.out.println("Im Squirtle and i Hidro Pistol you");

	}

}
