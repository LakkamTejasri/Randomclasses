import java.util.*;
public class r4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		for(int i=1;i<=100;i++)
		{
			int n=r.nextInt(6)+1;
			System.out.println(n);
		}

	}

}
