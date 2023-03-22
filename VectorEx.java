import java.util.*;
public class VectorEx{
public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	Vector<String> colors=new Vector<String>();
	int choice=0;
	int pos;
	String color;
	start: do{
		//choice=0;
		System.out.println("******Color Vector Menu******");
		System.out.println("1.ADD a color");
		System.out.println("2.Delete a color");
		System.out.println("3.Print a color vector");
		System.out.println("4.Clear the Vector");
		System.out.println("5.Insert the Vector");
		System.out.println("Press 0 To EXIT");
		System.out.println("******************************");
		System.out.print("Enter a option: ");
		try {
		choice=sc.nextInt();
		switch (choice){
			case 1:
			System.out.print(">Add a color to list: ");
			color=sc.next();
			colors.add(color);
			System.out.println(">Color Added..");
			break;
			case 2:
				try {
					System.out.print(">Enter a the position of color to delete: ");
					pos=sc.nextInt();
					colors.remove(pos-1);
					System.out.println(">Color Removed..");
					}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(">Either list is empty or u have entered invalid input...");
					}
				break;
				case 3:
					System.out.println("==========Your List========");
					System.out.println(colors);
					System.out.println("===========================");
					break;
				case 4:
					colors.clear();
					System.out.println(">List Cleared!!");
					break;
				case 5:
					System.out.print(">Enter a color to insert: ");
					color=sc.next();
					System.out.print(">Enter a position in the list: ");
					pos=sc.nextInt();
					colors.add(pos-1, color);
					System.out.println(">Color Inserted!!");
					break;
					default:
						if(choice!=0)
							System.out.println(">Please enter a valid input!!");
						}
		}
		catch(InputMismatchException e) {
			sc=null;
			sc=new Scanner(System.in);
			System.out.println(">Please enter numerical option...");
			System.out.print("Plz press'1' to continue and '0' to EXIT:");
			try {
				choice=sc.nextInt();
			}
			catch(NoSuchElementException ex) {
				System.out.println(">Please enter numerical option...");
			}
		}
		}while(choice!=0);
	}
}





























