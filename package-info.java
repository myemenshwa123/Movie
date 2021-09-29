package movie;
import java.util.Scanner; 
public class movie 
{
	public static void main(String[] args) 
	{
		char YN;
		System.out.println("Would you like to continue?");
		Scanner N = new Scanner(System.in);
		while (YN == 'y') 
		    {
		Movie m =new Movie(); 
		Scanner KeyBoard = new Scanner(System.in); 
		System.out.println("Please enter movie name: ");
		String title = KeyBoard.nextLine();
		m.setTitle(title); 
		
		System.out.println ("Please enter movie rating: ");
		String rating = KeyBoard.nextLine();
		m.setRating (rating); 
		
		System.out.println("Please enter tickets sold");
		String soldTickets = KeyBoard.nextLine();
		m.setsoldTickets (soldTickets);
		
		System.out.println(m.toString());
		
		System.out.println("Would you like to continue? (y/n");
		YN = N.nextLine().charAt(0);
		    }
		System.out.println("I thank you very much for testing my program, have a wonderful day");
		}
	/*

	* Class: CMSC203

	* Instructor: Professor Eivazi


	* Due: 9/28/2021

	* Platform/compiler: Java

	* I pledge that I have completed the programming assignment independently.

	I have not copied the code from a student or any source.

	I have not given my code to any student.

	Print your Name here: Michael Yemenshwa 

	*/
		
} 
