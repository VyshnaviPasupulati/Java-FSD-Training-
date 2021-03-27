
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,4,5};
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
		
		
		int[][] jagg= {{1,2}, {3,4,5}, {6,7,8,9}};
		for(int i=0;i<jagg.length;i++)
		{
			for(int j=0;j<jagg[i].length;j++)
			{
				System.out.print(jagg[i][j] +"\t");
				
			}
			System.out.println();
			}

	}

}
