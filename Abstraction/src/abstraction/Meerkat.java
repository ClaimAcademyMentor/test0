package abstraction;

public class Meerkat extends Zoo implements Animal {

	@Override
	public void animalSound() {
		System.out.println("Purr, chatter, squeal");
	}

	@Override
	public void eat() {
		System.out.println("Omnivores (insects and plants");
	}

	@Override
	public void drink() {
		System.out.println("Water");

	}

	@Override
	public void sleep() {
		System.out.println("Diurnal, underground");
	}

	@Override
	public void reachOut() {
		// TODO Auto-generated method stub
		
	}

}
