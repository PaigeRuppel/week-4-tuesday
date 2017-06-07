package animals;

public class Hippo extends Animal {

	// constructor that auto sets preferredFood (as per the constructor in the super class)
	public Hippo() {
		super("water plants");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("REAWERERRRZZZSHNUH");
	}
	
	
}
