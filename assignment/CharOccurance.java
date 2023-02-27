package assignment;

public class CharOccurance 
{

	public static void main(String[] args) 
	{
		//initialize a string
	     String text="Selvendran";
		//Convert string to charArray
	     char[] charArray=text.toCharArray();
		//initialize count variable as 0
		 int count=0;
		//iterate the charArray
		 for(int i=0;i<charArray.length;i++) 
		 {
		//check the occurrence of 'e' and increment the count
			if(charArray[i]=='e') 
						count++;
		
		 }
				//Print the count
				System.out.println(" number of e occurance is "+count);
			
   }
	
}
