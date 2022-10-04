package sortedrecursion;

import java.util.Scanner;

public class Pattern1 {
	static void pattern(int c,int r)
	{
		if(r==0)
			return;
		if(r>c)
		{
			System.out.print("*");
			pattern(c+1,r);
		}
		else
		{
			System.out.println();
			pattern(0,r-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pattern(0,n);
		sc.close();
	}

}
