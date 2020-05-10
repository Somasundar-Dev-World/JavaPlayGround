package com.spacensolutions.java.playground.passbyvalue;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
// 1234 + 567 = 1801
arr1 = [1,2,3,4]
arr2 = [5,6,7]
def addArrays(arr1, arr2):
    ...
    return result
addArrays(arr1, arr2)
> [1,8,0,1]
*/

public class AddArrayValues {
    public static void main(String args[] ) throws Exception {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int[] array1 = {1,2,3,4}; //n
        int[] array2 =   {5,6,7}; //m

        AddArrayValues addArrayValues = new AddArrayValues();
        int[] result = addArrayValues.calculate(array1, array2);
        System.out.println(" ======= result ====="+result.length);
        for (int i=0; i < result.length; i++ ) {
            System.out.println(result[i]);
        }
    }

    public int[] calculate(int[] a, int[] b) {
        int aLength = a.length-1;
        int bLength = b.length-1;

        if (aLength > bLength)
            return calculateSumUtil(a, b, aLength, bLength);
        else
            return calculateSumUtil(b, a, bLength, aLength);
    }

    public int[] calculateSumUtil(int[] a, int[] b, int n, int m) {

        int[] sumarray = new int[n+1];
        int k = n;
        int carry = 0, sum = 0;

        while( m >= 0 ) {

            sum = a[n] + b[m] + carry;
            sumarray[k] = sum % 10;
            carry = sum / 10;
            System.out.println(sumarray[k]);
            m--;
            k--;
            n--;

        }

       while ( n >= 0 ) {

            sum = a[n] + carry;
            sumarray[k] = sum % 10;
            carry = sum / 10;
            System.out.println(sumarray[n]);
            n--;
            k--;
        }
        return sumarray;
    }
}