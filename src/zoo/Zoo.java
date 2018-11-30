package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {

	
	public Dog Benji = new Dog("Benji", 40);
	public Cat Milo = new Cat("Milo", 10);
	public Thornberry Nigel = new Thornberry("Nigel", 0);
	public Crow Woody = new Crow("Woody", 20);
	public Owl Owlbert = new Owl("Owlbert", 50);
	
	public List<Animal> makeAnimalList() {
		List<Animal> zooList = new ArrayList<Animal>();
		zooList.add(Benji);
		zooList.add(Milo);
		zooList.add(Nigel);
		zooList.add(Woody);
		zooList.add(Owlbert);

		return zooList;
	}

	public List<Animal> listBirds(List<Animal> animalList) {
		return animalList.stream().filter(animal -> animal instanceof Bird).collect(Collectors.toList());
	}

	public List<Animal> listMammals(List<Animal> animalList) {
		return animalList.stream().filter(animal -> animal instanceof Mammal).collect(Collectors.toList());
	}
	
	public void printAnimalInfo(List<Animal> animalList) {

		for (Animal animals : animalList) {
			System.out.println("Name: " + animals.name + ", Species: " + animals.getClass().getSimpleName()
					+ ", Present? " + animals.makeNoise());
		}
	}



}
