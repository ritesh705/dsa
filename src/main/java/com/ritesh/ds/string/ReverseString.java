package com.ritesh.ds.string;

public class ReverseString
{
    public static void main(String[] args)
    {
        String inputStr = "Reverse It";
        System.out.println("Input: "+inputStr);
        System.out.println("Reverse String: "+reverseString("Reverse It"));
    }

    static String reverseString(String ipStr)
    {
        String revString = "";
        for(int l=ipStr.length()-1; l>=0; l--)
        {
            revString = revString+ipStr.charAt(l);
        }
        return revString;
    }
}
