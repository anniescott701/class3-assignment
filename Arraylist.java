

public class Arraylist {

	public static void main(String[] args) 
	{
		int i;
		int n=Integer.parseInt(args[0]);
		int a[]= {1,4,6,7,8,9,10};
		for(i=0;i<a.length;i++)
		{
		if(a[i]==n)
		{
			System.out.println("Number is presesnt");
			break;
		}
		}

	}

}
