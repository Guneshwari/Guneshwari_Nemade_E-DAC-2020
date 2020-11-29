/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;

/**
 *
 * @author HP
 */

public class bubblesort
{ 
	void bubbleSort(int a[])
	{ int len=a.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(a[j]>a[j+1])
				{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
	}
	/*prints the array*/
	void printArray(int a[])
	{
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
			System.out.print(" ");
		}
	}
public static void main(String args[])
{
	bubblesort bo= new bubblesort();
	int a[]= {64,56,22,45,55};
	bo.bubbleSort(a);//calling the bubble sort function
	System.out.print("Sorted array ");
	bo.printArray(a);//calling the printArray function
}
}
