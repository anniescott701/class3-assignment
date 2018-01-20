
public class armstrong {
	 public static void main(String[] args)  
	 {  
		    int c=0,a,num;  
		    int n=Integer.parseInt(args[0]);
		    num=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(num==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
		}  



