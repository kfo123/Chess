public class Chess
{
	public static Scanner in;
	public static ChessBoard board;
	public static void main (String args[]){
		board = new ChessBoard();
		in = new Scanner(System.in);
		char side = w;
		do{
			playTurn(side);
			if (side == 'w'){
				side = 'b';}
			if (side == 'b'){
				side = 'w';}
		}while(!board.checkMate());
	}
	
	public static void playTurn(char side){
		board.display();
		System.out.println("Piece to move (row,col)?");
		int r = input.nextInt();
		int c = input.nextInt();
		while (!board.hasPiece(new Location(r, c)) && board.getPiece(new Location(r, c)).getSide() != side){
			System.out.println("Enter a valid piece location");
			int r = input.nextInt();
			int c = input.nextInt();
		}
		Piece curr = board.getPiece(new Location(r, c));
		board.displayMoves(curr);
		System.out.println("Where to move?");
		r = input.nextInt();
		c = input.nextInt();
		while (board.getPiece(new Location(r, c)).getSide() == side){
			System.out.println("Pick a valid location");
			r = input.nextInt();
			c = input.nextInt();
		}
		movePiece(loc1, loc2);
		board.checkBoard();
	}
}