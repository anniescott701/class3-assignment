
public class reverse {
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int r;
		int rev=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
			
		}
		System.out.print("reverse is:"+rev);
		
	}
	

}
