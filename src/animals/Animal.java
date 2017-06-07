package animals;

// does it ever make sense to just make an animal?
// answer is no - we always want to make a specific animal
// this is why we make this an *abstract* class
// abstract classes can't be instantiated
public abstract class Animal {
	// protected from things:
	// - outside of the class hierarchy
	// - outside of the package
	// (must be same package or a subclass to access)

	private String food;
	protected int hunger = 50;
	private Object boundaries;
	private Object location;

	// public Animal() {
	// System.out.println("animal constructor called ");
	// }

	public Animal(String preferredFood) {
		this.food = preferredFood;
		System.out.println(this + " likes to eat " + food);
	}

	// this indicates that animals make noise
	// in an interface this would look like:
	// void makeNoise();
	public abstract void makeNoise();

	public void feed(String food) {
		if (this.food == food) {
			eat();
		} else {
			System.out.println("I don't eat " + food + "!");
		}
	}

	public void eat() {
		System.out.println("yum");
		hunger -= 5;
	}

	public void sleep() {
		System.out.println("zzz...");
	}

	public void roam() {
		System.out.println("wander");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ", hunger is " + hunger; 
		// returns the object of this class - class is the object that describes the class
	}

}
