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
public class MAIN {
        static int binarySearch(int arr[], int low, int high, int key) 
    { 
        if (high < low) 
            return -1; 
        int mid = (low + high) / 2; 
        if (key == arr[mid]) 
            return mid; 
        if (key > arr[mid]) 
            return binarySearch(arr, (mid + 1), high, key); 
        return binarySearch(arr, low, (mid - 1), key); 
    } 
         public static void main(String[] args) 
    { 
        int arr[] = { 5, 6, 7, 8, 9, 10 }; 
        int n, key; 
        n = arr.length - 1; 
        key = 10; 
  
        System.out.println("Index: " + binarySearch(arr, 0, n, key)); 
    } 
} 
    
