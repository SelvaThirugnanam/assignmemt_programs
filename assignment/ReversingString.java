package assignment;

import java.util.Scanner;

public class ReversingString 
{
	public static void main(String[] args) 
	{
		//Get the input string from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the text");
	  //store the string in a string variable
		String input=scan.nextLine();
		//convert the string into character
		char[]charArray=input.toCharArray();
		//iterate the array 
		for(int i=charArray.length-1;i>=0;i--)
		{
			//printing the elements
		System.out.println(charArray[i]);
	    }
    }
}

	


