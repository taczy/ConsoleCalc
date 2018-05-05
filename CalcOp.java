package Task1_calculator;
//import java.util.*;
public class CalcOp
{
		
	public static double add(double x, double y)
	{
		return x+y;
	}
	
	public static double substract(double x, double y)
	{
		return x-y;
	}
	
	public static double multiply(double x, double y)
	{
		return x*y;
		
	}
	
	public static double divide(double x, double y)
	{
		return x/y;
	}
	
	
	public static String format(double out)
	{
	    if(out == (long) out)
	        return String.format("%d",(long)out);
	    else
	        return String.format("%s",out);
	}
}
