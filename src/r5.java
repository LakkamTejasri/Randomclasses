import java.util.*;
public class r5 {
	public static void main(String[] args)
	{	int c=1;
		Random r=new Random();
		for(int i=1;i<=100;i++)
		{
		int n=r.nextInt(6)+1;
		if(n==6)
		{
			c++;
			
		}
		
	}
		System.out.println(c);
	}
}
