
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello";
		String s2= new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1);
		
		//Here we r comparing address not the content
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		s1=s1+ "World";//When manipulated a new location is assigned to the modified string
		
		
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		System.out.println(s1.replace('o', 'a'));
		System.out.println(s1);
		
		
		String week="mon-tue-wed-thurs-fri-sat-sun";
		String[] days= week.split("-");
		for(int i=0;i<days.length;i++)
			System.out.println(days[i]);

	}

}
