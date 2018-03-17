package com.bridgeit.datastructure;

class Node
{
	String i;
	int number;
	Node ref;
	Node(String i)
	{
		this.i = i;
	}
	Node(int number)
	{
		this.number=number;
	}
}
public class LinkedList1
{
	Node first;
	Node last;
	public void add(String i)
	{
		Node element = new Node(i);
		if(first == null)
		{
			first = element;
		}
		else
		{
			last.ref = element;
		}
		last = element;
	}
	public void add(int number)
	{
		Node element = new Node(number);
		if(first == null)
		{
			first = element;
		}
		else
		{
			last.ref = element;
		}
		last = element;
	}
	
	void iterate()
	{
		Node current = first;
		while(current != null)
		{
			System.out.println(current.i);
			current = current.ref;
		}
	}
	public boolean remove(String data)
	{
		boolean status = false;
		if(first.i.equals(data))
		{
			first = first.ref;
			status = true;
		}
		else if(last.i.equals(data))
		{
			Node prev= null;
			Node current = first;
			while(current.ref != null)
			{
				prev = current;
				current = current.ref;
			}
			last = prev;
			last.ref = null;
			status = true;
		}
		else
		{
			Node prev= null;
			Node current = first;
			while(current != null && !(status = (current.i.equals(data))))
			{
				prev = current;
				current = current.ref;
			}
			
			if(status)
			{
				prev.ref = current.ref;
			}
		}
		return status;
	}
	public boolean remove(int number)
	{
		boolean status = false;
		if(first.i.equals(number))
		{
			first = first.ref;
			status = true;
		}
		else if(last.i.equals(number))
		{
			Node prev= null;
			Node current = first;
			while(current.ref != null)
			{
				prev = current;
				current = current.ref;
			}
			last = prev;
			last.ref = null;
			status = true;
		}
		else
		{
			Node prev= null;
			Node current = first;
			while(current != null && !(status = (current.i.equals(number))))
			{
				prev = current;
				current = current.ref;
			}
			
			if(status)
			{
				prev.ref = current.ref;
			}
		}
		return status;
	}
	boolean search(String searchWord)
	{
		Node current = first;
		while(current!=null)
		{
	      if(searchWord.equals(current.i))
	      {
	    	  return true;
	      }
			current = current.ref;
			
		}
		
		return false;
		
	}
	boolean search(int searchNumber)
	{
		Node current = first;
		while(current!=null)
		{ 
			System.out.println();
	      if(searchNumber==current.number)
	      { System.out.println("hi");
	    	  return true;
	      }
			current = current.ref;
			
		}
		
		return false;
		
	}
	
	 
	public void display()
	{
		Node current = first;
		while(current != null)
		{
			System.out.print(current.i+" ");
			current = current.ref;
		}
	}
	
}

