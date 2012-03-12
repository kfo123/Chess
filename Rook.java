import java.util.*;
public class Rook extends Piece
{
	public Rook(char s, int r, int c){
		super(s, r, c);}
	
	public String toString(){
		return side + "R";
	}
	
	public ArrayList<Location> getMoves(){
		ArrayList<Location> moves = new ArrayList<Location>();
		for (int x = 1; x < 8; x++){
			moves.add(new Location(loc.getRow(), loc.getCol() + x));
			moves.add(new Location(loc.getRow(), loc.getCol() - x));
			moves.add(new Location(loc.getRow() + x, loc.getCol()));
			moves.add(new Location(loc.getRow() - x, loc.getCol()));
		}
		return moves;
	}
}