//Java program to generate a distinct coupon number

package com.bridgelabz.demo;

public class CouponNumber{
    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  
        int count = 0;        
        int distinct  = 0;                       

        while (distinct < n) {
            int value = (int) (Math.random() * n);           
            count++;                             
            if (!isCollected[value]) {          
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    	int n = Integer.parseInt(args[0]);
        int count = collect(n);
        System.out.println(count);
    } 
} 