
public class CmdlinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(String arg : args)
		
			//System.out.println(arg);
	 int sum=0;
	 for(String num: args)
		 sum += Integer.parseInt(num);
	 
	 System.out.println("Sum :" +sum);

	
	//Java supports Auto Boxing
	int x=10;
	Integer xo= x; //Boxing
	Integer xp = 50;
	int total = xo+xp+x; //unboxing
	

System.out.println(total);
	
	} 
}
