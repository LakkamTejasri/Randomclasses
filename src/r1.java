import java.util.*;
public class r1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hc=1,tc=1;
		Random r=new Random();
		for(int i=1;i<=10;i++)
		{	
		int n=r.nextInt(2);
		{
			if(n==0)
			{
				hc++;
			}
			else
			{
				tc++;
			}
		}
		System.out.println(hc+","+tc);
	}

}
}
