import java.util.Random;


public class r10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Random r=new Random();
		for(int i=1;i<=100;i++)
		{
			int n=r.nextInt(8)+1;
			System.out.println(n);
			sum=sum+n;
			
			
		}
		System.out.println(sum);

	}

}
