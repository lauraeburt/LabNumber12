import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> UsedCar = new ArrayList<>();
		UsedCar.add(new UsedCar("GMC", "Sonoma", 1999, 1500.00, 156000));
		UsedCar.add(new UsedCar("Chevy", "Silverado", 2006, 3500.00, 90000));
		UsedCar.add(new UsedCar("Ford", "focus", 2003, 2500.00, 102030));
		UsedCar.add(new Car("Mazda", "Miata", 2019, 32000));
		UsedCar.add(new Car("Ford", "F150", 2019, 45000));
		UsedCar.add(new Car("Subaru", "Impreza", 2019, 27500));
		String restart = "yes";
			
		int userNum;
		
		do {
			for (int i = 0; i < UsedCar.size(); i++) {
				System.out.println(UsedCar.get(i));
			}
			System.out.println("Cars are listed in order 1 - 6. Please select the car you would like to buy");
			userNum = scan.nextInt();
			System.out.println(UsedCar.get(userNum));
			System.out.println("was this your car? Yes/No");
			String userAnswer = scan.next();
			if (userAnswer.equalsIgnoreCase("yes")) {
				UsedCar.remove(userNum);
				for (int i = 0; i < UsedCar.size(); i++) {
					System.out.println(UsedCar.get(i));}
					restart = "restart";
					break;
				
			} else if (userAnswer.equalsIgnoreCase("no")) {
				continue;
			} else {
				System.out.println("Yes or no not found here lets restart");
				continue;
			}

		} while (restart.equalsIgnoreCase("yes"));

	}
}
