package zadaci_02_08_2016;

public class Prestupne_Godine {
public static void main(String[] args) {

		
		for(int i=100; i <2100;i++){ //set loop for listing years from 100-2100
			if((i % 4==0 && i %100 !=0) || (i % 400==0)){ //search leap year

		System.out.print(i + " ");	 //print leap years
			
			} //end if statement
		} //end loop


		int numberOfLeap = 0;//initialize counter
		for(int i = 101;i<2100;i++){ 
			if((i % 4==0 && i % 100!=0)||(i %400==0)){
				numberOfLeap++; //count leap years 
				
			}}
		System.out.println(); // skip the line
			System.out.print(" Broj prestupnih godina je :" + numberOfLeap); //print the number of years
			

			
			
		} //end method
			} // end class


