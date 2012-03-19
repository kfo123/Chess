
import java.util.*;
public class Chess
{
	public static Scanner input;
	public static ChessBoard board;
	public static char side;
	
	public static void main (String args[]){
		board = new ChessBoard();
		input = new Scanner(System.in);
		side = 'w';
		while(!board.checkMate()){
			playTurn(side);
			System.out.println("ajlkdsjfla");
			switchSide();
			System.out.println(side);
			//not switching sides!!!!!!
		}
	}
	
	public static void playTurn(char side){
		board.display();
		if (side == 'w'){
			System.out.println("White's turn");}
		if (side == 'b'){
			System.out.println("Black's turn");}
		System.out.println("Piece to move (row,col)?");
		int r = input.nextInt();
		int c = input.nextInt();
		do{
			while (!board.hasPiece(new Location(r, c))){
				System.out.println("Enter a valid piece location");
				r = input.nextInt();
				c = input.nextInt();
			}
			while (board.getPiece(new Location(r, c)).getSide() != side){
				System.out.println("Choose your own piece");
				r = input.nextInt();
				c = input.nextInt();
			}
		}while (board.getPiece(new Location(r, c)).getSide() != side);
		Location loc1 = new Location(r, c);
		Piece curr = board.getPiece(loc1);
		board.displayMoves(curr);
		System.out.println("Where to move?");
		r = input.nextInt();
		c = input.nextInt();
		if (board.getPiece(new Location(r, c)) != null){
			while (board.getPiece(new Location(r, c)).getSide() == side){
				System.out.println("Pick a valid location");
				r = input.nextInt();
				c = input.nextInt();
			}
		}
		Location loc2 = new Location(r, c);
		board.movePiece(loc1, loc2, side);
		board.checkBoard();
	}
	
	public static void switchSide(){
		if (side == 'w'){
			side = 'b';}
		if (side == 'b'){
			side = 'w';}
		System.out.println("ajsdkfl;sa");
	}
}