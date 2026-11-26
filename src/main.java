import java.util.Scanner;

public class main {
	
	static int turn = 0;
	static boolean keepgame = true;
	static char turnname = 'X';
	
	public static void main(String[] args) {
		char board[] = {' ','|',' ','|',' ',
						'-','+','-','+','-',
						' ','|',' ','|',' ',
						'-','+','-','+','-',
						' ','|',' ','|',' '};
		System.out.println("Tutorial: Enter the number of space you want to use (top left-1, bottom right-9)");
		printboard(board);
		while(wincheck(board)) {
			makemove(board);
			printboard(board);
		}
		
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
		System.out.println();
	}
	
	public static void makemove(char[] board) {

		Scanner scan = new Scanner(System.in);
		String printturn = "fih";
		if(turn==0) {
			printturn = "X";
		}
		else {
			printturn = "O";
		}
		System.out.println("Make your move, "+printturn);
		int movenum = scan.nextInt();
//		-----move-numbar/\------------------------------------
		switch(movenum) {
		case 1: if(board[0]=='X' || board[0]=='O'){makemove(board);} else { if(turn==0) {turnname='X'; turn=1;} else if(turn==1){turnname='O'; turn=0;} board[0]=turnname;}
		break;
		case 2: if(board[2]=='X' || board[2]=='O'){makemove(board);} else { if(turn==0) {turnname='X'; turn=1;} else if(turn==1){turnname='O'; turn=0;} board[2]=turnname;}
		break;
		case 3: if(board[4]=='X' || board[4]=='O'){makemove(board);} else { if(turn==0) {turnname='X'; turn=1;} else if(turn==1){turnname='O'; turn=0;} board[4]=turnname;}
		break;
		case 4: if(board[10]=='X' || board[10]=='O'){makemove(board);} else { if(turn==0) {turnname='X'; turn=1;} else if(turn==1){turnname='O'; turn=0;} board[10]=turnname;}
		break;
		case 5: if(board[12]=='X' || board[12]=='O'){makemove(board);} else { if(turn==0) {turnname='X'; turn=1;} else if(turn==1){turnname='O'; turn=0;} board[12]=turnname;}
		break;
		case 6: if(board[14]=='X' || board[14]=='O'){makemove(board);} else { if(turn==0) {turnname='X'; turn=1;} else if(turn==1){turnname='O'; turn=0;} board[14]=turnname;}
		break;
		case 7: if(board[20]=='X' || board[20]=='O'){makemove(board);} else { if(turn==0) {turnname='X'; turn=1;} else if(turn==1){turnname='O'; turn=0;} board[20]=turnname;}
		break;
		case 8: if(board[22]=='X' || board[22]=='O'){makemove(board);} else { if(turn==0) {turnname='X'; turn=1;} else if(turn==1){turnname='O'; turn=0;} board[22]=turnname;}
		break;
		case 9: if(board[24]=='X' || board[24]=='O'){makemove(board);} else { if(turn==0) {turnname='X'; turn=1;} else if(turn==1){turnname='O'; turn=0;} board[24]=turnname;}
		break;
		}
	}

	public static boolean wincheck(char[] board) {
		
//		--- check\/
		if(board[0]=='X' && board[2]=='X' && board[4]=='X' || board[10]=='X' && board[12]=='X' && board[14]=='X' || board[20]=='X' && board[22]=='X' && board[24]=='X') {
			System.out.println("X won!");
			keepgame=false;
		}
		if(board[0]=='O' && board[2]=='O' && board[4]=='O' || board[10]=='O' && board[12]=='O' && board[14]=='O' || board[20]=='O' && board[22]=='O' && board[24]=='O') {
			System.out.println("O won!");
			keepgame=false;
		}
//		||| check\/
		if(board[0]=='X' && board[10]=='X' && board[20]=='X' || board[2]=='X' && board[12]=='X' && board[22]=='X' || board[4]=='X' && board[14]=='X' && board[24]=='X') {
			System.out.println("X won!");
			keepgame=false;
		}
		if(board[0]=='O' && board[10]=='O' && board[20]=='O' || board[2]=='O' && board[12]=='O' && board[22]=='O' || board[4]=='O' && board[14]=='O' && board[24]=='O') {
			System.out.println("O won!");
			keepgame=false;
		}
//		X check\/
		if(board[0]=='X' && board[12]=='X' && board[24]=='X' || board[4]=='X' && board[12]=='X' && board[20]=='X') {
			System.out.println("X won!");
			keepgame=false;
		}
		if(board[0]=='O' && board[12]=='O' && board[24]=='O' || board[4]=='O' && board[12]=='O' && board[20]=='O') {
			System.out.println("O won!");
			keepgame=false;
		}
		
		return keepgame;
	}

}












