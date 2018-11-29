package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Animals> zooList = new ArrayList<Animals>();
		zooList.add(new Dog("Benji", 40));
		zooList.add(new Cat("Milo", 10));
		zooList.add(new Thornberry("Nigel", 0));
		zooList.add(new Crow("Woody", 20)); 
		zooList.add(new Owl("Owlbert", 50));

		List<Animals> mammalList = zooList.stream().filter(animal -> animal instanceof Mammal)
				.collect(Collectors.toList());
		List<Animals> birdList = zooList.stream().filter(animal -> animal instanceof Birds)
				.collect(Collectors.toList());
		
		for (Animals animals : mammalList) {
			System.out.println("Name: " + 
					animals.name + ", Species: " + 
					animals.getClass().getSimpleName()  + ", Present? " +
					animals.makeNoise());
		}
		
		for (Animals animals : birdList) {
			System.out.println("Name: " + 
					animals.name + ", Species: " + 
					animals.getClass().getSimpleName()  + ", Present? " +
					animals.makeNoise());
		}

	}
}
