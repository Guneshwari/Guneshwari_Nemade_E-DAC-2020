/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;

/**
 *
 * @author HP
 
*
*/
class ArrayTest
{
   public static void main(String[] args)
      {
      long[] arr;                  // reference to array
      arr = new long[100];         // make array
      int n = 0;              // number of items
      int j;                       // loop counter
      long searchKey;              // key of item to search for
//----------------------------------------------------------------
      arr[0] = 77;                 // insert 10 items
      arr[1] = 99;
      arr[2] = 44;
      arr[3] = 55;
      arr[4] = 22;
      arr[5] = 88;
      arr[6] = 11;
      arr[7] = 00;
      arr[8] = 66;
      arr[9] = 33;
      n = 10;                 // now 10 items in array
//----------------------------------------------------------------
      for(j=0; j<n; j++)      // display items
         System.out.print(arr[j] + " ");
      System.out.println("");
//----------------------------------------------------------------
      searchKey = 66;              // find item with key 66
      for(j=0; j<n; j++)          // for each element,
         if(arr[j] == searchKey)       // found item?
            break;                     // yes, exit before end
      if(j == n)                  // at the end?
         System.out.println("Can't find " + searchKey); // yes
      else
         System.out.println("Found " + searchKey);      // no
//----------------------------------------------------------------
      searchKey = 55;              // delete item with key 55
      for(j=0; j<n; j++)           // look for it
      if(arr[j] == searchKey)
         break;
      for(int k=j; k<n; k++)       // move higher ones down
         arr[k] = arr[k+1];
      n--;                         // decrement size
//----------------------------------------------------------------
      for(j=0; j<n; j++)      // display items
         System.out.print( arr[j] + " ");
      System.out.println("");
      }  // end main()
   }  // end class ArrayTest