package question1;
import java.util.Random;

public class Die {
	//number of sides of a dice
	int sides;
	
	//the value of the side currently facing up
	int value;
	
	//to randomize the sides
	Random dice = new Random(); 
	
	// this Constructor wont take any argument
	Die(){
		sides=6;
		roll();
	}
	
	//this constructor accepts single argument
	Die(int x){
		sides=x;
		roll();
	}
	
	//returns the current value of the side that faces Up
	int getValue(){
		return  value;
	}
	
	//Randomly rolls the die
	void roll(){
		value=1+dice.nextInt(sides);
	}
	
	public String toString(){
		return "Die [ "+sides +" sides, value=  "+getValue()+"]";
	}

}
