import java.util.Arrays;
import java.io.*;
import java.lang.*;
import java.util.*;

class Hello {
    
  public static void main(String args[]){
    System.out.println("Hello world");
    int arr[] = {2,15,11,7};
    int target = 9;
    int solution[] = twoSum(arr, target);
    System.out.println(Arrays.toString(solution));
  }

  public static int[] addX(int n, int arr[], int x)
   {
       int i;
   
       // create a new array of size n+1
       int newarr[] = new int[n + 1];
   
       // insert the elements from
       // the old array into the new array
       // insert all elements till n
       // then insert x at n+1
       for (i = 0; i < n; i++)
           newarr[i] = arr[i];
   
       newarr[n] = x;
   
       return newarr;
   }

  public static int[] twoSum(int arr[], int target){

    int result[] = {};
    for (int i = 0; i < arr.length; i++) {
      
        for (int j = i + 1; j < arr.length; j++) {
            int valeurTarget = arr[i] + arr[j];
          if (valeurTarget == target) {
            //  result = addX(0,result,i);
            //  result = addX(1,result,j);
            return new int[]{i,j};
          }
        }
        
      }
      return result;
  }
}