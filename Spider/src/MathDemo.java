@FunctionalInterface
interface Maths{
	int max(int a, int b);
}
public class MathDemo {

	public static void main(String[] args) {
		Maths m =(x,y)->{
			if(x>y)
		       return x;
			else
				return y;
		};
        System.out.println(m.max(10, 15));
        
        Maths m2 = (p,q)-> p > q ? p :q ;
        System.out.println(m2.max(10, 23));
	}

}
