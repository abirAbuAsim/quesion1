package question1;
import java.util.Scanner;

public class DieTester {

	public static void main(String[] args) {
		
		System.out.println("Creating two dice- one with 6 sides, enter number of sides for the second one:");
		Scanner input=new Scanner(System.in);
		int diceInput=input.nextInt();
		
		Die ob1 = new Die();
		Die ob2 =new Die(diceInput);
		
		
		
		
		System.out.println(ob1);
		System.out.println(ob2);
		
		System.out.println("Rolling each separately and printing the values:");
		ob1.roll();
		ob2.roll();
		
		System.out.println("Die 1 showing: "+ob1.getValue());
		System.out.println("Die 2 showing: "+ob2.getValue());
		
		int diceSum=ob1.getValue()+ob2.getValue();
		System.out.println("Sum of the dice:"+diceSum);
		
		System.out.println("for loop to roll the two dice 10 times show the values and the sum: ");
		

	}

}
