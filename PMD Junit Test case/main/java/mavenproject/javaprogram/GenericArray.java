package mavenproject.javaprogram;

//*********************************************************************** 
//	Program name : 			ArrayElement
//	Program Description :	using single method print arraythat can print all 
//                            the elements of both string and integer array 
//                        
//***********************************************************************

public class GenericArray {
	public static void main(String[] args) {
		
    //creating an array of integer and string
	final Integer[] number= {1,2,3,4};
    final String[] name= {"Hello", "World"};
   //pass an integer and string array
     displayArray(number);
     displayArray(name);
	}
	
   //creating an generic method
	public static <E> int displayArray(E[] input)
	{
		for(final E element: input)
		{
			//display element integer and charcter
			System.out.printf("%s",element);
		}
		System.out.println();
		return 0;
	}

}
