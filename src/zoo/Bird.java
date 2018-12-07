package zoo;

public abstract class Bird extends Animal {
	
	//Attributes
	private int wingSpan;
	
	//Constructors
	public Bird(String vName, int vWingSpan) {
		super(vName);
		this.wingSpan = vWingSpan; 
	}
	
	
	//Methods
	
	public int getWingSpan(){
		return this.wingSpan;
	}


}
