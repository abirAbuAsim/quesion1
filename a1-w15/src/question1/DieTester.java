package question1;
import java.util.Scanner;

public class DieTester {

	public static void main(String[] args) {
		
		System.out.println("Creating two dice- one with 6 sides, enter number of sides for the second one:");
		Scanner input=new Scanner(System.in);
		int diceInput=input.nextInt();
		
		Die ob1 = new Die();
		Die ob2 =new Die(diceInput);
		
		input.close();
		
		System.out.println("Rolling each separately and printing the values:");
		ob1.roll();
		ob2.roll();
		
		System.out.println("Die 1 showing: "+ob1.getValue());
		System.out.println("Die 2 showing: "+ob2.getValue());
		
		int diceSum=ob1.getValue()+ob2.getValue();
		System.out.println("Sum of the dice:"+diceSum);
		
		System.out.println("\nfor loop to roll the two dice 10 times show the values and the sum: ");
		System.out.println("Die 1		Die 2		Sum");
		for(int i=0; i<10; i++ ){
			ob1.roll();
			ob2.roll();
			diceSum=ob1.getValue()+ob2.getValue();
			System.out.println(ob1.getValue()+"\t\t\t"+ob2.getValue()+"\t\t\t"+diceSum);
			
		}
		
		System.out.println("Creating five dice.");
		
		
		Die[] x= new Die[7];
		for(int i=1; i<=5; i++){
			x[i]=new Die();
			
		}
		
		int yahtzee=0,counter=1;
		for(int i=1; i<=1000; i++){
			
			for(int j=2; j<=5; j++){
				
				if(x[j].getValue()==x[j-1].getValue()){
					counter++;
				}
				if(counter==5)
					yahtzee++;
			}
			
			
			
			
		}
	}

}
