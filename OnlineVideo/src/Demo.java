import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		Map<String, String> mp = new HashMap<>();
		mp.put("Name", "Prakash");
		mp.put("Age", "28");
		mp.put("Degree", "BE");

		Set<String> keys = mp.keySet();

		for (String key : keys) {

			System.out.println(key + " " + mp.get(key));

		}

	}

}
