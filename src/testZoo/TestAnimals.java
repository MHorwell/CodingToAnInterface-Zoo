package testZoo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import zoo.*;

public class TestAnimals {
	
	
	
	@Test
	public void testOwlNoise() {
		Owl birdOne = new Owl("Owlbert", 50);
		assertEquals("Hoot",birdOne.makeNoise());
	}
	
	@Test
	public void testCatNoise() {
		Cat mammalOne = new Cat("Milo", 50);
		assertEquals("Meow",mammalOne.makeNoise());
	}
	
	@Test
	public void testDogNoise() {
		Dog mammalTwo = new Dog("Benji",40);
		assertEquals("Bark",mammalTwo.makeNoise());
	}
	
	@Test
	public void testThornberryNoise() {
		Thornberry mammalThree = new Thornberry("Nigel", 0);
		assertEquals("Smashing!",mammalThree.makeNoise());
	}
	
	@Test
	public void testCrow() {
		Crow birdTwo = new Crow("Woody", 20);
		assertEquals("Caw", birdTwo.makeNoise());
	}
	
	@Test
	public void testListBirds() {
		Zoo zoo = new Zoo();
		zoo.makeAnimalList();
		List<Bird> birdList = new ArrayList<Bird>();
		birdList.add(zoo.Woody);
		birdList.add(zoo.Owlbert);
		assertEquals(birdList, zoo.listBirds(zoo.makeAnimalList()));
	}
	
	@Test
	public void testListMammals() {
		Zoo zoo = new Zoo();
		zoo.makeAnimalList();
		List<Mammal> mammalList = new ArrayList<Mammal>();
		mammalList.add(zoo.Benji);
		mammalList.add(zoo.Milo);
		mammalList.add(zoo.Nigel);
		assertEquals(mammalList, zoo.listMammals(zoo.makeAnimalList()));
	}
	

}
