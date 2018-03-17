package com.bridgeit.datastructure;
import java.util.NoSuchElementException;

	class Node10
	{
	    protected char data;
	    protected Node10 link;
	 
	    /*  Constructor  */
	    public Node10()
	    {
	        link = null;
	        data ='\u0000';
	    }    
	    /*  Constructor  */
	    public Node10(char ch,Node10 n)
	    {
	        data = ch;
	        link = n;
	    }    
	    /*  Function to set link to next Node  */
	    public void setLink(Node10 n)
	    {
	        link = n;
	    }    
	    /*  Function to set data to current Node  */
	    public void setData(char d)
	    {
	        data = d;
	    }    
	    /*  Function to get link to next node  */
	    public Node10 getLink()
	    {
	        return link;
	    }    
	    /*  Function to get data from current Node  */
	    public char getData()
	    {
			return data;
	        
	    }
	}    

class Dequeue
{
    private Node10 front, rear;
    private int size;
 
    /* Constructor */
    public Dequeue()
    {
        front = null;
        rear = null;
        size = 0;
    }    
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return size;
    }
    /* Clear dequeue */
    public void clear()
    {
        front = null;
        rear = null;
        size = 0;
    }
    /*  Function to insert an element at begining  */
    public void insertAtFront(char ch)
    {
        Node10 nptr = new Node10(ch, null);    
        size++ ;    
        if (front == null) 
        {
            front = nptr;
            rear = front;
        }
        else 
        {
            nptr.setLink(front);
            front = nptr;
        }
    }
    /*  Function to insert an element at end  */
    public char insertAtRear(char ch)
    {
        Node10 nptr = new Node10(ch,null);    
        size++ ;    
        if (rear == null) 
        {
            rear = nptr;
            front = rear;
        }
        else 
        {
            rear.setLink(nptr);
            rear = nptr;
        }
		return ch;
    }    
    /*  Function to remove front element from the queue */
    public char removeAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node10 ptr = front;
        front = ptr.getLink();
 
        if (front == null)
            rear = null;
        size-- ;
 
        return ptr.getData();
    }
    /*  Function to remove rear element from the queue */
    public char removeAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        char ele = rear.getData();
        Node10 s = front;
        Node10 t = front;
        while (s != rear)
        {
            t = s;
            s = s.getLink();
        }
        rear = t;
        rear.setLink(null);
        size --;
 
        return ele;
    }  
    public int size()
    {
    	return size;
    }
    /*  Function to check the front element of the queue */
    public char peekAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }
    /*  Function to check the front element of the queue */
    public char peekAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return rear.getData();
    }    
    /*  Function to display the status of the queue */
    public String display()
    {
        System.out.print("\nDequeue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return null ;
        }
        Node10 ptr = front;
        while (ptr != rear.getLink() )
        {
            System.out.print(ptr.getData()+"");
            ptr = ptr.getLink();
        }
        System.out.println();
		return null;        
    }
	
}