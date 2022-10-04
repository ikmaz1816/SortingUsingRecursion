package sortedrecursion;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	static void selectionsort(int[] arr,int c,int r,int max)
	{
		if(r==0)
			return;
		if(r>c)
		{
			if(arr[c]>arr[max])
			{
				selectionsort(arr,c+1,r,c);
			}
			else
			{
				selectionsort(arr,c+1,r,max);
			}
		}
		else
		{
			int temp=arr[r-1];
			arr[r-1]=arr[max];
			arr[max]=temp;
			selectionsort(arr,0,r-1,0);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		selectionsort(arr,0,arr.length,0);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
