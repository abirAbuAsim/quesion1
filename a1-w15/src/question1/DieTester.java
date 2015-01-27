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
		
		
		Die dieOb1 = new Die();
		Die dieOb2 = new Die();
		Die dieOb3 = new Die();
		Die dieOb4 = new Die();
		Die dieOb5 = new Die();
		
		int numberOfRolls=0,sum=0;
		int maximumRolls=-1, minimumRolls=Integer.MAX_VALUE;
		double averageRolls;
		
		int yahtzeeCount=0;
		
		System.out.println("Rolling until i find 1000 Yahtzees. Counting the number of rolls it takes to get each one.");
		for(int i=1; i<=1000; i++){
			
			Boolean yahtzee=false;
			
			numberOfRolls = 0 ;
			while(! yahtzee){
				
				numberOfRolls++;
				
				dieOb1.roll();
				dieOb2.roll();
				dieOb3.roll();
				dieOb4.roll();
				dieOb5.roll();
				
				if(dieOb1.getValue()==dieOb2.getValue() && dieOb1.getValue()==dieOb3.getValue()
					&& dieOb1.getValue()==dieOb3.getValue() && dieOb1.getValue()==dieOb4.getValue()
					&&dieOb1.getValue()==dieOb5.getValue()){
					yahtzeeCount++;
					yahtzee=true;
					
				}
				
			}
			sum +=numberOfRolls;		
			if(numberOfRolls >=  maximumRolls )
				maximumRolls=numberOfRolls;
			
			if(numberOfRolls <=minimumRolls )
				minimumRolls = numberOfRolls;

		}
		if(yahtzeeCount == 1000)
			System.out.print("Found 1000 Yahtzees.");
		
		System.out.print(" max rolls to find one: "+ sum);
		System.out.print(" min rolls : "+ minimumRolls);
		
		averageRolls = sum/1000.0;
		
		System.out.print(" avg rolls : "+ averageRolls);
	}

}
