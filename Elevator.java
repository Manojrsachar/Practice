import java.util.Scanner;

class Lift {
	private int currentFloor;

	public Lift() {
		currentFloor = 1;
	}

	public void moveToFloor(int targetFloor) {
		if (targetFloor < currentFloor) {
			for (int m = currentFloor; m <= targetFloor; m++) {
				System.out.println("Lift reached to " + m);
				System.out.println('*');
			}

			currentFloor = targetFloor;
			System.out.println("Lift has arrived at floor " + currentFloor);
			System.out.println("Have a Nice Day");
			System.out.println();
			System.out.println(currentFloor);
		} else {
			for (int m = targetFloor; m >= currentFloor; m--) {
				System.out.println("Lift reached to " + m);
				System.out.println('*');
			}

			currentFloor = targetFloor;
			System.out.println("Lift has arrived at floor " + currentFloor);
			System.out.println("Have a Nice Day");
			System.out.println();
			System.out.println(currentFloor);
		}
	}
}

public class Elevator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lift lift = new Lift();

		while (true) {
			System.out.print("Welcome.... ");
			int targetFloor = scanner.nextInt();
			System.out.println('*');

			if (targetFloor == 0) {
				System.out.println("Exiting lift simulation. Have a great day!");
				break;
			}

			if (targetFloor < 1 || targetFloor > 10) {
				System.out.println("Invalid floor number. Please enter a number between 1 and 10.");
			} else {
				lift.moveToFloor(targetFloor);
			}
		}

		scanner.close();
	}
}
