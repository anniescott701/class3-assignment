
public class Array {
	public static void main(String[] args)
	{
		int arr[]= {0,1,0,1,0,0,1};
		int count_zero=0;
		int i;
		int j;
		int size=arr.length;
		for(i=0;i<size;i++)
		{
			if (arr[i]==0)
				count_zero=count_zero+1;
			
		}
		 for(j=0;j<size;j++)
		 {
			if(j<count_zero) 
			{
				System.out.println("0");
				
			}
			else
			{
				System.out.println("1");
			}
		 }
			
		
				
	}
 
}
