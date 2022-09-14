package abstraction;

public class Zebra extends Mammals implements Animal {

	@Override
	public void animalSound() {
		System.out.println("laughter");
	}

	@Override
	public void eat() {
		System.out.println("Grass, leaves, twigs, bark, shrubs");
	}

	@Override
	public void drink() {
		System.out.println("Water");
	}

	@Override
	public void sleep() {
		System.out.println("Diurnal");

	}

}
