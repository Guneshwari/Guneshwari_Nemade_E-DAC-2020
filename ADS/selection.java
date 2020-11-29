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

class selection
{
    public static void main(String args[])
    {
    int arr[]={56,75,83,63,51,31,41,71,81,10,91,21};
    int n=arr.length;
 
    for(int i=0;i<n-1;i++)
    {
      for( int j=i+1;j<n;j++)
      {
          if(arr[i]>arr[j])
          {
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
          }
      }
    }
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }
}

