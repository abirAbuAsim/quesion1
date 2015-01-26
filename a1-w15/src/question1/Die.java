package question1;
import java.util.Random;

public class Die {
	/*
	 * 
	 */
	private int sidesOfDice;
	
	//the value of the side currently facing up
	private int valueOfSideFacingUp;
	
	//to randomize the sides
	Random dice; 
	
	// this Constructor wont take any argument  
	public Die(){
		sidesOfDice=6;
		dice = new Random();
		roll();
		
		System.out.println(this);
		
	}
	
	//this constructor accepts single argument
	public Die(int x){
		
		if(x==4 || x==6 || x==8 || x==10 || x==12 || x==20 || x==100)
			sidesOfDice=x ;
		else 
			sidesOfDice=6 ;
		
		dice = new Random();
		roll();
		
		System.out.println(this);
	}
	
	//returns the current value of the side that faces Up
	public int getValue(){
		return  valueOfSideFacingUp;
	}
	
	//Randomly rolls the die
	public void roll(){
		valueOfSideFacingUp=1+dice.nextInt(sidesOfDice);
	}
	
	public String toString(){
		return "Die [ "+sidesOfDice +"sides, value = "+valueOfSideFacingUp+"]";
		
	}
}