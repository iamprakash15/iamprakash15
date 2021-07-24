import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CollectionLearning {

	private static HashMap<Object, Object> dMap = new HashMap<>();
	private int number;
	
	public int userInput() {
		int number = 0;
		try {
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Kindly enter any number between 1- 5 to display HashMap: ");
			this.number = scanner.nextInt();
			
		} catch (Exception e) {
			System.out.println("User is unable to enter value. Error: " + e);
		}
		return number;
		
	}
	
	public void display(int number) {
		
		this.userInput();

		switch (this.number) {
		case 1: {
			// using for-each loop for iteration over Map.entrySet()
			for (Map.Entry<Object, Object> entry : dMap.entrySet()) {
				System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
			}
		}
		
			break;
		case 2: {
			// using keySet() for iteration over keys
			for (Object name : dMap.keySet()) {
				System.out.println("Key: " + name);
			}
			// using values() for iteration over values
			for (Object value : dMap.values()) {
				System.out.println("Value: " + value);
			}
		}
			break;
		case 3: {
			// using iterators
			Iterator<Map.Entry<Object, Object>> iterator = dMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<Object, Object> entry = iterator.next();
				System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			}
		}
			break;
		case 4: {
			// forEach(action) method to iterate map
			dMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

		}
			break;
		case 5: {
			// looping over keys
			for (Object key : dMap.keySet()) {
				// search for value
				Object name = dMap.get(key);
				System.out.println("Key: " + key + ", Value:" + name);
			}
		}
			break;
		default: {
			System.out.println(
					"Entered number does not match with number between 1-5. Please try again with correct number.");
		}
		}
	}

	public static void main(String[] args) {
		
		

		HashMap<Object, Object> map = new HashMap<>();
		for (int i = 0; i < 20; i++) {
			map.put("NAME[" + i + "]", "Prako[" + i + "]");
		}

		dMap.putAll(map);
		
		CollectionLearning cl = new CollectionLearning();
		
		cl.userInput();

			

			
	}
}
