package com.util;

import java.util.*;

public class MyMatch 
{
	static int gcd(int a, int b) 
	{
		if(a == 0) return b;
        if(b == 0) return a;
        
		int min = java.lang.Math.min(a, b);
		int max = (a + b) - min;
		
		while(true)
		{
			if(max % min == 0)
				return min;
			
			int temp = max % min;
			max = min;
			min = temp;
		}
		
	}
	
	
	static int gcd(int[] elements)
	{
		int result = 0;

        for(int element : elements){
            result = gcd(result, element);

            if(result == 1)
                return 1;
        }
        return result;
	}
	
	
	static long sum(int[] elements)
	{
		long sum = 0;
		for(int element : elements)
		{
			sum += element;
		}
		return sum;
	}
	
	static long sum(List<Integer> elements)
	{
		long sum = 0;
		for(Integer  element : elements)
		{
			sum += element;
		}
		return sum;
	}
	
	
	static int min(int a, int b)
	{
		return (a < b) ? a : b;
	}
	
	static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}
	
	static long min(long a, long b)
	{
		return (a < b) ? a : b;
	}
	
	static long max(long a, long b)
	{	
		return (a > b) ? a : b;
	}
	
	
	
	
}
