@FunctionalInterface
public interface Hello {
	String sayHello();
    default void sayHola() {
		System.out.println("Hola");
	}
	static void sayBonjour() {
	   System.out.println("Bonjour");
	}
	  
}
class HelloDemo{
	public static void main(String[] args) {
		Hello h = ()-> "Hello World";
		System.out.println(h.sayHello());
		
		// Another Way to write lambda expression with { }
		//If we are using {} then return is must
		Hello h2 = ()-> {      
			String msg = "Hello again!";
			return msg;
		};
		System.out.println(h2.sayHello());
		//when using default we need to call method with object only
		h2.sayHola();
		
		//while using static we can call the method itself
		Hello.sayBonjour();
	}
}
