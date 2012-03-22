import java.util.*;
public class King extends Piece
{
	public King(char s, int r, int c){
		super(s, r, c);}
		
	public String toString(){
		return side + "K";
	}
	
	public ArrayList<Location> getMoves(){
		ArrayList<Location> moves = new ArrayList<Location>();
		moves.add(new Location(loc.getRow(), loc.getCol() + 1));
		moves.add(new Location(loc.getRow(), loc.getCol() - 1));
		moves.add(new Location(loc.getRow() + 1, loc.getCol()));
		moves.add(new Location(loc.getRow() - 1, loc.getCol()));
		moves.add(new Location(loc.getRow() + 1, loc.getCol() + 1));
		moves.add(new Location(loc.getRow() + 1, loc.getCol() - 1));
		moves.add(new Location(loc.getRow() - 1, loc.getCol() + 1));
		moves.add(new Location(loc.getRow() - 1, loc.getCol() - 1));
		return moves;
	}
}