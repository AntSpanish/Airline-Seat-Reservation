import java.util.Scanner;

public class Airplane {
String[][] firstClass = new String[5][4];
String[][] economy = new String[16][6];

	public Airplane() {
		for(int i = 0; i < firstClass.length; i++) {
			for(int x = 0; x < firstClass[i].length; x++) {
				firstClass[i][x] = "O";
			}
		}
		
		for(int i = 0; i < economy.length; i++) {
			for(int x = 0; x < economy[i].length; x++) {
				economy[i][x] = "O";
			}
		}
	
	}
	public void addSeat(String clas, int pass, String spot) {
		if(clas.equals("first")) {
			if(pass == 1) {
				if(spot.equals("w")) {
					boolean placedSeat = false;
					for(int i = 0; i < firstClass.length; i++) {
						while(!placedSeat) {
							for(int x = 0; x < firstClass[i].length; x++) {
								if(x == 0 || x == 3) {
									if(firstClass[i][x].equals("O")) {
										firstClass[i][x] = "x";
										placedSeat = true;
										break;
									}
								}
							}
						}
					}
				}
				else if(spot.equals("a")) {
					boolean placedSeat = false;
					for(int i = 0; i < firstClass.length; i++) {
						while(!placedSeat) {
							for(int x = 0; x < firstClass[i].length; x++) {
								if(x == 1 || x == 2) {
									if(firstClass[i][x].equals("O")) {
										firstClass[i][x] = "x";
										placedSeat = true;
										break;
									}
								}
							}
						}
					}
				}
			}
			else if(pass == 2) {
				boolean placedSeat = false;
				for(int i = 0; i < firstClass.length; i++) {
					while(!placedSeat) {
						for(int x = 0; x < firstClass[i].length; x++) {
							if(firstClass[i][x].equals("O") && firstClass[i][x+1].equals("O")) {
								firstClass[i][x] = "x";
								firstClass[i][x+1] = "x";
								placedSeat = true;
								break;
							}
						}
					}
				}
			}
		}
		else if(clas.equals("economy")) {
			if(spot.equals("w")) {
				boolean placedSeat = false;
				for(int i = 0; i < economy.length; i++) {
					while(!placedSeat) {
						for(int x = 0; x < economy[i].length; x++) {
							if(x == 0 || x == 5) {
								if(economy[i][x].equals("O")) {
									economy[i][x] = "x";
									placedSeat = true;
									break;
								}
							}
						}
					}
				}
			}
			else if(spot.equals("a")) {
				boolean placedSeat = false;
				for(int i = 0; i < economy.length; i++) {
					while(!placedSeat) {
						for(int x = 0; x < economy[i].length; x++) {
							if(x == 2 || x == 3) {
								if(economy[i][x].equals("O")) {
									economy[i][x] = "x";
									placedSeat = true;
									break;
								}
							}
						}
					}
				}
			}
			else if(spot.equals("c")) {
				boolean placedSeat = false;
				for(int i = 0; i < economy.length; i++) {
					while(!placedSeat) {
						for(int x = 0; x < economy[i].length; x++) {
							if(x == 1 || x == 4) {
								if(economy[i][x].equals("O")) {
									economy[i][x] = "x";
									placedSeat = true;
									break;
								}
							}
						}
					}
				}
			}
		}
		
	}
	public String showSeating(){
		String seat = "";
		for(int i = 0; i < firstClass.length; i++) {
			for(int x = 0; x < firstClass[i].length; x++) {
				System.out.print(firstClass[i][x]);
			}
			System.out.println();
		}
		System.out.println();
		for(int a = 0; a < economy.length; a++) {
			for(int b = 0; b < economy[a].length; b++) {
				System.out.print(economy[a][b]);;
			}
			System.out.println();
		}
		
		return seat;
	}
}
