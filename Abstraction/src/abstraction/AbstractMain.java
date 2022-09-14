package abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		Penguin p1 = new Penguin();
		p1.animalSound();
		p1.eat();
		p1.sleep();
		p1.drink();

		System.out.println("\n***********************\n");
		Animal a1 = new Meerkat();
		a1.animalSound();
		a1.eat();
		a1.sleep();
		a1.drink();

		System.out.println("\n***********************\n");

		Zebra z1 = new Zebra();
		z1.animalSound();
		z1.setLiveBirth(true);
		z1.sleep();
		z1.setHairFurType("coarse, black and white OR brown and white striped or patchy (very rare)");
		z1.setFedMilk("From mother");
		z1.drink();
		z1.eat();
		System.out.println(z1);
	}

}
