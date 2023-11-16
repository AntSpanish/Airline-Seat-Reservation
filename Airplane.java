
public class Airplane {
String[][] firstClass = new String[5][4];
String[][] economy = new String[16][6];

	public Airplane() {
		for(int i = 0; i < firstClass.length; i++) {
			for(int x = 0; x < firstClass[i].length; x++) {
				firstClass[i][x] = "x";
			}
		}
		
		for(int i = 0; i < economy.length; i++) {
			for(int x = 0; x < economy[i].length; x++) {
				economy[i][x] = "x";
			}
		}
	
	}
	public void addSeat() {
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
