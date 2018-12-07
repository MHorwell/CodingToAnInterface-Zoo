package zoo;

public abstract class Mammal extends Animal {
	//Attributes
	private int tailLength;
	
	//Constructors
	public Mammal(String name, int tailLength) {
		super(name);
		this.tailLength = tailLength;
	}
	
	//Methods
	public int getTailLength() {
		return this.tailLength;
	}


}
