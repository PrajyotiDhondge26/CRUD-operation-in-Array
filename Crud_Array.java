// CRUD Operation in Array

import java.util.Scanner;
import java.util.Arrays;
class Crud_Array
{
	static int a[] = {};
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("====================== CRUD Operation in Array ========================");
		boolean b = true;
		while(b)
		{
			System.out.println();
			System.out.println("Press 1 for adding in array");
			System.out.println("Press 2 for deleting in array");
			System.out.println("Press 3 for update element in array");
			System.out.println("Press 4 for exit.");
			System.out.println();
			int select = sc.nextInt();
			switch(select)
			{
				case 1 : // adding
					System.out.println("Press 1 for adding in first");
					System.out.println("Press 2 for adding in last");
					System.out.println("Press 3 for adding element anywhere");
					int n = sc.nextInt();
					switch(n)
					{
						case 1 :System.out.println("Enter the element to add");
							int element = sc.nextInt();
							insertAtFirst(element);
							break;

						case 2 :System.out.println("Enter the element to add");
							element = sc.nextInt();
							insertAtLast(element);
							break;

						case 3 :System.out.println("Enter the element to add");
							element = sc.nextInt();
							System.out.println("Enter the index to add");
							int index = sc.nextInt();
							insert(element, index);
							break;
						default:System.err.println("Try again!");
							break;
					}
					System.out.println("Array : "+Arrays.toString(a));
					break;

				case 2 : // deleting
					System.out.println("Press 1 for delete in first");
					System.out.println("Press 2 for delete in last");
					System.out.println("Press 3 for delete in any index");
					n = sc.nextInt();
					switch(n)
					{
						case 1 :deleteFromFirst();
							break;

						case 2 :deleteFromLast();
							break;

						case 3 :System.out.print("Enter the index to delete element");
							int index = sc.nextInt();
							delete(index);
							break;

						default:System.err.println("Try again!");
							break;
					}
					System.out.println("Array : "+Arrays.toString(a));
					break;

				case 3 : // Updating 
					System.out.println("Enter the element to update");
					int element = sc.nextInt();
					System.out.println("Enter the index to update");
					int index = sc.nextInt();
					updateElement(element, index);
					System.out.println("Array : "+Arrays.toString(a));
					break;

				case 4 : // exit
					System.err.println("Finished...");
					b = false;
					break;

				default : System.err.println("Please try again!");	
			}
		}
	}
//---------------------insert At First----------------------------------------------
	public static void insertAtFirst(int element)
	{
		int b [] = new int[a.length+1];
		b[0] = element;
		for(int i = 0 ; i<a.length ; i++)
		{
			b[i+1] = a[i];
		}
		a =  b;		
	}
//------------------------insert At end------------------------------------------
	public static void insertAtLast(int element)
	{
		int b[] = new int[a.length+1];
		b[b.length-1] = element;
		for(int i=0 ; i<a.length; i++)
		{
			b[i] = a[i]; 
		} 
		a = b;
	}
//----------------------insert at any index------------------------------------
	public static void insert(int element, int index)
	{
		if(a.length==0)
		{
			System.err.println("___Array is Empty___");
		}
		if(index <0 || index > a.length)
		{
			System.err.println("___Index does not present___");
		}
		else
		{
			int b[] = new int[a.length+1];
			b[index] = element;
			for(int i=0; i<a.length ; i++)
			{
				if(i < index)
				{
					b[i] = a[i];	
				}
				else
				{
					b[i+1] = a[i];
				}
			}
			a = b;
		}
	}
//----------------------------------delete from first-------------------------
	public static void deleteFromFirst()
	{
		if(a.length == 0)
		{
			System.err.println("___Array is Empty___");
		}
		else
		{
			int b[] = new int[a.length-1];
			for(int i=0; i<b.length ; i++)
			{
				b[i] = a[i+1];
			}
			a = b ;
		}
	}
//---------------------------delete from last-------------------------------
	public static void deleteFromLast()
	{
		if(a.length == 0)
		{
			System.err.println("___Array is Empty___");
		}
		else
		{
			int b[] = new int[a.length-1];
			for(int i=0; i<b.length ; i++)
			{
				b[i] = a[i];
			}
			a = b;
		}
	}
//-----------------------Delete at any index------------------------------
	public static void delete(int index)
	{
		if(a.length==0)
		{
			System.err.println("___Array is Empty___");
		}
		if(index<0 || index > a.length)
		{
			System.err.println("___Index does not present___");
		}
		else
		{
			int b[] = new int [a.length-1];
			for(int i=0 ; i<b.length ; i++)
			{
				if(i < index)
				{
					b[i] = a[i];
				}
				else
				{
					b[i] = a[i+1]; 
				}
			}
			a = b ;
		}
	}
//---------------------------Update element -----------------------------
	public static void updateElement(int element , int index)
	{
		if(index<0 || index >= a.length)
		{
			System.err.println("Cannot Update");
		}
		else
		{
			a[index] = element;
		}
	}
}