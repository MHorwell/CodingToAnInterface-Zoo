package zoo;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Zoo newZoo = new Zoo();
		newZoo.add(new Owl("Whiskers", 50));
		newZoo.add(new Crow("Mr. Mann", 30));
		newZoo.add(new Cat("Sandy Hogg", 24));
		newZoo.add(new Dog("Mavis Borg", 89));
		newZoo.add(new Thornberry("Nigel", 0));

		List<Animal> mammalList = newZoo.filterByAnimal(Mammal.class);
		for (Animal a : mammalList) {
			System.out.println(a);
		}
	}
}
