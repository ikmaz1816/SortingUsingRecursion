package sortedrecursion;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void bubblesort(int[] arr,int c,int r)
	{
		if(r==0)
			return;
		if(r>c)
		{
			if(arr[c]>arr[c+1])
			{
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
				bubblesort(arr,c+1,r);
			}
		}
		bubblesort(arr,0,r-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubblesort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
