import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		char board[] = {' ','|',' ','|',' ',
						'-','+','-','+','-',
						' ','|',' ','|',' ',
						'-','+','-','+','-',
						' ','|',' ','|',' '};
		System.out.println("Tutorial: first enter the horizontal row number then the vertical row number");
		printboard(board);
		makemove();
		
	}
	public static void printboard(char[] board) {
		int chNum = 0;
		int rowint = 0;
		while(chNum!=25) {
			
			if(rowint==5) {
				System.out.println();
				rowint=0;
			}
			System.out.print(board[chNum]);
			chNum++;
			rowint++;
		}
	}
	public static void makemove() {
		Scanner scan = new Scanner(System.in);
	}
}
