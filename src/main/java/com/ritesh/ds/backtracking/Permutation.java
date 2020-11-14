package com.ritesh.ds.backtracking;

import org.apache.commons.lang3.StringUtils;

public class Permutation
{
    private static void permute(String str)
    {
        if(StringUtils.isNotBlank(str))
        {
            permute(str, 0, str.length()-1);
        }
    }

    // This permutation will ignore occurrence of "AB" using BackTracking
    private static void permute(String str, int l, int r)
    {
       if(l == r)
       {
           System.out.println(str);
       }
       else
       {
           for(int i = l; i<=r; i++)
           {
               if(isSafe(str, l, i, r)) // BackTracking
               {
                   str = swap(str, l, i);
                   permute(str, l+1, r);
                   str = swap(str, l, i);
               }
           }
       }
    }

    // check for "AB"
    private static boolean isSafe(String str, int l, int i, int r)
    {
        boolean result = true;
        if(l!=0 && str.charAt(l-1)=='A' && str.charAt(l)=='B')
        {
            result = false;
        }
        if(l==r-1
                && (str.charAt(i)=='A' && str.charAt(l)=='B'))
        {
            result = false;
        }
        return result;
    }

    private static String swap(String str, int i, int j)
    {
        String result = null;
        char[] charArray = str.toCharArray();
        char tmp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = tmp;
        result = String.valueOf(charArray);
        return result;
    }

    public static void main(String[] args)
    {
        permute("ABC");
    }
}
