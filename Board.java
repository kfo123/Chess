public abstract class Board
{
	protected Piece grid[][];
	public Board(){
		grid = new Piece[8][8];
		startGrid();
	}
	
	public abstract void startGrid();
	
	public Piece getPiece(Location loc){
		return grid[loc.getRow()][loc.getCol()];}
	
	public void place(Piece p, Location loc){
		grid[loc.getRow()][loc.getCol()] = p;}
	
	public void display(){
		System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7");
		for (int x = 0; x < 8; x++){
			System.out.print(x + "\t");
			for (int y = 0; y < 8; y++){
				if (grid[x][y] == null){
					System.out.printf(".\t");}
				else{
					System.out.printf("%s\t", grid[x][y]);}
				}
			System.out.println();
		}
	}
	
	public boolean validLoc(Location loc){
		if (loc.getRow() >= 0 || loc.getRow() <= 7 || loc.getCol() >= 0 || loc.getCol() <= 7){
			if (grid[loc.getRow()][loc.getCol()] != null){
				return true;}
			else{
				return false;}
		}
		else{
			return false;}
	}
}