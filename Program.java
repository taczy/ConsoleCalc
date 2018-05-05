package com.epam.atm.task1_calculator;
import java.util.*;
public class Program 
{
	public static void main(String[] args) 
	{
		Alerts.Hello();
		
		Scanner input = new Scanner(System.in);	
		double num_1;
		double num_2;
		
		while(true)
		{	
			//the first number entered by user
			Alerts.EnterNum();
			while(true)
			{	
				try  
				{	
					num_1= input.nextDouble();
					break;
				}
				catch(InputMismatchException a)
				{
					Alerts.NotNum();
					input.next();
				}   
			}	
			
			//the second number entered by user
			Alerts.EnterNum();
			while(true)
			{	
				try  
				{	
					num_2= input.nextDouble();
					break;
				}
				catch(InputMismatchException a)
				{
					Alerts.NotNum();
					input.next();
				}   
			}
			
			// user selects an operation and gets the result
			Alerts.EnterOp();			
			for (;;)
			{	
				double result;
				String symbol= input.next();
				switch(symbol)
			
				{ 
					case "+": 
						result=CalcOp.Add(num_1, num_2);
						Alerts.PrintRes(num_1, num_2, symbol, result);
						break;
					case "-": 
						result=CalcOp.Substract(num_1, num_2);
						Alerts.PrintRes(num_1, num_2, symbol, result);
						break;
					case "*": 
						result=CalcOp.Multiply(num_1, num_2);
						Alerts.PrintRes(num_1, num_2, symbol, result);
						break;
					case "/": 
						result=CalcOp.Divide(num_1, num_2);
						Alerts.PrintRes(num_1, num_2, symbol, result);
						break;
					default:
						Alerts.InvalidOp();
						continue;
				}
				break;
			}
			
			// break the loop and quit the program
			Alerts.ExitCalc();
			String exit_calc= input.next();
			if (exit_calc=="out")
			{
				break;		
			}
		}
		System.exit(0);
	}
	
}