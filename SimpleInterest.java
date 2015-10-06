import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		float principle, roi, time;

		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Enter principle amount: ");
			principle = scan.nextFloat();

			if (principle <= 0)
				throw new PrincipleAmountException("Principle amount cannot be zero or less than zero");

			System.out.print("Enter rate of interest: ");
			roi = scan.nextFloat();

			System.out.print("Enter time period: ");
			time = scan.nextFloat();

			float si = (principle * roi * time) / 100;

			System.out.println("Simple interest is " + si);
		} catch (PrincipleAmountException ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
		}
	}	
}