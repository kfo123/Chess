public class ChessBoard extends Board
{
	public ChessBoard(){
		super();
	}
	
	public void startGrid(){
		startBlack();
		startWhite();
	}
	
	public void startBlack(){
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
	}
	
	public void startWhite(){
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
	}
}