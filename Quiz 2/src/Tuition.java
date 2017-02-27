import java.util.Scanner;
public class Tuition {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("What is your initial tuition cost?");
		double init = scan.nextDouble();
		System.out.println("What is the % increase per year?");
		double inc =scan.nextDouble();
	
		double sum = 0;
		
		for(double i = 0; i <= 3; ++i){
			if(i>=1){
				init = init *((inc/100)+1);
				sum += init;
			}
			else{
				sum += init;
			}
		}
		System.out.println("It will cost you $" + sum + " to get a four year degree.");
	}
}
