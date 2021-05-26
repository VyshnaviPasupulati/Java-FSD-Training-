import java.util.Arrays;
import java.util.List;

public class Streaming2Demo {
	public static void main(String[] args) {
		String[] ar1 = {"Apple","Banana","WaterMelon","Oranges","Cherry","Mango","Papayya"};
		List<String> strs = Arrays.asList(ar1);
		//strs.forEach(System.out::println);
		
		strs.stream().distinct().forEach(System.out::println);
		
		strs.stream().distinct().sorted().forEach(System.out::println);
		
		
	}

}
