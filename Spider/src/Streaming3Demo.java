import java.util.HashMap;
import java.util.Map;

public class Streaming3Demo {
	public static void main(String[] args) {
		Map<String, String> people  = new HashMap<String, String>();
		people.put("polo", "pune");
		people.put("Mila","Mumbai");
		people.put("Ashton","California");
		people.values().stream().forEach(System.out::println);
	}

}
