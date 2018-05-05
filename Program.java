package Task1_calculator;
import java.util.*;
public class Program 
{
	public static void main(String[] args) 
	{
		Alerts.hello();	
		
		while(true)
		{
			double num_1;
			double num_2;
			Scanner input = new Scanner(System.in);
			//the first number entered by user
			String n1 = "first";
			Alerts.enterNum(n1);
			while(true)
			{	
				try  
				{	
					num_1= input.nextDouble();
					break;
				}
				catch(InputMismatchException a)
				{
					Alerts.notNum();
					Alerts.enterNum(n1);
					input.next();
				}   
			}	
			
			//the second number entered by user
			String n2 = "second";
			Alerts.enterNum(n2);
			while(true)
			{	
				try  
				{	
					num_2= input.nextDouble();
					break;
				}
				catch(InputMismatchException a)
				{
					Alerts.notNum();
					Alerts.enterNum(n2);
					input.next();
				}   
			}
			
			// user selects an operation and gets the result
			Alerts.enterOp();			
			for (;;)
			{	
				double result;
				String symbol= input.next();
				switch(symbol)
			
				{ 
					case "+": 
						result=CalcOp.add(num_1, num_2);
						Alerts.printRes(num_1, num_2, symbol, result);
						break;
					case "-": 
						result=CalcOp.substract(num_1, num_2);
						Alerts.printRes(num_1, num_2, symbol, result);
						break;
					case "*": 
						result=CalcOp.multiply(num_1, num_2);
						Alerts.printRes(num_1, num_2, symbol, result);
						break;
					case "/": 
						result=CalcOp.divide(num_1, num_2);
						Alerts.printRes(num_1, num_2, symbol, result);
						break;
					default:
						Alerts.invalidOp();
						continue;
				}
				break;
			}	
				// break the loop and quit the program
			Alerts.exitCalc();
			String exit_calc= input.next();
			if (exit_calc.equals("out"))
			{
				break;			
			}			
			
		}
		Alerts.bye();
	}
	
}