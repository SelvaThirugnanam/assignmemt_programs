package assignment;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args)
	{
			System.out.println("enter the string");
			//Get the input from the user
			Scanner scan=new Scanner(System.in);
			String text=scan.nextLine();
			//convert the string into chararray
			char[] chararray=text.toCharArray();
			//Declare an empty string
			String check="";
			//Iterate the chara array from reverse and store it in empty string
			for(int i=chararray.length-1;i>=0;i--)
				check=check+chararray[i];
			//check the original string and the reversed string.
		if(text.equals(check))
			System.out.println("the given word is palindrome");
		else
			System.out.println("the given word is not palindrome");
	}
	
	
}

