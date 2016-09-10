import java.util.Arrays;
import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String x=n+"";
		int i=0,c=0;
		int a[]=new int[x.length()];
		while(n>0)
		{
		c=n%10;	
		a[i]=c;
		n=n/10;
		i++;
		}
        Arrays.sort(a);
        System.out.println("Enter number to delete:");
        int g=sc.nextInt();
        for(int y=0;y<g-1;y++)
        {
        	System.out.print(a[y]);
        }
	}

}
