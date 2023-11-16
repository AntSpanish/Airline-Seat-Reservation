import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Airplane a = new Airplane();
		Scanner in = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("A)dd S)how Q)uit");
			String input = in.nextLine();
			if(input.equalsIgnoreCase("a")){
				a.addSeat();
			}
			else if(input.equalsIgnoreCase("s")){
				System.out.println(a.showSeating());
			}
			else if(input.equalsIgnoreCase("q")) {
				run = false;
			}
		}

	}

}
