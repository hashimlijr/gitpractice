package com.util;

import java.util.*;

public class MyMath 
{
	public static int gcd(int a, int b) 
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
	
	
	public static int gcd(int[] elements)
	{
		int result = 0;

        for(int element : elements){
            result = gcd(result, element);

            if(result == 1)
                return 1;
        }
        return result;
	}
	
	
	public static long sum(int[] elements)
	{
		long sum = 0;
		for(int element : elements)
		{
			sum += element;
		}
		return sum;
	}
	
	public static long sum(List<Integer> elements)
	{
		long sum = 0;
		for(Integer  element : elements)
		{
			sum += element;
		}
		return sum;
	}
	
	
	public static int min(int a, int b)
	{
		return (a < b) ? a : b;
	}
	
	public static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}
	
	public static long min(long a, long b)
	{
		return (a < b) ? a : b;
	}
	
	public static long max(long a, long b)
	{	
		return (a > b) ? a : b;
	}
	
	public static int max(int[] elements)
	{
		int max = Integer.MAX_VALUE;
		for(int elementValue : elements)
		{
			if(elementValue > max)
				max = elementValue;
		}
		return max;
	}
	
	
	public static int count(int value, int[] elements)
	{
		int counter = 0;
		for(int element : elements)
		{
			if (element == value)
				counter++;
		}
		return counter;
	}
	
	public static int count(double value, double[] elements)
	{
		int counter = 0;
		for(double element : elements)
		{
			if (element == value)
				counter++;
		}
		return counter;
	}
	
	public static int countMax(int[] elements)
	{
		int counter = 0;
		int max = Integer.MAX_VALUE; // autoboxing
		
		for(int element : elements)
		{
			if(element > max)
			{
				counter = 1;
				max = element;
			}
			else if (element == max)
				counter++;
		}
		return counter;
		
	}
	
	public static int countMin(int[] elements)
	{
		int counter = 0;
		int min = Integer.MAX_VALUE; 
		
		for(int element : elements)
		{
			if(element < min)
			{
				counter = 1;
				min = element;
			}
			else if (element == min)
				counter++;
		}
		return counter;
	}
	
	public static int abs(int value)
	{
		return (value < 0) ? -value : value;
	}
	public static double abs(double value)
	{
		return (value < 0) ? -value : value;
	}
	public static long abs(long value)
	{
		return (value < 0) ? -value : value;
	}
	
	
}
