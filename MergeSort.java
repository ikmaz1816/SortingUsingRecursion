package sortedrecursion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void merge(int[] arr,int start,int mid,int end)
	{
		int[] arr1=new int[end-start];
		int i=start;
		int j=mid;
		int k=0;
		while(i<mid && j<end)
		{
			if(arr[i]>arr[j])
			{
				arr1[k]=arr[j];
				j++;
			}
			else
			{
				arr1[k]=arr[i];
				i++;
			}
			k++;
		}
		while(i<mid)
		{
			arr1[k]=arr[i];
			i++;
			k++;
		}
		while(j<end)
		{
			arr1[k]=arr[j];
			j++;
			k++;
		}
		
		for(int o=0;o<arr1.length;o++)
		{
			arr[o+start]=arr1[o];
		}
	}
	public static void mergesort(int[] arr,int start,int end)
	{
		if(end-start==1)
			return;
		int mid=(start+end)/2;
		mergesort(arr,start,mid);
		mergesort(arr,mid,end);
		merge(arr,start,mid,end);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		mergesort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
