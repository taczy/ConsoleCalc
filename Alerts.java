package com.epam.atm.task1_calculator;
public class Alerts
{
	public static void Hello()
	{
		System.out.println("Welcome to Java console Calculator!");
	}
	
	public static void EnterNum()
	{
		System.out.println("Enter a number:");
	}
	
	public static void NotNum()
	{
		System.out.println("Not a number, please try again:\n");
	}
	
	public static void EnterOp()
	{
		System.out.println("Enter an operation symbol:\n'*' for Multiplication\n'/' for Division\n'+' for Addition\n'-' for Substraction");
	}
	public static void InvalidOp()
	{
		System.out.println("Only the symbols '*', '/', '+' and '-' are allowed \nPlease try again:\n");
	}
	
	public static void PrintRes(double number_1, double number_2, String math_symbol, double final_result)
	
	{
		System.out.println(CalcOp.Format(number_1) + math_symbol + CalcOp.Format(number_2) + " = " + CalcOp.Format(final_result));
	}
	
	public static void ExitCalc()
	
	{
		System.out.println("Enter 'out' to exit");
	}
}
