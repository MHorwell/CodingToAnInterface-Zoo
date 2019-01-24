package zoo;


public abstract class Animal implements AnimalNoise{
	//Attributes
	protected String name;
	
	
	//Constructors
	public Animal(String vName) {
		this.name = vName;
	}
	
	//Methods
	public boolean isInstance(Class<?> animalType) {
			return animalType.isInstance(this);
	}

	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Species: " + this.getClass().getSimpleName()
						+ ", Present? " + this.makeNoise();
		}
		
		
}
