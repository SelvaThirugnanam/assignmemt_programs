package assignment;

public class PrintingDuplicates
{
	public static void main(String[] args)
	{
				//declare an integer array with duplicates
	    int[] num= {55,33,55,66,54,89,54,67,76,76};
				//iterate the array using nested forloop
				for(int i=0;i<num.length;i++)
				{
					//iterate from i+1 within the i for loop
					for(int j=i+1;j<num.length;j++) 
					{
						//compare both the values
						if(num[i]==num[j]) 
							System.out.println(num[i]);
						
					}
				}

	}

		
}


