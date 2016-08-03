package zadaci_02_08_2016;

import java.util.Scanner;

public class Coin_Flip {
public static void main(String[] args){  //main class

		
		Scanner input = new Scanner(System.in); //create scanner
		int number = 0;
		
		boolean possible = true;
		
		while(possible){
			possible = false;
			
			
		try{ //try number input and coinFlip method
			
		
		System.out.println("Enter the number how many times you want to flip the coin ");
		number = input.nextInt(); //number input
		coinFlip(number);
	}
		catch(Exception ex){ // catch invalid input exception
			System.out.println("Invalid input. Enter a number! ");
			possible = true;
		}
		finally{
			input.nextLine();
			}
		}
		input.close(); //scanner close
		
		
		}
			
	public static void coinFlip(int number) throws Exception{ //declare exception

		int head = 0; //initialize counters
		int tail = 0;
		
		for(int i = 0; i < number;i++){ //loop to list flipping of flipped coin
			
			int flip = (int)(Math.random()*2); //generize flipping
			
			
			if(flip == 0){ //if it is zero, then it is head
				System.out.println("0-Head");
				head++; //count head
			}//end if statement
			else{
				System.out.println("1-Tail"); //otherwise, it's tail
				tail++;//count tail
				
		}//end else statement
			}//end loop
		
			System.out.println();
			System.out.println("Head shows up " + head + " times"); //print how many heads
			System.out.println("Tail shows up " + tail + " times");//print how many tails
			
		} //end method
	}//end class


