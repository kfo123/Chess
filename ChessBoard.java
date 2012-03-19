import java.util.*;
public class ChessBoard extends Board
{
	private ArrayList<Piece> lostWhite;
	private ArrayList<Piece> lostBlack;
	public ChessBoard(){
		super();
		lostWhite = new ArrayList<Piece>();
		lostBlack = new ArrayList<Piece>();
	}
	
	public void startGrid(){
		startBlack();
		startWhite();
	}
	
	public void startBlack(){
		/*
		grid[0][0] = new Rook('b', 0, 0);
		grid[0][7] = new Rook('b', 0, 7);
		grid[0][1] = new Knight('b', 0, 1);
		grid[0][6] = new Knight('b', 0, 6);
		grid[0][2] = new Bishop('b', 0, 2);
		grid[0][5] = new Bishop('b', 0, 5);
		grid[0][3] = new King('b', 0, 3);
		grid[0][4] = new Queen('b', 0, 4);
		for (int x = 0; x < 8; x++){
			grid[1][x] = new Pawn('b', 0, x);}
		*/
		place(new Rook('b', 0, 0), new Location(0, 0));
		place(new Rook('b', 0, 7), new Location(0, 7));
		place(new Knight('b', 0, 1), new Location(0, 1));
		place(new Knight('b', 0, 6), new Location(0, 6));
		place(new Bishop('b', 0, 2), new Location(0, 2));
		place(new Bishop('b', 0, 5), new Location(0, 5));
		place(new King('b', 0, 3), new Location(0, 3));
		place(new Queen('b', 0, 4), new Location(0, 4));
		for (int x = 0; x < 8; x++){
			place(new Pawn('b', 1, x), new Location(1, x));}
	}
	
	public void startWhite(){
		/*
		grid[7][0] = new Rook('w', 0, 0);
		grid[7][7] = new Rook('w', 0, 7);
		grid[7][1] = new Knight('w', 0, 1);
		grid[7][6] = new Knight('w', 0, 6);
		grid[7][2] = new Bishop('w', 0, 2);
		grid[7][5] = new Bishop('w', 0, 5);
		grid[7][3] = new King('w', 0, 3);
		grid[7][4] = new Queen('w', 0, 4);
		for (int x = 0; x < 8; x++){
			grid[6][x] = new Pawn('w', 0, x);}
		*/
		place(new Rook('w', 7, 0), new Location(7, 0));
		place(new Rook('w', 7, 7), new Location(7, 7));
		place(new Knight('w', 7, 1), new Location(7, 1));
		place(new Knight('w', 7, 6), new Location(7, 6));
		place(new Bishop('w', 7, 2), new Location(7, 2));
		place(new Bishop('w', 7, 5), new Location(7, 5));
		place(new King('w', 7, 3), new Location(7, 3));
		place(new Queen('w', 7, 4), new Location(7, 4));
		for (int x = 0; x < 8; x++){
			place(new Pawn('w', 6, x), new Location(6, x));}
	}
	
	public void displayMoves(Piece piece){
		ArrayList<Location> moves = piece.getMoves();
		System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7");
		for (int x = 0; x < 8; x++){
			System.out.print(x + "\t");
			for (int y = 0; y < 8; y++){
				if (grid[x][y] == null){
					boolean bol = false;
					for (Location loc : moves){
						if (x == loc.getRow() && y == loc.getCol()){
							System.out.print("x\t");
							bol = true;
							}
					}
					if (bol == false){
						System.out.printf(".\t");}
				}
				else{
					for (Location loc : moves){
						if (x == loc.getRow() && y == loc.getCol()){
							System.out.print("x");}
					}
					System.out.printf("%s\t", grid[x][y]);}
				}
			System.out.println();
		}
	}
	
	public void movePiece(Location loc1, Location loc2, char side){
		if (side == 'w' && getPiece(loc2) != null){
			lostWhite.add(remove(loc2));}
		if (side == 'b' && getPiece(loc2) != null){
			lostBlack.add(remove(loc2));}
		place(remove(loc1), loc2);
	}
	
	public String checkBoard(){
		if (checkCheck()){
			if (checkMate()){
				return "checkmate";}
			return "check";}
		return null;
	}
	
	public boolean checkCheck(){
		return false;
	}
	
	public boolean checkMate(){
		return false;
	}
}