
public class even {
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int i;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{  
				System.out.println("even numbers are:"+i);
			}
		}
	}

}
