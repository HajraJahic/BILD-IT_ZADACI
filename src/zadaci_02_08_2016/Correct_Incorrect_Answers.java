package zadaci_02_08_2016;
import java.util.Scanner; 
public class Correct_Incorrect_Answers {
public static void main(String[] args) { //main method
		
		Scanner input = new Scanner(System.in); //create scanner
	
		
		try{  //try method numberOfQuesions
				
				numberOfQuestions(1);
			}
			catch(Exception ex){ //catch InputMismatchException
				System.out.println(" Wrong input. Enter a number!" );
			}
		
		
		input.close();
		}
		
				
		
		public static void numberOfQuestions(int number)  throws Exception{  //declare exception
				
			int numberOfQuest= (int)(Math.random() * 20); //generate number of questions
			int answer = 0; //declare answer
			int correctAnswers =0; //counter for correct answers
			int incorrectAnswers = 0;//counter for incorrect answers
		
		
	while(answer<numberOfQuest){ //set loop to read random numbers to be calculated
		int number1= (int)(Math.random() * 10);
		int number2= (int)(Math.random() *10);
		answer++; //terminate loop
		
		if(number1<number2){ //if the first number is less than the second one than
			int temp=number1;//set temp variable to replace them
			number1=number2;
			number2= temp;
		}
		Scanner input = new Scanner(System.in); //scanner input
		
		System.out.println("How much is " + number1 + " - " +  number2); //print the question
		
		answer = input.nextInt(); //enter answer

		
		if(number1 - number2==answer){//if the answer is correct
			System.out.println("Correct answer");//print 
			
		correctAnswers++;//count correct answers
		
		}//end if statement
		

		else{
			System.out.println("Incorrect answer .");//if the answer is incorrect,print
			
		incorrectAnswers++;//count incorrect answers
		
		}//end else statement
		
		
		}//end loop

	System.out.println("Number of correct answers: " + correctAnswers); //print correct answers
	System.out.println("Number of incorrect answers: " + incorrectAnswers); //print incorrect answers
		

	}//end method 
		}// end class


