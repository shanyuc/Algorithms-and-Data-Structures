/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int binarySearch(int[] nums, int target){
        return binarySearchHelper(nums, target, 0, nums.length -1);
    }
            
    public static int binarySearchHelper(int[] nums, int target, int l, int r){
        int m = (l+r)/2;
        if(target == nums[m])
            return m;
        if(target > nums[m])
            return binarySearchHelper(nums, target, m, r);
        else
            return binarySearchHelper(nums, target, l, m);
    }
                
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(nums, 6));
    }
}
