
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
					while(!placedSeat) {
						for(int i = 0; i < firstClass.length; i++) {
						
							for(int x = 0; x < firstClass[i].length; x++) {
								if(x == 0 || x == 3) {
									if(firstClass[i][x].equals("O") && !placedSeat) {
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
					while(!placedSeat) {
						for(int i = 0; i < firstClass.length; i++) {
						
							for(int x = 0; x < firstClass[i].length; x++) {
								if(x == 1 || x == 2) {
									if(firstClass[i][x].equals("O") && !placedSeat) {
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
				do {
					for(int i = 0; i < firstClass.length; i++) {
						for(int x = 0; x < firstClass[i].length; x++) {
							if(x == 0 || x == 2) {
								if(firstClass[i][x].equals("O") && firstClass[i][x+1].equals("O") && !placedSeat) {
									firstClass[i][x] = "x";
									firstClass[i][x+1] = "x";
									placedSeat = true;
									break;
								}
							}
						}
					}
				}
				while(!placedSeat);
			}
		}
		else if(clas.equals("economy")) {
			if(pass == 1) {
				if(spot.equals("w")) {
					boolean placedSeat = false;
					while(!placedSeat) {
						for(int i = 0; i < economy.length; i++) {					
							for(int x = 0; x < economy[i].length; x++) {
								if(x == 0 || x == 5) {
									if(economy[i][x].equals("O") && !placedSeat) {
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
					while(!placedSeat) {
						for(int i = 0; i < economy.length; i++) {
							for(int x = 0; x < economy[i].length; x++) {
								if(x == 2 || x == 3) {
									if(economy[i][x].equals("O") && !placedSeat) {
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
					while(!placedSeat) {
						for(int i = 0; i < economy.length; i++) {
							for(int x = 0; x < economy[i].length; x++) {
								if(x == 1 || x == 4) {
									if(economy[i][x].equals("O") && !placedSeat) {
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
			else if(pass == 2) {
				boolean placedSeat = false;
				if(spot.equals("a")) {
					while(!placedSeat) {
						for(int i = 0; i < economy.length; i++) {
							for(int x = 0; x < economy[i].length; x++) {
								if(x == 1 || x == 3) {
									if(economy[i][x].equals("O") && economy[i][x+1].equals("O") && !placedSeat) {
										economy[i][x] = "x";
										economy[i][x+1] = "x";
										placedSeat = true;
										break;
									}
								}
							}
						}
					}
				}
				if(spot.equals("w")) {
					while(!placedSeat) {
						for(int i = 0; i < economy.length; i++) {
							for(int x = 0; x < economy[i].length; x++) {
								if(x == 0 || x == 4) {
									if(economy[i][x].equals("O") && economy[i][x+1].equals("O") && !placedSeat) {
										economy[i][x] = "x";
										economy[i][x+1] = "x";
										placedSeat = true;
										break;
									}
								}
							}
						}
					}
				}
				if(spot.equals("c")) {
					while(!placedSeat) {
						for(int i = 0; i < economy.length; i++) {
							for(int x = 0; x < economy[i].length; x++) {
								if(economy[i][x].equals("O") && economy[i][x+1].equals("O") && !placedSeat) {
									economy[i][x] = "x";
									economy[i][x+1] = "x";
									placedSeat = true;
									break;
								}
							}
						}
					}
				}
			}
			else if(pass == 3) {
				boolean placedSeat = false;
				while(!placedSeat) {
					for(int i = 0; i < economy.length; i++) {
						for(int x = 0; x < economy[i].length; x++) {
							if(x == 0 || x == 3) {
								if(economy[i][x].equals("O") && economy[i][x+1].equals("O") && economy[i][x+2].equals("O") && !placedSeat) {
									economy[i][x] = "x";
									economy[i][x+1] = "x";
									economy[i][x+2] = "x";
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
	public String[][] getFirst(){
		return firstClass;
	}
	public String[][] getEconomy(){
		return economy;
	}
}
