package EjercicioPokemons;

public class Charmander extends Pokemon implements IFire {

	public Charmander() {

	}

	@Override
	protected void attackBlock() {
		System.out.println("Im Charmander and im blocking your attack");

	}

	@Override
	protected void attackScratch() {
		System.out.println("Im Charmander and im scratching you");

	}

	@Override
	protected void attackBit() {
		System.out.println("Im Charmander and i bit you");

	}

	@Override
	public void attackFireHit() {
		System.out.println("Im Charmander and i Fire Hit you");

	}

	@Override
	public void attackFireBall() {
		System.out.println("Im Charmander and i Fire Ball you");

	}

	@Override
	public void attackFireBlast() {
		System.out.println("Im Charmander and i Fire Blast you");

	}

}
