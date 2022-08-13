package com.ritesh.org.opentext;

import org.apache.commons.lang3.StringUtils;

public class Pangram
{
    public static void main(String[] args)
    {
        String str = "abcdef ghijkl mnopqr stuvwx yz";
        System.out.println(str+" is pangram: "+isPangram(str));
    }

    private static boolean isPangram(String ipString)
    {
        boolean result = true;
        if(StringUtils.isBlank(ipString))
        {
            return false;
        }
        ipString = ipString.toLowerCase();
        boolean[] trackingArray = new boolean[26];
        for(int i=0; i<ipString.length(); i++)
        {
            if(ipString.charAt(i) !=" ".charAt(0))
            {
                int index = ipString.charAt(i)-'a';
                trackingArray[index] = true;
            }
        }
        for(int i =0; i<trackingArray.length; i++ )
        {
            if(!trackingArray[i])
            {
                result = false;
                break;
            }
        }
        return result;
    }
}
