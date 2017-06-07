package animals;

public class Cow extends Animal {

	// constructor that allows you to pass in preferredFood in application
	public Cow(String preferredFood) {
		super(preferredFood);
		System.out.println("Likes to eat " + preferredFood);
	}
	@Override
	public void makeNoise() {
		System.out.println("mOOOOO");
	}
	
	public boolean wantsCud() {
		return hunger >= 0;
	}
	
	// need to eat grass


}
