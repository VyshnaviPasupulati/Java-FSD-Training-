import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamingDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Integer[] ar= {2,3,3,7,9};
		//String[] ar1 = {"Apple","Banana","WaterMelon","Oranges"};
		List<Integer> numbers = Arrays.asList(ar);
		//List<String> strs = Arrays.asList(ar1);
		numbers.forEach(System.out::println);
		//numbers.forEach(StreamingDemo ::print);
		
		Stream<Integer> str = numbers.stream().distinct();
		//str.forEach(System.out::println);
	//	System.out.println(str.count());
		
		//Stream<Integer> str2 = numbers.stream().filter(n-> n>=5);
		//str2.forEach(System.out:: println);
		
		numbers.stream().limit(3).forEach(System.out::println);
		numbers.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println(numbers.stream().reduce(0,Integer::sum));
	}

}
