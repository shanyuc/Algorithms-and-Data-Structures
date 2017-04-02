import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
        
    public static void swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
            
    public static String reverse(String str){
        int l = 0, r = str.length()-1;
        char[] strArray = str.toCharArray();
        while(l<r){
            swap(strArray, l,r);
            l++;
            r--;
        }
        return new String(strArray);
                                                        
    }
                
                
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(reverse("abcdefg"));
    }
}

