package ppsamy;
import java.util.Scanner;
public class twice 
   {
   	private static Scanner sc;

	 public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[a.length];
        for (int i = 0; i < a.length; i++)
        {
			a[i]=sc.nextInt();
		}
        int temp=1;
        for (int i = 0; i < a.length; i++)
        {
        for (int j = 0; j < a.length; j++) 
        	{
			if(a[i%n]==a[j%n])
			{
				b[i]=temp++;
			}
        	}
		}
        for (int i = 0; i < b.length; i++) 
        {
        	if(b[i]%2==1)
        	{
			System.out.println(a[i]);
			break;
		}
        }
	}
}
