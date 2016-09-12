package ppsamy;

import java.util.Scanner;

public class Tallest 
 {
   public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[50];
	for (int i = 0; i < a.length; i++)
	{
		a[i]=sc.nextInt();
	}
	int temp=0;
	for (int i = 0; i < a.length; i++) 
	{
	for (int j = i+1; j < a.length; j++)
	{
		if(a[i]>=a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}	
	}
	for (int i = 0; i < a.length; i++)
	{
	System.out.println(a.length-4);	
	break;
	}
}
}
