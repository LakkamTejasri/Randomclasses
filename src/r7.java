import java.util.*;
public class r7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Random r=new Random();
		for(int i=1;i<=20;i++)
		{
			int n=r.nextInt(6)+1;
			if(n==3)
			{		
				c++;
				System.out.println(n);
				System.out.println("omg");
			}
		}
		System.out.println(c);
	}

}
