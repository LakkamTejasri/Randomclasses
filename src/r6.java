import java.util.*;
public class r6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Random r=new Random();
		for(int i=1;i<=1000;i++)
		{
			int n=r.nextInt(6)+1;
			int s=r.nextInt(6)+1;
			if(n==1 && s==1)
			{
				c++;
			 System.out.println(n+","+s);
			}
			
		}
		System.out.println(c);

	}

}
