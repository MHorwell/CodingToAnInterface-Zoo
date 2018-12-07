package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Zoo {

	private List<Animal> zooInventory;

	public Zoo() {
		zooInventory = new ArrayList<>();
	}

	public void add(Animal a) {
		zooInventory.add(a);
	}

	public List<Animal> filterByAnimal(Class<?> animalType) {
		return zooInventory.stream().filter(animal -> animal.isInstance(animalType)).collect(Collectors.toList());
	}
	
    public List<Animal> getAnimals() {
        return zooInventory;
    }

	

}
