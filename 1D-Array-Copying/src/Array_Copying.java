/*****************************************
* New York Institute of Technology 
* CSCI 125: Computer Programming 1  
* Fall 2017 M04                     
* Lab 9: 1-D Array  
* Part 2: 1-D Array Copying                
* Elis Cucka                       
* Purpose: Learn how to copy an array.    
* November 21, 2017     Version 0.1
*****************************************/
import javax.swing.JOptionPane;
public class Array_Copying 
{
	
    public static void main(String[] args)
	{
    	
    	//Getting user input.
		int[] array_1_elements = new int[5];
		
		
		for(int i = 0; i < array_1_elements.length; i++)
		{
			//number[i] = input.nextInt();
			String input = JOptionPane.showInputDialog("Enter the quiz grade number " + (i+1));
			array_1_elements[i] = Integer.parseInt(input);
		}
		
		double total = 0;
		for(int i = 0; i < array_1_elements.length; i++)
		{
			total = total + array_1_elements[i];
		}
		
		
		//Printing out the size of the array.
		System.out.println("The length of the first array is: " + array_1_elements.length);
		
		
		//Copying the first array into the second array.
		int[] array_2_elements = new int[array_1_elements.length];
		for(int i=0; i<array_1_elements.length; i++)
		{
		     array_2_elements[i] = array_1_elements[i];
		}
		
		
		//Printing the output.
		System.out.print("The content of the second array is: ");
		for (int i = 0; i < array_2_elements.length; i++) 
		{
			System.out.print(array_2_elements[i] + " ");
		}
		
		//Printing total and average
		System.out.println("\nThe total is: " + total);
		System.out.println("The average is: " + total/array_1_elements.length);
		if(100 >= total/array_1_elements.length && total/array_1_elements.length >= 90)
		{
			JOptionPane.showMessageDialog(null, "You got A.");
		}
    }

}
////////////////////////////////////////////////////////////////