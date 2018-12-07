package testZoo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import zoo.*;

public class TestAnimals {
	
	Zoo testZoo = new Zoo();
	Owl testOwl = new Owl("owl", 1);
	Crow testCrow = new Crow("crow", 1);
	Cat testCat = new Cat("cat", 1);
	Dog testDog = new Dog("dog", 1);
	Thornberry testThornberry = new Thornberry("Nigel", 0);

	
	
	@Test
	public void testOwlNoise() {
		assertEquals("Owl noise doesn't match","Hoot",testOwl.makeNoise());
	}
	
	@Test
	public void testCatNoise() {
		assertEquals("Cat noise doesn't match","Meow",testCat.makeNoise());
	}
	
	@Test
	public void testDogNoise() {
		assertEquals("Dog noise doesn't match","Bark",testDog.makeNoise());
	}
	
	@Test
	public void testThornberryNoise() {
		assertEquals("Thornberry noise doesn't match","Smashing!",testThornberry.makeNoise());
	}
	
	@Test
	public void testCrow() {
		assertEquals("Crow noise doesn't match", "Caw", testCrow.makeNoise());
	}
	
	@Test
	public void testAnimalOutput() {
		assertEquals("Statements don't match","Name: crow, Species: Crow, Present? Caw", testCrow.toString());
	}
	
	@Test
	public void testGetWingspan() {
		assertEquals("Wingspan doesn't match",1, testCrow.getWingSpan());
	}
	
	@Test
	public void testGetTailLength() {
		assertEquals("Tail length doesn't match",0, testThornberry.getTailLength());
	}
	
	@Test
	public void testListBirds() {
		testZoo.add(testOwl);
		testZoo.add(testCrow);
		testZoo.add(testThornberry);
		List<Bird> birdList = new ArrayList<>();
		birdList.add(testOwl);
		birdList.add(testCrow);
		assertEquals("Lists don't match",birdList, testZoo.filterByAnimal(Bird.class));
	}
	
	@Test
	public void testListMammals() {
		testZoo.add(testCrow);
		testZoo.add(testThornberry);
		testZoo.add(testDog);
		testZoo.add(testCat);
		List<Mammal> mammalList = new ArrayList<>();
		mammalList.add(testThornberry);
		mammalList.add(testDog);
		mammalList.add(testCat);
		assertEquals("Lists don't match",mammalList, testZoo.filterByAnimal(Mammal.class));
	}
	

}
