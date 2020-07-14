package com.ritesh.ds.recursion;

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

    private static void permute(String str, int l, int r)
    {
       if(l==r)
       {
           System.out.println(str);
       }
       else
       {
           for(int i = l; i<=r; i++)
           {
               str = swap(str, l, i);
               permute(str, l+1, r);
               str = swap(str, l, i);
           }
       }
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
