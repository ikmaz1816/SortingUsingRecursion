package sortedrecursion;

import java.util.Scanner;

public class Pattern2 {
	static void pattern(int c,int r)
	{
		if(r==0)
			return;
		if(r>c)
		{
			pattern(c+1,r);
			System.out.print("*"+" ");
		}
		else
		{
			pattern(0,r-1);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pattern(0,n);
		sc.close();

	}

}
