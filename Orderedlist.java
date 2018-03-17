/******************************************************************************
  
 *  Purpose: Read .a List of Numbers from a file and arrange it ascending Order
 *  in a Linked List.Take user input for a number, if found then pop the number
 *  out of the list else insert the number in appropriate position

 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2017
 *
 ******************************************************************************/

package com.bridgeit.datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.bridgeit.utility.Utility;
public class Orderedlist {
	

	
	public static void main(String[] args) throws IOException 
	{
		LinkedList1 ll= new LinkedList1();
		Utility utility = new Utility();
		String file = "/home/bridgeit/Documents/Nilesh/nilesh/unorderd";
		FileReader fileReader = new FileReader(file);
		BufferedReader buffer = new BufferedReader(fileReader);
		String line = buffer.readLine();
		System.out.println(line);
		String array[] = line.split(" ");
		System.out.println("The sorted list array are");
		for (int i = 0; i < array.length; i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i].compareTo(array[j])>0)
				{
					String str = array[j];
					array[j]=array[i];
					array[i]=str;
				}
			}
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
		System.out.println("The linked list sort array are");
		for(int i=0;i<array.length;i++)
		{
			ll.add(array[i]);
		}
		System.out.println("Enter the number to be search");
		int searchNumber = utility.inputInteger();
		boolean status=ll.search(searchNumber);
		System.out.print(status+" ");

	    Utility.addRemove1(status, searchNumber,ll);
	    ll.display();
	    Utility.readFile(ll,searchNumber);
	    buffer.close();
	}
		
	}

