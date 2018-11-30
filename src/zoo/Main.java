package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Zoo newZoo = new Zoo();
		List<Animal>zooList = newZoo.makeAnimalList();
		
		newZoo.printAnimalInfo(newZoo.listBirds(zooList));
		System.out.println();
		newZoo.printAnimalInfo(newZoo.listMammals(zooList));

	}

}
