package abstraction;

public class Penguin extends Mammals implements Animal {

	@Override
	public void animalSound() {
		System.out.println("Broken RC car");
	}

	@Override
	public void eat() {
		System.out.println("Pescatarian");
	}

	@Override
	public void drink() {
		System.out.println("Water");
	}

	@Override
	public void sleep() {
		System.out.println("Standing up or in the water, many naps");
	}

}
