import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Airplane a = new Airplane();
		Scanner in = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("A)dd S)how Q)uit: ");
			String choice = in.next();
			if(choice.equalsIgnoreCase("a")){
				String clas = "";
				int pass = 0;
				String spot = "";
				boolean valid = false;
				while(!valid) {
					System.out.println("F)irst or E)conomy: ");
					String input = in.next();
					if(input.equalsIgnoreCase("f")) {
						clas = "first";
						boolean validPass = false;
						while(!validPass) {
							System.out.println("Passengers? (1-2): ");
							pass = Integer.parseInt(in.next());
							if(pass == 2) {
								validPass = true;
							}
							else if(pass == 1) {
								validPass = true;
								boolean validSpot = false;
								while(!validSpot) {
									System.out.println("A)isle or W)indow: ");
									spot = in.next();
									if(spot.equalsIgnoreCase("a")||spot.equalsIgnoreCase("w")) {
										validSpot = true;
									}
									else {
										System.out.println("Invalid Choice. Enter Again: ");
									}
									
								}
							}
							else {
								System.out.println("Invalid input");
							}
						}
						valid = true;
					}
					else if(input.equalsIgnoreCase("e")) {
						boolean validPass = false;
						clas = "economy";
						System.out.println("Passengers? (1-3): ");
						while(!validPass) {
							pass = Integer.parseInt(in.next());
							if(pass == 3) {
								validPass = true;
							}
								
							else if(pass == 1) {
								validPass = true;
								boolean validSpot = false;
								while(!validSpot) {
									System.out.println("A)isle, C)enter or W)indow: ");
									spot = in.next();
									if(spot.equalsIgnoreCase("a")||spot.equalsIgnoreCase("w") || spot.equalsIgnoreCase("c")) {
										validSpot = true;
									}
									else {
										System.out.println("Invalid Choice. Enter Again: ");
									}
									
								}
							}
							else if(pass == 2) {
								validPass = true;
								boolean validSpot = false;
								while(!validSpot) {
									System.out.println("A)isle or W)indow: ");
									spot = in.next();
									if(spot.equalsIgnoreCase("a")||spot.equalsIgnoreCase("w")) {
										validSpot = true;
									}
									else {
										System.out.println("Invalid Choice. Enter Again: ");
									}
									
								}
							}
							else {
								System.out.println("Invalid input");
							}
						}
						valid = true;
					}
					else {
						System.out.println("Enter a valid input");
					}
				}
				a.addSeat(clas,pass,spot);
			}
			else if(choice.equalsIgnoreCase("s")){
				for(int i = 0; i < a.getFirst().length; i++) {
					for(int x = 0; x < a.getFirst()[i].length; x++) {
						System.out.print(a.getFirst()[i][x]);
					}
					System.out.println();
				}
				for(int i = 0; i < a.getEconomy().length; i++) {
					for(int x = 0; x < a.getEconomy()[i].length; x++) {
						System.out.print(a.getEconomy()[i][x]);
					}
					System.out.println();
				}
				
			}
			else if(choice.equalsIgnoreCase("q")) {
				run = false;
			}
			else {
				System.out.println("Invalid Choice");
			}
		}
		in.close();

	}

}
