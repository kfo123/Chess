public abstract class Board
{
	protected Piece grid[][];
	public Board(){
		grid = new Piece[8][8];
		startGrid();
	}
	
	public abstract void startGrid();
	
	public Piece getPiece(Location loc){
		return grid[loc.getY()][loc.getX()];}
	
	public void display(){
		System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7");
		for (int x = 0; x < 8; x++){
			System.out.print(x + "\t");
			for (int y = 0; y < 8; y++){
				if (grid[x][y] == null){
					System.out.printf("x\t");}
				else{
					System.out.printf("%s\t", grid[x][y]);}
				}
			System.out.println();
		}
	}
}