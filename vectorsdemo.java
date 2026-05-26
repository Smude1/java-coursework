import java.util.*;
class vectorsdemo
{
	public static void main(String args[])
	{
		int i , cont;
		Vector v1=new Vector();
		Scanner usa=new Scanner(System.in);
		System.out.println("how many element u wanna store in vector ? ");
		int store=usa.nextInt();
		System.out.println("enter "+store+" elements : ");
		for(i=0;i<store;i++)
		{
			int elem=usa.nextInt();
			v1.addElement(elem);
		}
		System.out.println("elements stored ! ");
		do
		{
			System.out.println("\n\tenter 1 to check vector elements : " );
			System.out.println("\n\tenter 2 to insert new element at spicific position: ");
			System.out.println("\n\tenter 3 to replace element : ");
			System.out.println("\n\tenter 4 to remove element : ");
			System.out.println("\n\tenter 5 to remove element from spicific index : ");
			System.out.println("\n\tenter 6 to remove all elements element : ");
			System.out.println("\n\tenter 7 to get first element : ");
			System.out.println("\n\tenter 8 to get last element : ");

			System.out.println("enter your choice : ");
			int choice=usa.nextInt();
			switch(choice)
			{
				case 1 :
					System.out.println("vector elements are :  "+v1);
					break;
				case 2 :
					System.out.println("enter element to insert : ");
					int ins=usa.nextInt();
					System.out.println("enter index position : ");
					int idx=usa.nextInt();
					v1.insertElementAt(ins,idx);
					System.out.println("vector elements are : " +v1);
					break;
				case 3 : 
					System.out.println("enter element to replace : ");
					int ins1=usa.nextInt();
					System.out.println("enter index position : ");
					int idx1=usa.nextInt();
					v1.set(idx1,ins1);
					System.out.print("vector elements are : ");	
					for(i=0;i<v1.size();i++)
					{
						System.out.print("  "+v1.get(i));
					}
					break;
				case 4 : 
					System.out.print("enter element to remove  : ");
					int remo=usa.nextInt();
					v1.removeElement(remo);		
					System.out.print("vector elements are : " +v1);
					break;
				case 5 :
					System.out.print("enter index position of element to remove  : ");
					int idxpos=usa.nextInt();
					v1.removeElementAt(idxpos-1);		
					System.out.print("vector elements are : " +v1);
					break;
				case 6 : 
					v1.removeAllElements();		
					System.out.print("vector elements are : " +v1);
					break;
				case 7 :
					System.out.println("the first element is  : "+v1.firstElement());
					break;
				case 8 :
					System.out.println("the last element is  : "+v1.lastElement());
					break;
				default :
					System.out.println("wrong choice ");
					
			}
			System.out.println("\nto continue , press 1 : ");
			cont=usa.nextInt();
		}
		while(cont==1);
		
	}
}