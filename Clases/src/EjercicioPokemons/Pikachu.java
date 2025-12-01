package EjercicioPokemons;

public class Pikachu extends Pokemon implements IElectric {

	public Pikachu() {
	}

	@Override
	protected void attackBlock() {
		System.out.println("Im Pikachu and im blocking your attack");

	}

	@Override
	protected void attackScratch() {
		System.out.println("Im Pikachu and im scratching you");

	}

	@Override
	protected void attackBit() {
		System.out.println("Im Pikachu and i bit you");

	}

	@Override
	public void attackThunderBolt() {
		System.out.println("Im Pikachu and i Thunder Bolt you");

	}

	@Override
	public void attackThunderHit() {
		System.out.println("Im Pikachu and i Thunder Hit you");

	}

}
