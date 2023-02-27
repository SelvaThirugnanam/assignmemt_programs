package assignment;

public class MissingElement
{

	public static void main(String[] args)
	{   //Declare and initialize an int array with a missing element
		int x[]= {1,2,3,5,6,7,8,9};
		int n=x.length+1;
		int sum1 =0,sum2=0;
		//find the sum and store it in a variable
		sum1=n*(n+1)/2;
		//Iterate the array and sum the elements
		for(int j=0;j<x.length;j++)
			sum2+=x[j];
		//find the difference of the two sums
		int result=sum1-sum2;
		System.out.println(result);
		
		
	}
}
