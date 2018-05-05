package com.epam.atm.task1_calculator;
//import java.util.*;
public class CalcOp
{
		
	public static double Add(double x, double y)
	{
		return x+y;
	}
	
	public static double Substract(double x, double y)
	{
		return x-y;
	}
	
	public static double Multiply(double x, double y)
	{
		return x*y;
		
	}
	
	public static double Divide(double x, double y)
	{
		return x/y;
	}
	
	
	public static String Format(double out)
	{
	    if(out == (long) out)
	        return String.format("%d",(long)out);
	    else
	        return String.format("%s",out);
	}
}
