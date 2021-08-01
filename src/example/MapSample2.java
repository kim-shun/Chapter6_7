package example;

import java.util.HashMap;
import java.util.Map;

public class MapSample2 {

	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<>();
		
		Pet pet1 = new Cat();
		Pet pet2 = new Dog();
		
		petMap.put("佐藤さん", pet1);
		petMap.put("鈴木さん", pet2);
		petMap.put("田中さん", new Cat());
		

	}

}
