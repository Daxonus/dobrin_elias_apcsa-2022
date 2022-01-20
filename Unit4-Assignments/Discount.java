//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - January 20, 2022
//Class - AP Computer Science A+ - Mr. Mauro
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		if(bill > 2000)
		{
			double discount = 0.15 * bill;
			return (bill - discount);
		}
		
		else
		{
			return bill;
		}
	}
}