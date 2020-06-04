import java.util.*;
public class Genericstackbyarray <T> implements GenericStack <T> {
	private T stackArray[];
	private final static int size=10;
	private int top;
	public Genericstackbyarray(){
		this(size);
	}
	public Genericstackbyarray(int initsize)
	{
		stackArray=(T[])new Object[initsize];
		top=-1;
	}
 public void push(T t)
 {
	 if(isfull()!=1)
		{
			if(top==-1)
			{
				top++;             //increment top and insert data at 1st position
				stackArray[top++]=t;
			}
			else{
				stackArray[top++]=t;         //insert data in stack when stack is not initially empty
			}
		}
		else{
			System.out.println("stack is full can't push the data");
		}
 }
 public T pop()
	{
		if(isempty()!=1)
		{
			
			if(top!=0){            //check if stack contain only 1 element which is popped already
			return stackArray[--top];     
			}
			else{
				return null;            //stack empty
			}
		}
		else{
			return null;             //stack empty
		}
	}
 public int isfull()
	{
		if(top==(size))                  //stack full condition
		{
			return 1;
		}
		return 0;
	}
 public int isempty()
	{
		if(top==-1)
		{
			return 1;
		}
		return 0;
	}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 GenericStack<Character> s=new Genericstackbyarray<Character>();
	 s.push('A');
	 s.push('N');
	 s.push('P');
	 s.push('U');
	
	  System.out.println("popped element is:"+s.pop());
	  System.out.println("popped element is:"+s.pop());
	 

}
}
