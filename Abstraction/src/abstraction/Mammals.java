package abstraction;

public class Mammals {

	private boolean liveBirth;
	private String hairFurType;
	private String fedMilk;

	public Mammals() {

	}

	public Mammals(boolean liveBirth, String hairFurType, String fedMilk) {
		super();
		this.liveBirth = liveBirth;
		this.hairFurType = hairFurType;
		this.fedMilk = fedMilk;
	}

	public boolean isLiveBirth() {
		return liveBirth;
	}

	public void setLiveBirth(boolean liveBirth) {
		this.liveBirth = liveBirth;
	}

	public String getHairFurType() {
		return hairFurType;
	}

	public void setHairFurType(String hairFurType) {
		this.hairFurType = hairFurType;
	}

	public String getFedMilk() {
		return fedMilk;
	}

	public void setFedMilk(String fedMilk) {
		this.fedMilk = fedMilk;
	}

	@Override
	public String toString() {
		return "Mammals [liveBirth=" + liveBirth + ", hairFurType=" + hairFurType + ", fedMilk=" + fedMilk + "]";
	}

}
