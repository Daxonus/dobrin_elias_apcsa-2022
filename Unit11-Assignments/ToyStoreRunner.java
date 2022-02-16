//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore store = new ToyStore();
		store.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.print(store);
		
		System.out.println();
		System.out.println(store.getMostFrequentToy());
		
		System.out.println();
		System.out.println();
		
		store.sortToysByCount();
		System.out.print(store);
		System.out.println();
		System.out.println(store.getMostFrequentToy());
	}
}