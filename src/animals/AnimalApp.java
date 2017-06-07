package animals;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal hippo = new Hippo();
		Animal cow = new Cow("grass");
		
		System.out.println("Feed the cow and the hippo!");
		hippo.eat();
		cow.eat();
		
		System.out.println("Now the animals are:");
		writeDelimiter(hippo);
		writeDelimiter(cow);
		
		System.out.println("Trying to feed the hippo grass:");
		hippo.feed("grass");
		
		System.out.println("Trying to feed the cow grass:");
		cow.feed("grass");
		
		Animal lion = new Lion();
		
		System.out.println("Trying to feed the lion grass:");
		lion.feed("grass");
		System.out.println("Trying to feed the lion antelope:");
		lion.feed("antelope");
	}

	public static void writeDelimiter(Object o) {
		System.out.println("With " + o);		
	}
	public static void doThings(Animal a) {
		a.eat();
		a.sleep();
		a.roam();
		a.makeNoise();
	}

}
